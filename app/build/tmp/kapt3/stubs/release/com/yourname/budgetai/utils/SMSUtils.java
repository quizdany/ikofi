package com.yourname.budgetai.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004J*\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/yourname/budgetai/utils/SMSUtils;", "", "()V", "formatPhoneNumber", "", "phoneNumber", "getRequiredPermissions", "", "()[Ljava/lang/String;", "hasSMSPermissions", "", "context", "Landroid/content/Context;", "isMobileMoneySMS", "smsText", "readExistingSMS", "", "Lkotlin/Pair;", "Ljava/util/Date;", "limit", "", "app_release"})
public final class SMSUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.yourname.budgetai.utils.SMSUtils INSTANCE = null;
    
    private SMSUtils() {
        super();
    }
    
    public final boolean hasSMSPermissions(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getRequiredPermissions() {
        return null;
    }
    
    public final boolean isMobileMoneySMS(@org.jetbrains.annotations.NotNull
    java.lang.String smsText) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.Pair<java.lang.String, java.util.Date>> readExistingSMS(@org.jetbrains.annotations.NotNull
    android.content.Context context, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatPhoneNumber(@org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber) {
        return null;
    }
}