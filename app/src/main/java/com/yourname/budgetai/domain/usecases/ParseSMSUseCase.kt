package com.yourname.budgetai.domain.usecases

import com.yourname.budgetai.data.database.TransactionDao
import com.yourname.budgetai.domain.parsers.SMSParser
import java.util.Date
import javax.inject.Inject

class ParseSMSUseCase @Inject constructor(
    private val smsParser: SMSParser,
    private val transactionDao: TransactionDao
) {
    
    suspend fun execute(smsText: String, timestamp: Date): Boolean {
        return try {
            val transaction = smsParser.parseSMS(smsText, timestamp)
            if (transaction != null) {
                transactionDao.insertTransaction(transaction)
                true
            } else {
                false
            }
        } catch (e: Exception) {
            false
        }
    }
    
    suspend fun parseAndStoreMultipleSMS(smsList: List<Pair<String, Date>>): Int {
        var successCount = 0
        for ((smsText, timestamp) in smsList) {
            if (execute(smsText, timestamp)) {
                successCount++
            }
        }
        return successCount
    }
} 