package com.yourname.budgetai.data.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0016J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\nH\u00c6\u0003J\t\u0010=\u001a\u00020\nH\u00c6\u0003J\t\u0010>\u001a\u00020\rH\u00c6\u0003J\t\u0010?\u001a\u00020\u000fH\u00c6\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\u0093\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010B\u001a\u00020#2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020EH\u00d6\u0001J\t\u0010F\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0012\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010&R\u0011\u0010(\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010*\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0011\u0010,\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010$R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001c\u00a8\u0006G"}, d2 = {"Lcom/yourname/budgetai/data/models/Budget;", "", "id", "", "name", "", "startDate", "Ljava/util/Date;", "endDate", "totalAmount", "", "spentAmount", "cycle", "Lcom/yourname/budgetai/data/models/BudgetCycle;", "status", "Lcom/yourname/budgetai/data/models/BudgetStatus;", "categoryIds", "", "alertThreshold", "notes", "createdAt", "updatedAt", "(JLjava/lang/String;Ljava/util/Date;Ljava/util/Date;DDLcom/yourname/budgetai/data/models/BudgetCycle;Lcom/yourname/budgetai/data/models/BudgetStatus;Ljava/util/List;DLjava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getAlertThreshold", "()D", "getCategoryIds", "()Ljava/util/List;", "getCreatedAt", "()Ljava/util/Date;", "getCycle", "()Lcom/yourname/budgetai/data/models/BudgetCycle;", "getEndDate", "getId", "()J", "isOverBudget", "", "()Z", "getName", "()Ljava/lang/String;", "getNotes", "progressPercentage", "getProgressPercentage", "remainingAmount", "getRemainingAmount", "shouldAlert", "getShouldAlert", "getSpentAmount", "getStartDate", "getStatus", "()Lcom/yourname/budgetai/data/models/BudgetStatus;", "getTotalAmount", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"})
@androidx.room.Entity(tableName = "budgets")
public final class Budget {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date startDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date endDate = null;
    private final double totalAmount = 0.0;
    private final double spentAmount = 0.0;
    @org.jetbrains.annotations.NotNull
    private final com.yourname.budgetai.data.models.BudgetCycle cycle = null;
    @org.jetbrains.annotations.NotNull
    private final com.yourname.budgetai.data.models.BudgetStatus status = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Long> categoryIds = null;
    private final double alertThreshold = 0.0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String notes = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date updatedAt = null;
    
    public Budget(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.Date startDate, @org.jetbrains.annotations.NotNull
    java.util.Date endDate, double totalAmount, double spentAmount, @org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.BudgetCycle cycle, @org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.BudgetStatus status, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> categoryIds, double alertThreshold, @org.jetbrains.annotations.Nullable
    java.lang.String notes, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull
    java.util.Date updatedAt) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getEndDate() {
        return null;
    }
    
    public final double getTotalAmount() {
        return 0.0;
    }
    
    public final double getSpentAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yourname.budgetai.data.models.BudgetCycle getCycle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yourname.budgetai.data.models.BudgetStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> getCategoryIds() {
        return null;
    }
    
    public final double getAlertThreshold() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getUpdatedAt() {
        return null;
    }
    
    public final double getRemainingAmount() {
        return 0.0;
    }
    
    public final double getProgressPercentage() {
        return 0.0;
    }
    
    public final boolean isOverBudget() {
        return false;
    }
    
    public final boolean getShouldAlert() {
        return false;
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component4() {
        return null;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yourname.budgetai.data.models.BudgetCycle component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yourname.budgetai.data.models.BudgetStatus component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yourname.budgetai.data.models.Budget copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.Date startDate, @org.jetbrains.annotations.NotNull
    java.util.Date endDate, double totalAmount, double spentAmount, @org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.BudgetCycle cycle, @org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.BudgetStatus status, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> categoryIds, double alertThreshold, @org.jetbrains.annotations.Nullable
    java.lang.String notes, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull
    java.util.Date updatedAt) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}