package com.yourname.budgetai.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\u0019\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\r2\u0006\u0010 \u001a\u00020!J\u0019\u0010\"\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/yourname/budgetai/data/repository/TransactionRepository;", "", "transactionDao", "Lcom/yourname/budgetai/data/database/TransactionDao;", "(Lcom/yourname/budgetai/data/database/TransactionDao;)V", "deleteAllTransactions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransaction", "transaction", "Lcom/yourname/budgetai/data/models/Transaction;", "(Lcom/yourname/budgetai/data/models/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "getBalance", "", "getTotalByType", "type", "Lcom/yourname/budgetai/data/models/TransactionType;", "(Lcom/yourname/budgetai/data/models/TransactionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactionsByType", "getUnprocessedTransactions", "insertTransaction", "", "insertTransactions", "transactions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsProcessed", "transactionId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchTransactions", "searchTerm", "", "updateTransaction", "app_release"})
public final class TransactionRepository {
    @org.jetbrains.annotations.NotNull
    private final com.yourname.budgetai.data.database.TransactionDao transactionDao = null;
    
    @javax.inject.Inject
    public TransactionRepository(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.database.TransactionDao transactionDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.yourname.budgetai.data.models.Transaction>> getAllTransactions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.yourname.budgetai.data.models.Transaction>> getTransactionsByType(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.TransactionType type) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTotalByType(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.TransactionType type, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.yourname.budgetai.data.models.Transaction>> searchTransactions(@org.jetbrains.annotations.NotNull
    java.lang.String searchTerm) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Transaction transaction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertTransactions(@org.jetbrains.annotations.NotNull
    java.util.List<com.yourname.budgetai.data.models.Transaction> transactions, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateTransaction(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Transaction transaction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteTransaction(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Transaction transaction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteAllTransactions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUnprocessedTransactions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.yourname.budgetai.data.models.Transaction>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object markAsProcessed(long transactionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBalance(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
}