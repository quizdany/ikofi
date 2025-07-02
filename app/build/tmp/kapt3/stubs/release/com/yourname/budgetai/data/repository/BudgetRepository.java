package com.yourname.budgetai.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/yourname/budgetai/data/repository/BudgetRepository;", "", "budgetDao", "Lcom/yourname/budgetai/data/database/BudgetDao;", "(Lcom/yourname/budgetai/data/database/BudgetDao;)V", "deleteBudget", "", "budget", "Lcom/yourname/budgetai/data/models/Budget;", "(Lcom/yourname/budgetai/data/models/Budget;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBudgets", "Lkotlinx/coroutines/flow/Flow;", "", "getBudgetById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBudget", "updateBudget", "app_release"})
public final class BudgetRepository {
    @org.jetbrains.annotations.NotNull
    private final com.yourname.budgetai.data.database.BudgetDao budgetDao = null;
    
    @javax.inject.Inject
    public BudgetRepository(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.database.BudgetDao budgetDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.yourname.budgetai.data.models.Budget>> getAllBudgets() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertBudget(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Budget budget, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateBudget(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Budget budget, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteBudget(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Budget budget, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBudgetById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.yourname.budgetai.data.models.Budget> $completion) {
        return null;
    }
}