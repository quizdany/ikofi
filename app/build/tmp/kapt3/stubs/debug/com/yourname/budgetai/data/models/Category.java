package com.yourname.budgetai.data.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001:B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0010H\u00c6\u0003J\t\u0010*\u001a\u00020\u0013H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\u0088\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u000208H\u00d6\u0001J\t\u00109\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006;"}, d2 = {"Lcom/yourname/budgetai/data/models/Category;", "", "id", "", "name", "", "color", "icon", "type", "Lcom/yourname/budgetai/data/models/CategoryType;", "spendingLimit", "", "keywords", "", "parentCategoryId", "isDefault", "", "isActive", "createdAt", "Ljava/util/Date;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yourname/budgetai/data/models/CategoryType;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Long;ZZLjava/util/Date;)V", "getColor", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getIcon", "getId", "()J", "()Z", "getKeywords", "()Ljava/util/List;", "getName", "getParentCategoryId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSpendingLimit", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getType", "()Lcom/yourname/budgetai/data/models/CategoryType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yourname/budgetai/data/models/CategoryType;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Long;ZZLjava/util/Date;)Lcom/yourname/budgetai/data/models/Category;", "equals", "other", "hashCode", "", "toString", "Companion", "app_debug"})
@androidx.room.Entity(tableName = "categories")
public final class Category {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String color = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.NotNull
    private final com.yourname.budgetai.data.models.CategoryType type = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double spendingLimit = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> keywords = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long parentCategoryId = null;
    private final boolean isDefault = false;
    private final boolean isActive = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt = null;
    @org.jetbrains.annotations.NotNull
    public static final com.yourname.budgetai.data.models.Category.Companion Companion = null;
    
    public Category(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String color, @org.jetbrains.annotations.Nullable
    java.lang.String icon, @org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.CategoryType type, @org.jetbrains.annotations.Nullable
    java.lang.Double spendingLimit, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> keywords, @org.jetbrains.annotations.Nullable
    java.lang.Long parentCategoryId, boolean isDefault, boolean isActive, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt) {
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
    public final java.lang.String getColor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yourname.budgetai.data.models.CategoryType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getSpendingLimit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getParentCategoryId() {
        return null;
    }
    
    public final boolean isDefault() {
        return false;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yourname.budgetai.data.models.CategoryType component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component8() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yourname.budgetai.data.models.Category copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String color, @org.jetbrains.annotations.Nullable
    java.lang.String icon, @org.jetbrains.annotations.NotNull
    com.yourname.budgetai.data.models.CategoryType type, @org.jetbrains.annotations.Nullable
    java.lang.Double spendingLimit, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> keywords, @org.jetbrains.annotations.Nullable
    java.lang.Long parentCategoryId, boolean isDefault, boolean isActive, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/yourname/budgetai/data/models/Category$Companion;", "", "()V", "getDefaultCategories", "", "Lcom/yourname/budgetai/data/models/Category;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.yourname.budgetai.data.models.Category> getDefaultCategories() {
            return null;
        }
    }
}