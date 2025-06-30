package com.yourname.budgetai.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u001b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n2\u0006\u0010\u001c\u001a\u00020\u001dH\'J\u0019\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/yourname/budgetai/data/database/TransactionDao;", "", "deleteAllTransactions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransaction", "transaction", "Lcom/yourname/budgetai/data/models/Transaction;", "(Lcom/yourname/budgetai/data/models/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "getTotalByType", "", "type", "Lcom/yourname/budgetai/data/models/TransactionType;", "(Lcom/yourname/budgetai/data/models/TransactionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactionsByType", "getUnprocessedTransactions", "insertTransaction", "", "insertTransactions", "transactions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsProcessed", "transactionId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchTransactions", "searchTerm", "", "updateTransaction", "app_debug"})
@androidx.room.Dao
public abstract interface TransactionDao {
    
    @androidx.room.Query(value = "SELECT * FROM transactions ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.yourname.budgetai.data.models.Transaction>> getAllTransactions();
    
    @androidx.room.Query(value = "SELECT * FROM transactions WHERE transactionType = :type ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.yourname.budgetai.data.models.Transaction>> getTransactionsByType(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.TransactionType type);
    
    @androidx.room.Query(value = "SELECT SUM(amount) FROM transactions WHERE transactionType = :type")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTotalByType(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.TransactionType type, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM transactions WHERE smsText LIKE \'%\' || :searchTerm || \'%\' ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.yourname.budgetai.data.models.Transaction>> searchTransactions(@org.jetbrains.annotations.NotNull
    java.lang.String searchTerm);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Transaction transaction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertTransactions(@org.jetbrains.annotations.NotNull
    java.util.List<com.yourname.budgetai.data.models.Transaction> transactions, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTransaction(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Transaction transaction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTransaction(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.Transaction transaction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM transactions")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllTransactions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM transactions WHERE isProcessed = 0")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUnprocessedTransactions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.yourname.budgetai.data.models.Transaction>> $completion);
    
    @androidx.room.Query(value = "UPDATE transactions SET isProcessed = 1 WHERE id = :transactionId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object markAsProcessed(long transactionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}