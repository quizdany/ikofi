package com.yourname.budgetai.domain.parsers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/yourname/budgetai/domain/parsers/SMSParser;", "", "parseSMS", "Lcom/yourname/budgetai/data/models/Transaction;", "smsText", "", "timestamp", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SMSParser {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object parseSMS(@org.jetbrains.annotations.NotNull
    java.lang.String smsText, @org.jetbrains.annotations.NotNull
    java.util.Date timestamp, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.yourname.budgetai.data.models.Transaction> $completion);
}