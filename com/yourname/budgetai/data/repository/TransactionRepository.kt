package com.yourname.budgetai.data.repository

import com.yourname.budgetai.data.database.TransactionDao
import com.yourname.budgetai.data.models.Transaction
import com.yourname.budgetai.data.models.TransactionType
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TransactionRepository @Inject constructor(
    private val transactionDao: TransactionDao
) {
    
    fun getAllTransactions(): Flow<List<Transaction>> {
        return transactionDao.getAllTransactions()
    }
    
    fun getTransactionsByType(type: TransactionType): Flow<List<Transaction>> {
        return transactionDao.getTransactionsByType(type)
    }
    
    suspend fun getTotalByType(type: TransactionType): Double {
        return transactionDao.getTotalByType(type) ?: 0.0
    }
    
    fun searchTransactions(searchTerm: String): Flow<List<Transaction>> {
        return transactionDao.searchTransactions(searchTerm)
    }
    
    suspend fun insertTransaction(transaction: Transaction): Long {
        return transactionDao.insertTransaction(transaction)
    }
    
    suspend fun insertTransactions(transactions: List<Transaction>) {
        transactionDao.insertTransactions(transactions)
    }
    
    suspend fun updateTransaction(transaction: Transaction) {
        transactionDao.updateTransaction(transaction)
    }
    
    suspend fun deleteTransaction(transaction: Transaction) {
        transactionDao.deleteTransaction(transaction)
    }
    
    suspend fun deleteAllTransactions() {
        transactionDao.deleteAllTransactions()
    }
    
    suspend fun getUnprocessedTransactions(): List<Transaction> {
        return transactionDao.getUnprocessedTransactions()
    }
    
    suspend fun markAsProcessed(transactionId: Long) {
        transactionDao.markAsProcessed(transactionId)
    }
    
    suspend fun getBalance(): Double {
        val credits = getTotalByType(TransactionType.CREDIT)
        val debits = getTotalByType(TransactionType.DEBIT)
        return credits - debits
    }
} 