package com.yourname.budgetai.ui.budget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Mock data models
private data class BudgetCategory(
    val group: String,
    val name: String,
    val budgeted: String,
    val available: String
)

private val mockBudgetData = listOf(
    BudgetCategory("Pinned", "Fun Money", "$50.00", "$162.40"),
    BudgetCategory("Immediate Obligations", "Groceries", "$160.00", "$58.70"),
    BudgetCategory("Immediate Obligations", "Internet", "$55.00", "$38.70"),
    BudgetCategory("Immediate Obligations", "Rent/Mortgage", "$1,250.00", "$1,550.00"),
    BudgetCategory("Immediate Obligations", "Electric", "$40.00", "$45.00"),
    BudgetCategory("Immediate Obligations", "Water", "$15.00", "$15.00"),
    BudgetCategory("True Expenses", "Auto Maintenance", "$50.00", "$502.50"),
    BudgetCategory("True Expenses", "Home Improvement", "$15.00", "$0.00")
)

@Composable
fun BudgetScreen() {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF5F5F5))) {
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
                    text = "$1,058.33",
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
        // Grouped list
        LazyColumn(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            val groups = mockBudgetData.groupBy { it.group }
            groups.forEach { (group, items) ->
                item {
                    Text(
                        text = group,
                        color = Color(0xFF2C5C3F),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
                items(items) { category ->
                    BudgetCategoryRow(category)
                }
            }
        }
    }
}

@Composable
private fun BudgetCategoryRow(category: BudgetCategory) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(Color.White, shape = MaterialTheme.shapes.small)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = category.name,
            fontWeight = FontWeight.Medium,
            fontSize = 15.sp,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = category.budgeted,
            color = Color(0xFF1976D2),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(end = 16.dp)
        )
        Box(
            modifier = Modifier
                .background(Color(0xFF4CAF50), shape = MaterialTheme.shapes.small)
                .padding(horizontal = 12.dp, vertical = 4.dp)
        ) {
            Text(
                text = category.available,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }
    }
}

// For preview
@Composable
@androidx.compose.ui.tooling.preview.Preview(showBackground = true)
fun PreviewBudgetScreen() {
    BudgetScreen()
} 