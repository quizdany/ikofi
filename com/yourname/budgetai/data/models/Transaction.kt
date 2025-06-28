package com.yourname.budgetai.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val amount: Double,
    val currency: String = "GHS",
    val transactionType: TransactionType,
    val sender: String?,
    val receiver: String?,
    val transactionId: String?,
    val smsText: String,
    val timestamp: Date,
    val category: String? = null,
    val isProcessed: Boolean = false,
    val createdAt: Date = Date()
)

enum class TransactionType {
    CREDIT,    // Money received
    DEBIT,     // Money sent
    UNKNOWN
} 