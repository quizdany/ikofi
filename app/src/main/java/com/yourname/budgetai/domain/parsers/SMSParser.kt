package com.yourname.budgetai.domain.parsers

import com.yourname.budgetai.data.models.Transaction
import com.yourname.budgetai.data.models.TransactionType
import com.yourname.budgetai.data.models.MobileMoneyProvider
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.regex.Pattern

interface SMSParser {
    suspend fun parseSMS(smsText: String, timestamp: Date): Transaction?
}

class RegexSMSParser : SMSParser {

    override suspend fun parseSMS(smsText: String, timestamp: Date): Transaction? {
        return try {
            // RWF Mobile Money patterns
            if (smsText.contains("rwf", ignoreCase = true)) {
                parseRWF_SMS(smsText, timestamp)
            }
            // MTN Mobile Money patterns (existing)
            else if (smsText.contains("MTN", ignoreCase = true)) {
                parseMTNSMS(smsText, timestamp)
            }
            // Airtel Money patterns (existing)
            else if (smsText.contains("Airtel", ignoreCase = true)) {
                parseAirtelSMS(smsText, timestamp)
            }
            else {
                null
            }
        } catch (e: Exception) {
            null
        }
    }

    private fun parseRWF_SMS(smsText: String, timestamp: Date): Transaction? {
        // RWF Credit pattern: "you have received 1000 rwf rom daniel kwizera (*******848) on your mobile money account at 2025-07-02 01:26.02"
        val creditPattern = Pattern.compile(
            "you have received (\\d+(?:\\.\\d{2})?) rwf rom (.+?) \\((.+?)\\) on your mobile money account at (\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}(?:\\.\\d{2})?)",
            Pattern.CASE_INSENSITIVE
        )

        // RWF Debit pattern: "for sendng \*165\*S\*1000rwf transfered to Claude (0785548575) frm 60123132 at 2025-07-01"
        val debitPattern = Pattern.compile(
            "for sendng \\*165\\*S\\*(\\d+(?:\\.\\d{2})?)rwf transfered to (.+?) \\((.+?)\\) frm (.+?) at (\\d{4}-\\d{2}-\\d{2})",
            Pattern.CASE_INSENSITIVE
        )

        // Try credit pattern first
        var matcher = creditPattern.matcher(smsText)
        if (matcher.find()) {
            val amount = matcher.group(1)?.toDoubleOrNull() ?: return null
            val senderName = matcher.group(2) as String?
            val dateString = matcher.group(4)
            val parsedDate = SimpleDateFormat("yyyy-MM-dd HH:mm.ss", Locale.getDefault()).parse(dateString)

            return Transaction(
                amount = amount,
                transactionType = TransactionType.CREDIT,
                sender = senderName,
                receiver = null,
                transactionId = null,
                description = smsText,
                timestamp = parsedDate ?: timestamp,
                provider = MobileMoneyProvider.UNKNOWN // Assuming UNKNOWN for now, can be refined
            )
        }

        // Try debit pattern
        matcher = debitPattern.matcher(smsText)
        if (matcher.find()) {
            val amount = matcher.group(1)?.toDoubleOrNull() ?: return null
            val receiverName = matcher.group(2) as String?
            val dateString = matcher.group(5)
            val parsedDate = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(dateString)

            return Transaction(
                amount = amount,
                transactionType = TransactionType.DEBIT,
                sender = null,
                receiver = receiverName,
                transactionId = null,
                description = smsText,
                timestamp = parsedDate ?: timestamp,
                provider = MobileMoneyProvider.UNKNOWN // Assuming UNKNOWN for now, can be refined
            )
        }

        return null
    }

    private fun parseMTNSMS(smsText: String, timestamp: Date): Transaction? {
        // MTN Credit pattern: "You have received GHS 50.00 from 233244123456. Your balance is GHS 150.00"
        val creditPattern = Pattern.compile(
            "You have received GHS (\\d+(?:\\.\\d{2})?) from (\\d+)\\. Your balance is GHS (\\d+(?:\\.\\d{2})?)",
            Pattern.CASE_INSENSITIVE
        )

        // MTN Debit pattern: "You have sent GHS 25.00 to 233244123456. Your balance is GHS 125.00"
        val debitPattern = Pattern.compile(
            "You have sent GHS (\\d+(?:\\.\\d{2})?) to (\\d+)\\. Your balance is GHS (\\d+(?:\\.\\d{2})?)",
            Pattern.CASE_INSENSITIVE
        )

        // Try credit pattern first
        var matcher = creditPattern.matcher(smsText)
        if (matcher.find()) {
            val amount = matcher.group(1)?.toDoubleOrNull() ?: return null
            val sender = matcher.group(2) as String?
            return Transaction(
                amount = amount,
                transactionType = TransactionType.CREDIT,
                sender = sender,
                receiver = null,
                transactionId = null,
                description = smsText,
                timestamp = timestamp,
                provider = MobileMoneyProvider.MTN
            )
        }

        // Try debit pattern
        matcher = debitPattern.matcher(smsText)
        if (matcher.find()) {
            val amount = matcher.group(1)?.toDoubleOrNull() ?: return null
            val receiver = matcher.group(2) as String?
            return Transaction(
                amount = amount,
                transactionType = TransactionType.DEBIT,
                sender = null,
                receiver = receiver,
                transactionId = null,
                description = smsText,
                timestamp = timestamp,
                provider = MobileMoneyProvider.MTN
            )
        }

        return null
    }

    private fun parseAirtelSMS(smsText: String, timestamp: Date): Transaction? {
        // Airtel patterns (similar to MTN but with different wording)
        val creditPattern = Pattern.compile(
            "You received GHS (\\d+(?:\\.\\d{2})?) from (\\d+)\\. Balance: GHS (\\d+(?:\\.\\d{2})?)",
            Pattern.CASE_INSENSITIVE
        )

        val debitPattern = Pattern.compile(
            "You sent GHS (\\d+(?:\\.\\d{2})?) to (\\d+)\\. Balance: GHS (\\d+(?:\\.\\d{2})?)",
            Pattern.CASE_INSENSITIVE
        )

        // Try credit pattern first
        var matcher = creditPattern.matcher(smsText)
        if (matcher.find()) {
            val amount = matcher.group(1)?.toDoubleOrNull() ?: return null
            val sender = matcher.group(2) as String?
            return Transaction(
                amount = amount,
                transactionType = TransactionType.CREDIT,
                sender = sender,
                receiver = null,
                transactionId = null,
                description = smsText,
                timestamp = timestamp,
                provider = MobileMoneyProvider.AIRTEL
            )
        }

        // Try debit pattern
        matcher = debitPattern.matcher(smsText)
        if (matcher.find()) {
            val amount = matcher.group(1)?.toDoubleOrNull() ?: return null
            val receiver = matcher.group(2) as String?
            return Transaction(
                amount = amount,
                transactionType = TransactionType.DEBIT,
                sender = null,
                receiver = receiver,
                transactionId = null,
                description = smsText,
                timestamp = timestamp,
                provider = MobileMoneyProvider.AIRTEL
            )
        }

        return null
    }
}