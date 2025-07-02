package com.yourname.budgetai.data.database

import androidx.room.*
import com.yourname.budgetai.data.models.Budget
import kotlinx.coroutines.flow.Flow

@Dao
interface BudgetDao {
    @Query("SELECT * FROM budgets ORDER BY startDate DESC")
    fun getAllBudgets(): Flow<List<Budget>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBudget(budget: Budget): Long

    @Update
    suspend fun updateBudget(budget: Budget)

    @Delete
    suspend fun deleteBudget(budget: Budget)

    @Query("SELECT * FROM budgets WHERE id = :id LIMIT 1")
    suspend fun getBudgetById(id: Long): Budget?
} 