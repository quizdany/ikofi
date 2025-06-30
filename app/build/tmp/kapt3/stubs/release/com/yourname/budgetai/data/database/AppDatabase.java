package com.yourname.budgetai.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/yourname/budgetai/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "categoryDao", "Lcom/yourname/budgetai/data/database/CategoryDao;", "transactionDao", "Lcom/yourname/budgetai/data/database/TransactionDao;", "Companion", "app_release"})
@androidx.room.Database(entities = {com.yourname.budgetai.data.models.Transaction.class, com.yourname.budgetai.data.models.Category.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.yourname.budgetai.data.database.Converters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.yourname.budgetai.data.database.AppDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.yourname.budgetai.data.database.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.yourname.budgetai.data.database.TransactionDao transactionDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.yourname.budgetai.data.database.CategoryDao categoryDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/yourname/budgetai/data/database/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/yourname/budgetai/data/database/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.yourname.budgetai.data.database.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}