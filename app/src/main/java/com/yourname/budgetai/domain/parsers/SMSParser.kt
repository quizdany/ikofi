package com.yourname.budgetai.domain.parsers

import com.yourname.budgetai.data.models.Transaction
import com.yourname.budgetai.data.models.TransactionType
import java.util.Date
import java.util.regex.Pattern

interface SMSParser {
    suspend fun parseSMS(smsText: String, timestamp: Date): Transaction?
}

class RegexSMSParser : SMSParser {
    
    override suspend fun parseSMS(smsText: String, timestamp: Date): Transaction? {
        return try {
            // MTN Mobile Money patterns
            if (smsText.contains("MTN", ignoreCase = true)) {
                parseMTNSMS(smsText, timestamp)
            }
            // Airtel Money patterns
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
            val sender = matcher.group(2)
            return Transaction(
                amount = amount,
                transactionType = TransactionType.CREDIT,
                sender = sender,
                receiver = null,
                transactionId = null,
                smsText = smsText,
                timestamp = timestamp
            )
        }
        
        // Try debit pattern
        matcher = debitPattern.matcher(smsText)
        if (matcher.find()) {
            val amount = matcher.group(1)?.toDoubleOrNull() ?: return null
            val receiver = matcher.group(2)
            return Transaction(
                amount = amount,
                transactionType = TransactionType.DEBIT,
                sender = null,
                receiver = receiver,
                transactionId = null,
                smsText = smsText,
                timestamp = timestamp
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
            val sender = matcher.group(2)
            return Transaction(
                amount = amount,
                transactionType = TransactionType.CREDIT,
                sender = sender,
                receiver = null,
                transactionId = null,
                smsText = smsText,
                timestamp = timestamp
            )
        }
        
        // Try debit pattern
        matcher = debitPattern.matcher(smsText)
        if (matcher.find()) {
            val amount = matcher.group(1)?.toDoubleOrNull() ?: return null
            val receiver = matcher.group(2)
            return Transaction(
                amount = amount,
                transactionType = TransactionType.DEBIT,
                sender = null,
                receiver = receiver,
                transactionId = null,
                smsText = smsText,
                timestamp = timestamp
            )
        }
        
        return null
    }
} 