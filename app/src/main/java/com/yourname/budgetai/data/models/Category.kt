package com.yourname.budgetai.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

enum class CategoryType {
    INCOME, EXPENSE, TRANSFER
}

@Entity(tableName = "categories")
data class Category(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val color: String,
    val icon: String? = null,
    val type: CategoryType = CategoryType.EXPENSE,
    val spendingLimit: Double? = null,
    val keywords: List<String> = emptyList(), // For AI categorization
    val parentCategoryId: Long? = null, // For subcategories
    val isDefault: Boolean = false,
    val isActive: Boolean = true,
    val createdAt: Date = Date()
) {
    companion object {
        fun getDefaultCategories(): List<Category> {
            return listOf(
                Category(name = "Food & Dining", color = "#FF6B6B", icon = "restaurant", type = CategoryType.EXPENSE, 
                    keywords = listOf("restaurant", "food", "cafe", "mcdonalds", "kfc", "pizza"), isDefault = true),
                Category(name = "Transportation", color = "#4ECDC4", icon = "directions_car", type = CategoryType.EXPENSE,
                    keywords = listOf("uber", "taxi", "fuel", "bus", "train", "transport"), isDefault = true),
                Category(name = "Shopping", color = "#45B7D1", icon = "shopping_bag", type = CategoryType.EXPENSE,
                    keywords = listOf("shop", "store", "mall", "amazon", "jumia"), isDefault = true),
                Category(name = "Bills & Utilities", color = "#96CEB4", icon = "receipt_long", type = CategoryType.EXPENSE,
                    keywords = listOf("electricity", "water", "internet", "phone", "rent"), isDefault = true),
                Category(name = "Entertainment", color = "#FFEAA7", icon = "movie", type = CategoryType.EXPENSE,
                    keywords = listOf("cinema", "game", "netflix", "spotify"), isDefault = true),
                Category(name = "Health & Medical", color = "#DDA0DD", icon = "local_hospital", type = CategoryType.EXPENSE,
                    keywords = listOf("hospital", "pharmacy", "doctor", "medical"), isDefault = true),
                Category(name = "Salary", color = "#98D8C8", icon = "payments", type = CategoryType.INCOME,
                    keywords = listOf("salary", "wage", "payment"), isDefault = true),
                Category(name = "Business", color = "#F7DC6F", icon = "business", type = CategoryType.INCOME,
                    keywords = listOf("business", "freelance", "contract"), isDefault = true)
            )
        }
    }
} 