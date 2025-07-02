package com.yourname.budgetai.data.repository

import com.yourname.budgetai.data.database.BudgetDao
import com.yourname.budgetai.data.models.Budget
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class BudgetRepository @Inject constructor(private val budgetDao: BudgetDao) {
    fun getAllBudgets(): Flow<List<Budget>> = budgetDao.getAllBudgets()
    suspend fun insertBudget(budget: Budget): Long = budgetDao.insertBudget(budget)
    suspend fun updateBudget(budget: Budget) = budgetDao.updateBudget(budget)
    suspend fun deleteBudget(budget: Budget) = budgetDao.deleteBudget(budget)
    suspend fun getBudgetById(id: Long): Budget? = budgetDao.getBudgetById(id)
} 