package com.yourname.budgetai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yourname.budgetai.ui.theme.BudgetAITheme
import com.yourname.budgetai.ui.budget.BudgetScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BudgetAITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BudgetAIApp()
                }
            }
        }
    }
}

@Composable
fun BudgetAIApp() {
    BudgetScreen()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BudgetAITheme {
        BudgetAIApp()
    }
} 