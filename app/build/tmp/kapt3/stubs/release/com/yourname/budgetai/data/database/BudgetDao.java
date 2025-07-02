package com.yourname.budgetai.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/yourname/budgetai/data/database/BudgetDao;", "", "deleteBudget", "", "budget", "Lcom/yourname/budgetai/data/models/Budget;", "(Lcom/yourname/budgetai/data/models/Budget;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBudgets", "Lkotlinx/coroutines/flow/Flow;", "", "getBudgetById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBudget", "updateBudget", "app_release"})
@androidx.room.Dao
public abstract interface BudgetDao {
    
    @androidx.room.Query(value = "SELECT * FROM budgets ORDER BY startDate DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.yourname.budgetai.data.models.Budget>> getAllBudgets();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertBudget(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Budget budget, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateBudget(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Budget budget, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteBudget(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Budget budget, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM budgets WHERE id = :id LIMIT 1")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getBudgetById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.yourname.budgetai.data.models.Budget> $completion);
}