package com.yourname.budgetai.ui.budget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yourname.budgetai.data.TransactionStore
import com.yourname.budgetai.data.models.Transaction
import com.yourname.budgetai.data.models.TransactionType
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BudgetScreen() {
    val transactions = remember { mutableStateListOf<Transaction>().apply { addAll(TransactionStore.transactions) } }
    var showManualEntryDialog by remember { mutableStateOf(false) }

    val totalBalance = remember(transactions) {
        transactions.sumOf {
            if (it.transactionType == TransactionType.DEBIT) -it.amount else it.amount
        }
    }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { showManualEntryDialog = true }) {
                Icon(Icons.Filled.Add, "Add new transaction")
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(paddingValues)
        ) {
            // Header
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF2C5C3F))
                    .padding(top = 32.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Jan 2020",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text = "Edit",
                            color = Color.White,
                            fontSize = 16.sp,
                            modifier = Modifier
                                .background(Color.Transparent)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "$%.2f".format(totalBalance),
                        color = Color(0xFF2C5C3F),
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(Color(0xFFB6E2B6), shape = MaterialTheme.shapes.medium)
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                    )
                    Text(
                        text = "TO BE BUDGETED",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }
            // Transaction list
            LazyColumn(modifier = Modifier.fillMaxSize().padding(8.dp)) {
                items(transactions) { transaction ->
                    TransactionRow(transaction)
                }
            }
        }

        if (showManualEntryDialog) {
            ManualEntryDialog(
                onDismiss = { showManualEntryDialog = false },
                onConfirm = { date, description, amount, isExpense ->
                    val newTransaction = Transaction(
                        timestamp = date,
                        description = description,
                        amount = amount,
                        transactionType = if (isExpense) TransactionType.DEBIT else TransactionType.CREDIT,
                        sender = null,
                        receiver = null,
                        transactionId = null
                    )
                    TransactionStore.transactions.add(newTransaction)
                    transactions.add(newTransaction) // Update the mutableStateListOf
                    showManualEntryDialog = false
                }
            )
        }
    }
}

@Composable
private fun TransactionRow(transaction: Transaction) {
    val dateFormatter = SimpleDateFormat("MMM dd, yyyy", Locale.getDefault())
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(Color.White, shape = MaterialTheme.shapes.small)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = transaction.description,
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp,
            )
            Text(
                text = dateFormatter.format(transaction.timestamp),
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
        Text(
            text = if (transaction.transactionType == TransactionType.DEBIT) "- $%.2f".format(transaction.amount) else "+ $%.2f".format(transaction.amount),
            color = if (transaction.transactionType == TransactionType.DEBIT) Color.Red else Color(0xFF4CAF50),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ManualEntryDialog(
    onDismiss: () -> Unit,
    onConfirm: (Date, String, Double, Boolean) -> Unit
) {
    var amount by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var isExpense by remember { mutableStateOf(true) }
    var selectedDate by remember { mutableStateOf(Date()) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Add New Transaction") },
        text = {
            Column {
                OutlinedTextField(
                    value = amount,
                    onValueChange = { amount = it },
                    label = { Text("Amount") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = description,
                    onValueChange = { description = it },
                    label = { Text("Description") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Type:")
                    Spacer(modifier = Modifier.width(16.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = isExpense,
                            onClick = { isExpense = true }
                        )
                        Text("Expense")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = !isExpense,
                            onClick = { isExpense = false }
                        )
                        Text("Credit")
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                // Simple date display for now, a proper date picker would be more complex
                Text("Date: ${SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(selectedDate)}")
                // For a real app, you'd integrate a date picker here.
                // For simplicity, we'll just use the current date for now.
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    val parsedAmount = amount.toDoubleOrNull()
                    if (parsedAmount != null) {
                        onConfirm(selectedDate, description, parsedAmount, isExpense)
                    }
                }
            ) {
                Text("Add")
            }
        },
        dismissButton = {
            Button(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    )
}

// For preview
@Composable
@androidx.compose.ui.tooling.preview.Preview(showBackground = true)
fun PreviewBudgetScreen() {
    BudgetScreen()
}
