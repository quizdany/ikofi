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
    val description: String, // Renamed from smsText
    val timestamp: Date,
    val category: String? = null,
    val isProcessed: Boolean = false,
    val createdAt: Date = Date(),
    val provider: MobileMoneyProvider = MobileMoneyProvider.UNKNOWN,
    val balance: Double? = null,
    val confidence: Float = 0.0f,
    val isAutomatic: Boolean = false,
    val needsReview: Boolean = false
)