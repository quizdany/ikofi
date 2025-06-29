package com.yourname.budgetai.data.database

import androidx.room.*
import com.yourname.budgetai.data.models.Transaction
import com.yourname.budgetai.data.models.TransactionType
import kotlinx.coroutines.flow.Flow

@Dao
interface TransactionDao {
    
    @Query("SELECT * FROM transactions ORDER BY timestamp DESC")
    fun getAllTransactions(): Flow<List<Transaction>>
    
    @Query("SELECT * FROM transactions WHERE transactionType = :type ORDER BY timestamp DESC")
    fun getTransactionsByType(type: TransactionType): Flow<List<Transaction>>
    
    @Query("SELECT SUM(amount) FROM transactions WHERE transactionType = :type")
    suspend fun getTotalByType(type: TransactionType): Double?
    
    @Query("SELECT * FROM transactions WHERE smsText LIKE '%' || :searchTerm || '%' ORDER BY timestamp DESC")
    fun searchTransactions(searchTerm: String): Flow<List<Transaction>>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaction(transaction: Transaction): Long
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransactions(transactions: List<Transaction>)
    
    @Update
    suspend fun updateTransaction(transaction: Transaction)
    
    @Delete
    suspend fun deleteTransaction(transaction: Transaction)
    
    @Query("DELETE FROM transactions")
    suspend fun deleteAllTransactions()
    
    @Query("SELECT * FROM transactions WHERE isProcessed = 0")
    suspend fun getUnprocessedTransactions(): List<Transaction>
    
    @Query("UPDATE transactions SET isProcessed = 1 WHERE id = :transactionId")
    suspend fun markAsProcessed(transactionId: Long)
} 