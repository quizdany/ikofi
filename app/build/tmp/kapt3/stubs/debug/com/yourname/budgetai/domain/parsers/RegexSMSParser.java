package com.yourname.budgetai.domain.parsers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J#\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/yourname/budgetai/domain/parsers/RegexSMSParser;", "Lcom/yourname/budgetai/domain/parsers/SMSParser;", "()V", "parseAirtelSMS", "Lcom/yourname/budgetai/data/models/Transaction;", "smsText", "", "timestamp", "Ljava/util/Date;", "parseMTNSMS", "parseSMS", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RegexSMSParser implements com.yourname.budgetai.domain.parsers.SMSParser {
    
    public RegexSMSParser() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object parseSMS(@org.jetbrains.annotations.NotNull
    java.lang.String smsText, @org.jetbrains.annotations.NotNull
    java.util.Date timestamp, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.yourname.budgetai.data.models.Transaction> $completion) {
        return null;
    }
    
    private final com.yourname.budgetai.data.models.Transaction parseMTNSMS(java.lang.String smsText, java.util.Date timestamp) {
        return null;
    }
    
    private final com.yourname.budgetai.data.models.Transaction parseAirtelSMS(java.lang.String smsText, java.util.Date timestamp) {
        return null;
    }
}