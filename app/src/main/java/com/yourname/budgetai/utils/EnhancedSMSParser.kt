package com.yourname.budgetai.utils

import com.yourname.budgetai.data.models.Transaction
import com.yourname.budgetai.data.models.TransactionType
import com.yourname.budgetai.data.models.MobileMoneyProvider
import java.util.Date
import java.util.regex.Pattern

object EnhancedSMSParser {
    
    private val providerPatterns = mapOf(
        MobileMoneyProvider.MTN to listOf(
            // MTN Mobile Money patterns
            Pattern.compile("(?i)mtn.*?you have received.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?from\\s*([\\w\\s]+?)\\s*ref", Pattern.DOTALL),
            Pattern.compile("(?i)mtn.*?you have sent.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?to\\s*([\\w\\s]+?)\\s*ref", Pattern.DOTALL),
            Pattern.compile("(?i)mtn.*?balance.*?ghc?\\s*(\\d+(?:\\.\\d{2})?)", Pattern.DOTALL),
            Pattern.compile("(?i)transaction.*?successful.*?amount.*?ghc?\\s*(\\d+(?:\\.\\d{2})?)", Pattern.DOTALL)
        ),
        
        MobileMoneyProvider.VODAFONE to listOf(
            // Vodafone Cash patterns
            Pattern.compile("(?i)vodafone.*?received.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?from\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL),
            Pattern.compile("(?i)vodafone.*?sent.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?to\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL),
            Pattern.compile("(?i)v-cash.*?received.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?from\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL),
            Pattern.compile("(?i)v-cash.*?sent.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?to\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL)
        ),
        
        MobileMoneyProvider.TIGO to listOf(
            // Tigo Cash patterns
            Pattern.compile("(?i)tigo.*?received.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?from\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL),
            Pattern.compile("(?i)tigo.*?sent.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?to\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL),
            Pattern.compile("(?i)tigocash.*?received.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?from\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL)
        ),
        
        MobileMoneyProvider.AIRTEL to listOf(
            // Airtel Money patterns
            Pattern.compile("(?i)airtel.*?received.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?from\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL),
            Pattern.compile("(?i)airtel.*?sent.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?to\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL),
            Pattern.compile("(?i)airtelmoney.*?received.*?ghc?\\s*(\\d+(?:\\.\\d{2})?).*?from\\s*([\\w\\s]+?)\\s*", Pattern.DOTALL)
        )
    )
    
    private val balancePatterns = listOf(
        Pattern.compile("(?i)balance.*?ghc?\\s*(\\d+(?:\\.\\d{2})?)", Pattern.DOTALL),
        Pattern.compile("(?i)available.*?ghc?\\s*(\\d+(?:\\.\\d{2})?)", Pattern.DOTALL),
        Pattern.compile("(?i)current.*?balance.*?ghc?\\s*(\\d+(?:\\.\\d{2})?)", Pattern.DOTALL)
    )
    
    private val transactionIdPatterns = listOf(
        Pattern.compile("(?i)ref.*?([A-Z0-9]{6,15})", Pattern.DOTALL),
        Pattern.compile("(?i)transaction.*?id.*?([A-Z0-9]{6,15})", Pattern.DOTALL),
        Pattern.compile("(?i)txn.*?([A-Z0-9]{6,15})", Pattern.DOTALL)
    )
    
    data class ParsedSMS(
        val amount: Double?,
        val transactionType: TransactionType,
        val otherParty: String?,
        val transactionId: String?,
        val provider: MobileMoneyProvider?,
        val balance: Double?,
        val category: String?,
        val confidence: Float
    )
    
    fun parseAdvancedSMS(smsText: String, timestamp: Date): ParsedSMS? {
        val provider = detectProvider(smsText)
        val amount = extractAmount(smsText)
        val transactionType = detectTransactionType(smsText)
        val otherParty = extractOtherParty(smsText, transactionType)
        val transactionId = extractTransactionId(smsText)
        val balance = extractBalance(smsText)
        val category = categorizeTransaction(smsText, otherParty)
        val confidence = calculateConfidence(smsText, amount, transactionType, otherParty)
        
        return if (amount != null || balance != null) {
            ParsedSMS(
                amount = amount,
                transactionType = transactionType,
                otherParty = otherParty?.trim(),
                transactionId = transactionId,
                provider = provider,
                balance = balance,
                category = category,
                confidence = confidence
            )
        } else null
    }
    
    private fun detectProvider(smsText: String): MobileMoneyProvider? {
        return when {
            smsText.contains("mtn", ignoreCase = true) -> MobileMoneyProvider.MTN
            smsText.contains("vodafone", ignoreCase = true) || 
            smsText.contains("v-cash", ignoreCase = true) -> MobileMoneyProvider.VODAFONE
            smsText.contains("tigo", ignoreCase = true) || 
            smsText.contains("tigocash", ignoreCase = true) -> MobileMoneyProvider.TIGO
            smsText.contains("airtel", ignoreCase = true) -> MobileMoneyProvider.AIRTEL
            else -> null
        }
    }
    
    private fun extractAmount(smsText: String): Double? {
        val amountPatterns = listOf(
            Pattern.compile("(?i)ghc?\\s*(\\d+(?:\\.\\d{2})?)", Pattern.DOTALL),
            Pattern.compile("(?i)(\\d+(?:\\.\\d{2})?)\\s*ghc?", Pattern.DOTALL),
            Pattern.compile("(?i)amount.*?(\\d+(?:\\.\\d{2})?)", Pattern.DOTALL)
        )
        
        for (pattern in amountPatterns) {
            val matcher = pattern.matcher(smsText)
            if (matcher.find()) {
                return matcher.group(1)?.toDoubleOrNull()
            }
        }
        return null
    }
    
    private fun detectTransactionType(smsText: String): TransactionType {
        return when {
            smsText.contains("received", ignoreCase = true) ||
            smsText.contains("credited", ignoreCase = true) ||
            smsText.contains("deposit", ignoreCase = true) -> TransactionType.CREDIT
            
            smsText.contains("sent", ignoreCase = true) ||
            smsText.contains("debited", ignoreCase = true) ||
            smsText.contains("paid", ignoreCase = true) ||
            smsText.contains("withdrawal", ignoreCase = true) -> TransactionType.DEBIT
            
            else -> TransactionType.UNKNOWN
        }
    }
    
    private fun extractOtherParty(smsText: String, transactionType: TransactionType): String? {
        val patterns = when (transactionType) {
            TransactionType.CREDIT -> listOf(
                Pattern.compile("(?i)from\\s+([\\w\\s]+?)\\s+(?:ref|transaction|txn|\\.|$)", Pattern.DOTALL),
                Pattern.compile("(?i)received.*?from\\s+([\\w\\s]+?)\\s+", Pattern.DOTALL)
            )
            TransactionType.DEBIT -> listOf(
                Pattern.compile("(?i)to\\s+([\\w\\s]+?)\\s+(?:ref|transaction|txn|\\.|$)", Pattern.DOTALL),
                Pattern.compile("(?i)sent.*?to\\s+([\\w\\s]+?)\\s+", Pattern.DOTALL)
            )
            else -> emptyList()
        }
        
        for (pattern in patterns) {
            val matcher = pattern.matcher(smsText)
            if (matcher.find()) {
                return matcher.group(1)?.trim()
            }
        }
        return null
    }
    
    private fun extractTransactionId(smsText: String): String? {
        for (pattern in transactionIdPatterns) {
            val matcher = pattern.matcher(smsText)
            if (matcher.find()) {
                return matcher.group(1)
            }
        }
        return null
    }
    
    private fun extractBalance(smsText: String): Double? {
        for (pattern in balancePatterns) {
            val matcher = pattern.matcher(smsText)
            if (matcher.find()) {
                return matcher.group(1)?.toDoubleOrNull()
            }
        }
        return null
    }
    
    private fun categorizeTransaction(smsText: String, otherParty: String?): String? {
        val text = "$smsText ${otherParty ?: ""}".lowercase()
        
        return when {
            // Food & Dining
            text.contains("restaurant") || text.contains("food") || 
            text.contains("kitchen") || text.contains("cafe") || 
            text.contains("eatery") || text.contains("pizza") ||
            text.contains("kfc") || text.contains("dominos") -> "Food & Dining"
            
            // Transportation
            text.contains("uber") || text.contains("bolt") || 
            text.contains("taxi") || text.contains("transport") ||
            text.contains("bus") || text.contains("fuel") ||
            text.contains("filling") || text.contains("petrol") -> "Transportation"
            
            // Utilities & Bills
            text.contains("electricity") || text.contains("water") ||
            text.contains("internet") || text.contains("phone") ||
            text.contains("bill") || text.contains("ecg") ||
            text.contains("telecom") || text.contains("utility") -> "Bills & Utilities"
            
            // Shopping
            text.contains("shop") || text.contains("store") ||
            text.contains("mart") || text.contains("mall") ||
            text.contains("retail") || text.contains("purchase") -> "Shopping"
            
            // Healthcare
            text.contains("hospital") || text.contains("clinic") ||
            text.contains("pharmacy") || text.contains("doctor") ||
            text.contains("medical") || text.contains("health") -> "Healthcare"
            
            // Education
            text.contains("school") || text.contains("university") ||
            text.contains("education") || text.contains("tuition") ||
            text.contains("fees") || text.contains("books") -> "Education"
            
            // Entertainment
            text.contains("cinema") || text.contains("movie") ||
            text.contains("game") || text.contains("club") ||
            text.contains("bar") || text.contains("entertainment") -> "Entertainment"
            
            // ATM/Cash
            text.contains("atm") || text.contains("cash") ||
            text.contains("withdrawal") -> "ATM & Cash"
            
            else -> "Other"
        }
    }
    
    private fun calculateConfidence(
        smsText: String, 
        amount: Double?, 
        transactionType: TransactionType,
        otherParty: String?
    ): Float {
        var confidence = 0f
        
        // Base confidence if it looks like a mobile money SMS
        if (SMSUtils.isMobileMoneySMS(smsText)) confidence += 0.3f
        
        // Amount extracted
        if (amount != null) confidence += 0.3f
        
        // Transaction type identified
        if (transactionType != TransactionType.UNKNOWN) confidence += 0.2f
        
        // Other party identified
        if (!otherParty.isNullOrBlank()) confidence += 0.1f
        
        // Provider identified
        if (detectProvider(smsText) != null) confidence += 0.1f
        
        return confidence.coerceAtMost(1.0f)
    }
    
    fun isDuplicate(newSMS: String, existingTransactions: List<Transaction>): Boolean {
        val newTransactionId = extractTransactionId(newSMS)
        
        return if (newTransactionId != null) {
            existingTransactions.any { it.transactionId == newTransactionId }
        } else {
            // Fallback: check for similar SMS with same timestamp (within 1 minute)
            val newAmount = extractAmount(newSMS)
            val newType = detectTransactionType(newSMS)
            
            existingTransactions.any { transaction ->
                transaction.amount == newAmount &&
                transaction.transactionType == newType &&
                kotlin.math.abs(transaction.timestamp.time - System.currentTimeMillis()) < 60000
            }
        }
    }
}
