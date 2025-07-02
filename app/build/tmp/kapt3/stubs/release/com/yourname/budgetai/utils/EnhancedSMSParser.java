package com.yourname.budgetai.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J1\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a2\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a2\u0006\u0002\u0010\u0019J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004J\u0018\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/yourname/budgetai/utils/EnhancedSMSParser;", "", "()V", "balancePatterns", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "providerPatterns", "", "Lcom/yourname/budgetai/data/models/MobileMoneyProvider;", "transactionIdPatterns", "calculateConfidence", "", "smsText", "", "amount", "", "transactionType", "Lcom/yourname/budgetai/data/models/TransactionType;", "otherParty", "(Ljava/lang/String;Ljava/lang/Double;Lcom/yourname/budgetai/data/models/TransactionType;Ljava/lang/String;)F", "categorizeTransaction", "detectProvider", "detectTransactionType", "extractAmount", "(Ljava/lang/String;)Ljava/lang/Double;", "extractBalance", "extractOtherParty", "extractTransactionId", "isDuplicate", "", "newSMS", "existingTransactions", "Lcom/yourname/budgetai/data/models/Transaction;", "parseAdvancedSMS", "Lcom/yourname/budgetai/utils/EnhancedSMSParser$ParsedSMS;", "timestamp", "Ljava/util/Date;", "ParsedSMS", "app_release"})
public final class EnhancedSMSParser {
    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<com.yourname.budgetai.data.models.MobileMoneyProvider, java.util.List<java.util.regex.Pattern>> providerPatterns = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.util.regex.Pattern> balancePatterns = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.util.regex.Pattern> transactionIdPatterns = null;
    @org.jetbrains.annotations.NotNull
    public static final com.yourname.budgetai.utils.EnhancedSMSParser INSTANCE = null;
    
    private EnhancedSMSParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.yourname.budgetai.utils.EnhancedSMSParser.ParsedSMS parseAdvancedSMS(@org.jetbrains.annotations.NotNull
    java.lang.String smsText, @org.jetbrains.annotations.NotNull
    java.util.Date timestamp) {
        return null;
    }
    
    private final com.yourname.budgetai.data.models.MobileMoneyProvider detectProvider(java.lang.String smsText) {
        return null;
    }
    
    private final java.lang.Double extractAmount(java.lang.String smsText) {
        return null;
    }
    
    private final com.yourname.budgetai.data.models.TransactionType detectTransactionType(java.lang.String smsText) {
        return null;
    }
    
    private final java.lang.String extractOtherParty(java.lang.String smsText, com.yourname.budgetai.data.models.TransactionType transactionType) {
        return null;
    }
    
    private final java.lang.String extractTransactionId(java.lang.String smsText) {
        return null;
    }
    
    private final java.lang.Double extractBalance(java.lang.String smsText) {
        return null;
    }
    
    private final java.lang.String categorizeTransaction(java.lang.String smsText, java.lang.String otherParty) {
        return null;
    }
    
    private final float calculateConfidence(java.lang.String smsText, java.lang.Double amount, com.yourname.budgetai.data.models.TransactionType transactionType, java.lang.String otherParty) {
        return 0.0F;
    }
    
    public final boolean isDuplicate(@org.jetbrains.annotations.NotNull
    java.lang.String newSMS, @org.jetbrains.annotations.NotNull
    java.util.List<com.yourname.budgetai.data.models.Transaction> existingTransactions) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u000eH\u00c6\u0003Jj\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006."}, d2 = {"Lcom/yourname/budgetai/utils/EnhancedSMSParser$ParsedSMS;", "", "amount", "", "transactionType", "Lcom/yourname/budgetai/data/models/TransactionType;", "otherParty", "", "transactionId", "provider", "Lcom/yourname/budgetai/data/models/MobileMoneyProvider;", "balance", "category", "confidence", "", "(Ljava/lang/Double;Lcom/yourname/budgetai/data/models/TransactionType;Ljava/lang/String;Ljava/lang/String;Lcom/yourname/budgetai/data/models/MobileMoneyProvider;Ljava/lang/Double;Ljava/lang/String;F)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBalance", "getCategory", "()Ljava/lang/String;", "getConfidence", "()F", "getOtherParty", "getProvider", "()Lcom/yourname/budgetai/data/models/MobileMoneyProvider;", "getTransactionId", "getTransactionType", "()Lcom/yourname/budgetai/data/models/TransactionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Double;Lcom/yourname/budgetai/data/models/TransactionType;Ljava/lang/String;Ljava/lang/String;Lcom/yourname/budgetai/data/models/MobileMoneyProvider;Ljava/lang/Double;Ljava/lang/String;F)Lcom/yourname/budgetai/utils/EnhancedSMSParser$ParsedSMS;", "equals", "", "other", "hashCode", "", "toString", "app_release"})
    public static final class ParsedSMS {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Double amount = null;
        @org.jetbrains.annotations.NotNull
        private final com.yourname.budgetai.data.models.TransactionType transactionType = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String otherParty = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String transactionId = null;
        @org.jetbrains.annotations.Nullable
        private final com.yourname.budgetai.data.models.MobileMoneyProvider provider = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Double balance = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String category = null;
        private final float confidence = 0.0F;
        
        public ParsedSMS(@org.jetbrains.annotations.Nullable
        java.lang.Double amount, @org.jetbrains.annotations.NotNull
        com.yourname.budgetai.data.models.TransactionType transactionType, @org.jetbrains.annotations.Nullable
        java.lang.String otherParty, @org.jetbrains.annotations.Nullable
        java.lang.String transactionId, @org.jetbrains.annotations.Nullable
        com.yourname.budgetai.data.models.MobileMoneyProvider provider, @org.jetbrains.annotations.Nullable
        java.lang.Double balance, @org.jetbrains.annotations.Nullable
        java.lang.String category, float confidence) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double getAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.yourname.budgetai.data.models.TransactionType getTransactionType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getOtherParty() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTransactionId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.yourname.budgetai.data.models.MobileMoneyProvider getProvider() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double getBalance() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCategory() {
            return null;
        }
        
        public final float getConfidence() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.yourname.budgetai.data.models.TransactionType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.yourname.budgetai.data.models.MobileMoneyProvider component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component7() {
            return null;
        }
        
        public final float component8() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.yourname.budgetai.utils.EnhancedSMSParser.ParsedSMS copy(@org.jetbrains.annotations.Nullable
        java.lang.Double amount, @org.jetbrains.annotations.NotNull
        com.yourname.budgetai.data.models.TransactionType transactionType, @org.jetbrains.annotations.Nullable
        java.lang.String otherParty, @org.jetbrains.annotations.Nullable
        java.lang.String transactionId, @org.jetbrains.annotations.Nullable
        com.yourname.budgetai.data.models.MobileMoneyProvider provider, @org.jetbrains.annotations.Nullable
        java.lang.Double balance, @org.jetbrains.annotations.Nullable
        java.lang.String category, float confidence) {
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
}