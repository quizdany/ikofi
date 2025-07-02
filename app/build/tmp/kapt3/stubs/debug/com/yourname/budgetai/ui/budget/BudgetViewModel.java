package com.yourname.budgetai.ui.budget;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/yourname/budgetai/ui/budget/BudgetViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/yourname/budgetai/data/repository/BudgetRepository;", "(Lcom/yourname/budgetai/data/repository/BudgetRepository;)V", "_budgets", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/yourname/budgetai/data/models/Budget;", "budgets", "Lkotlinx/coroutines/flow/StateFlow;", "getBudgets", "()Lkotlinx/coroutines/flow/StateFlow;", "addBudget", "Lkotlinx/coroutines/Job;", "budget", "deleteBudget", "updateBudget", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class BudgetViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.yourname.budgetai.data.repository.BudgetRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.yourname.budgetai.data.models.Budget>> _budgets = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.yourname.budgetai.data.models.Budget>> budgets = null;
    
    @javax.inject.Inject
    public BudgetViewModel(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.repository.BudgetRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.yourname.budgetai.data.models.Budget>> getBudgets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job addBudget(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Budget budget) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateBudget(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Budget budget) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteBudget(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Budget budget) {
        return null;
    }
}