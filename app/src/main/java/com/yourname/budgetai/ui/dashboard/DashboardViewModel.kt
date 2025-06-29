package com.yourname.budgetai.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yourname.budgetai.data.models.Transaction
import com.yourname.budgetai.data.models.TransactionType
import com.yourname.budgetai.data.repository.TransactionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val transactionRepository: TransactionRepository
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(DashboardUiState())
    val uiState: StateFlow<DashboardUiState> = _uiState
    
    init {
        loadDashboardData()
    }
    
    private fun loadDashboardData() {
        viewModelScope.launch {
            combine(
                transactionRepository.getAllTransactions(),
                transactionRepository.getTransactionsByType(TransactionType.CREDIT),
                transactionRepository.getTransactionsByType(TransactionType.DEBIT)
            ) { allTransactions, credits, debits ->
                val totalCredits = credits.sumOf { it.amount }
                val totalDebits = debits.sumOf { it.amount }
                val balance = totalCredits - totalDebits
                
                DashboardUiState(
                    balance = balance,
                    totalIncome = totalCredits,
                    totalExpenses = totalDebits,
                    recentTransactions = allTransactions.take(5),
                    isLoading = false
                )
            }.collect { state ->
                _uiState.value = state
            }
        }
    }
    
    fun refreshData() {
        _uiState.value = _uiState.value.copy(isLoading = true)
        loadDashboardData()
    }
}

data class DashboardUiState(
    val balance: Double = 0.0,
    val totalIncome: Double = 0.0,
    val totalExpenses: Double = 0.0,
    val recentTransactions: List<Transaction> = emptyList(),
    val isLoading: Boolean = true
) 