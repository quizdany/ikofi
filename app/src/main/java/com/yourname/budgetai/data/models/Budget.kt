package com.yourname.budgetai.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import java.util.Date

enum class BudgetCycle {
    WEEKLY, MONTHLY, QUARTERLY, YEARLY
}

enum class BudgetStatus {
    ACTIVE, PAUSED, COMPLETED, EXCEEDED
}

@Entity(tableName = "budgets")
data class Budget(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val startDate: Date,
    val endDate: Date,
    val totalAmount: Double,
    val spentAmount: Double = 0.0,
    val cycle: BudgetCycle = BudgetCycle.MONTHLY,
    val status: BudgetStatus = BudgetStatus.ACTIVE,
    val categoryIds: List<Long> = emptyList(),
    val alertThreshold: Double = 0.8, // Alert at 80% of budget
    val notes: String? = null,
    val createdAt: Date = Date(),
    val updatedAt: Date = Date()
) {
    val remainingAmount: Double
        get() = totalAmount - spentAmount
    
    val progressPercentage: Double
        get() = if (totalAmount > 0) (spentAmount / totalAmount * 100).coerceAtMost(100.0) else 0.0
    
    val isOverBudget: Boolean
        get() = spentAmount > totalAmount
    
    val shouldAlert: Boolean
        get() = progressPercentage >= (alertThreshold * 100)
} 