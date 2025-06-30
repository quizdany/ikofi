package com.yourname.budgetai.domain.usecases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00120\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/yourname/budgetai/domain/usecases/ParseSMSUseCase;", "", "smsParser", "Lcom/yourname/budgetai/domain/parsers/SMSParser;", "transactionDao", "Lcom/yourname/budgetai/data/database/TransactionDao;", "(Lcom/yourname/budgetai/domain/parsers/SMSParser;Lcom/yourname/budgetai/data/database/TransactionDao;)V", "execute", "", "smsText", "", "timestamp", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseAndStoreMultipleSMS", "", "smsList", "", "Lkotlin/Pair;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ParseSMSUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.yourname.budgetai.domain.parsers.SMSParser smsParser = null;
    @org.jetbrains.annotations.NotNull
    private final com.yourname.budgetai.data.database.TransactionDao transactionDao = null;
    
    @javax.inject.Inject
    public ParseSMSUseCase(@org.jetbrains.annotations.NotNull
    com.yourname.budgetai.domain.parsers.SMSParser smsParser, @org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.database.TransactionDao transactionDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull
    java.lang.String smsText, @org.jetbrains.annotations.NotNull
    java.util.Date timestamp, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object parseAndStoreMultipleSMS(@org.jetbrains.annotations.NotNull
    java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.util.Date>> smsList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
}