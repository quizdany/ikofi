package com.yourname.budgetai.ui.budget

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yourname.budgetai.data.models.Budget
import java.util.*

@Composable
fun BudgetListScreen(viewModel: BudgetViewModel) {
    val budgets by viewModel.budgets.collectAsState()
    var showDialog by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Budgets", style = MaterialTheme.typography.headlineMedium)
            Button(onClick = { showDialog = true }) {
                Text("Add Budget")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(budgets) { budget ->
                BudgetItem(budget)
            }
        }
    }
    if (showDialog) {
        AddBudgetDialog(
            onAdd = {
                viewModel.addBudget(it)
                showDialog = false
            },
            onDismiss = { showDialog = false }
        )
    }
}

@Composable
fun BudgetItem(budget: Budget) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(budget.name, style = MaterialTheme.typography.titleMedium)
            Text("${budget.startDate} - ${budget.endDate}", style = MaterialTheme.typography.bodySmall)
            Text("Total: $${budget.totalAmount}", style = MaterialTheme.typography.bodyMedium)
            if (!budget.notes.isNullOrBlank()) {
                Text(budget.notes ?: "", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

@Composable
fun AddBudgetDialog(onAdd: (Budget) -> Unit, onDismiss: () -> Unit) {
    var name by remember { mutableStateOf("") }
    var amount by remember { mutableStateOf("") }
    var notes by remember { mutableStateOf("") }
    // For simplicity, use today as start and end date
    val today = Date()
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Add Budget") },
        text = {
            Column {
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Name") },
                    modifier = Modifier.fillMaxWidth()
                )
                OutlinedTextField(
                    value = amount,
                    onValueChange = { amount = it },
                    label = { Text("Total Amount") },
                    modifier = Modifier.fillMaxWidth()
                )
                OutlinedTextField(
                    value = notes,
                    onValueChange = { notes = it },
                    label = { Text("Notes (optional)") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    val amt = amount.toDoubleOrNull() ?: 0.0
                    if (name.isNotBlank() && amt > 0) {
                        onAdd(
                            Budget(
                                name = name,
                                startDate = today,
                                endDate = today,
                                totalAmount = amt,
                                notes = notes.ifBlank { null }
                            )
                        )
                    }
                }
            ) { Text("Add") }
        },
        dismissButton = {
            OutlinedButton(onClick = onDismiss) { Text("Cancel") }
        }
    )
} 