package com.yourname.budgetai.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yourname.budgetai.data.models.Category;
import com.yourname.budgetai.data.models.CategoryType;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CategoryDao_Impl implements CategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Category> __insertionAdapterOfCategory;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Category> __deletionAdapterOfCategory;

  private final EntityDeletionOrUpdateAdapter<Category> __updateAdapterOfCategory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCategories;

  public CategoryDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCategory = new EntityInsertionAdapter<Category>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `categories` (`id`,`name`,`color`,`icon`,`type`,`spendingLimit`,`keywords`,`parentCategoryId`,`isDefault`,`isActive`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Category entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getColor() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getColor());
        }
        if (entity.getIcon() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getIcon());
        }
        statement.bindString(5, __CategoryType_enumToString(entity.getType()));
        if (entity.getSpendingLimit() == null) {
          statement.bindNull(6);
        } else {
          statement.bindDouble(6, entity.getSpendingLimit());
        }
        final String _tmp = __converters.toStringList(entity.getKeywords());
        if (_tmp == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, _tmp);
        }
        if (entity.getParentCategoryId() == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, entity.getParentCategoryId());
        }
        final int _tmp_1 = entity.isDefault() ? 1 : 0;
        statement.bindLong(9, _tmp_1);
        final int _tmp_2 = entity.isActive() ? 1 : 0;
        statement.bindLong(10, _tmp_2);
        final Long _tmp_3 = __converters.dateToTimestamp(entity.getCreatedAt());
        if (_tmp_3 == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, _tmp_3);
        }
      }
    };
    this.__deletionAdapterOfCategory = new EntityDeletionOrUpdateAdapter<Category>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `categories` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Category entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfCategory = new EntityDeletionOrUpdateAdapter<Category>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `categories` SET `id` = ?,`name` = ?,`color` = ?,`icon` = ?,`type` = ?,`spendingLimit` = ?,`keywords` = ?,`parentCategoryId` = ?,`isDefault` = ?,`isActive` = ?,`createdAt` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Category entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getColor() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getColor());
        }
        if (entity.getIcon() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getIcon());
        }
        statement.bindString(5, __CategoryType_enumToString(entity.getType()));
        if (entity.getSpendingLimit() == null) {
          statement.bindNull(6);
        } else {
          statement.bindDouble(6, entity.getSpendingLimit());
        }
        final String _tmp = __converters.toStringList(entity.getKeywords());
        if (_tmp == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, _tmp);
        }
        if (entity.getParentCategoryId() == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, entity.getParentCategoryId());
        }
        final int _tmp_1 = entity.isDefault() ? 1 : 0;
        statement.bindLong(9, _tmp_1);
        final int _tmp_2 = entity.isActive() ? 1 : 0;
        statement.bindLong(10, _tmp_2);
        final Long _tmp_3 = __converters.dateToTimestamp(entity.getCreatedAt());
        if (_tmp_3 == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, _tmp_3);
        }
        statement.bindLong(12, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteAllCategories = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM categories";
        return _query;
      }
    };
  }

  @Override
  public Object insertCategory(final Category category,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfCategory.insertAndReturnId(category);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertCategories(final List<Category> categories,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCategory.insert(categories);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteCategory(final Category category,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCategory.handle(category);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateCategory(final Category category,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCategory.handle(category);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAllCategories(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCategories.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAllCategories.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Category>> getAllCategories() {
    final String _sql = "SELECT `categories`.`id` AS `id`, `categories`.`name` AS `name`, `categories`.`color` AS `color`, `categories`.`icon` AS `icon`, `categories`.`type` AS `type`, `categories`.`spendingLimit` AS `spendingLimit`, `categories`.`keywords` AS `keywords`, `categories`.`parentCategoryId` AS `parentCategoryId`, `categories`.`isDefault` AS `isDefault`, `categories`.`isActive` AS `isActive`, `categories`.`createdAt` AS `createdAt` FROM categories ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"categories"}, new Callable<List<Category>>() {
      @Override
      @NonNull
      public List<Category> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfName = 1;
          final int _cursorIndexOfColor = 2;
          final int _cursorIndexOfIcon = 3;
          final int _cursorIndexOfType = 4;
          final int _cursorIndexOfSpendingLimit = 5;
          final int _cursorIndexOfKeywords = 6;
          final int _cursorIndexOfParentCategoryId = 7;
          final int _cursorIndexOfIsDefault = 8;
          final int _cursorIndexOfIsActive = 9;
          final int _cursorIndexOfCreatedAt = 10;
          final List<Category> _result = new ArrayList<Category>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Category _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpColor;
            if (_cursor.isNull(_cursorIndexOfColor)) {
              _tmpColor = null;
            } else {
              _tmpColor = _cursor.getString(_cursorIndexOfColor);
            }
            final String _tmpIcon;
            if (_cursor.isNull(_cursorIndexOfIcon)) {
              _tmpIcon = null;
            } else {
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            }
            final CategoryType _tmpType;
            _tmpType = __CategoryType_stringToEnum(_cursor.getString(_cursorIndexOfType));
            final Double _tmpSpendingLimit;
            if (_cursor.isNull(_cursorIndexOfSpendingLimit)) {
              _tmpSpendingLimit = null;
            } else {
              _tmpSpendingLimit = _cursor.getDouble(_cursorIndexOfSpendingLimit);
            }
            final List<String> _tmpKeywords;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfKeywords)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfKeywords);
            }
            _tmpKeywords = __converters.fromStringList(_tmp);
            final Long _tmpParentCategoryId;
            if (_cursor.isNull(_cursorIndexOfParentCategoryId)) {
              _tmpParentCategoryId = null;
            } else {
              _tmpParentCategoryId = _cursor.getLong(_cursorIndexOfParentCategoryId);
            }
            final boolean _tmpIsDefault;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDefault);
            _tmpIsDefault = _tmp_1 != 0;
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final Date _tmpCreatedAt;
            final Long _tmp_3;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            _tmpCreatedAt = __converters.fromTimestamp(_tmp_3);
            _item = new Category(_tmpId,_tmpName,_tmpColor,_tmpIcon,_tmpType,_tmpSpendingLimit,_tmpKeywords,_tmpParentCategoryId,_tmpIsDefault,_tmpIsActive,_tmpCreatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getDefaultCategories(final Continuation<? super List<Category>> $completion) {
    final String _sql = "SELECT `categories`.`id` AS `id`, `categories`.`name` AS `name`, `categories`.`color` AS `color`, `categories`.`icon` AS `icon`, `categories`.`type` AS `type`, `categories`.`spendingLimit` AS `spendingLimit`, `categories`.`keywords` AS `keywords`, `categories`.`parentCategoryId` AS `parentCategoryId`, `categories`.`isDefault` AS `isDefault`, `categories`.`isActive` AS `isActive`, `categories`.`createdAt` AS `createdAt` FROM categories WHERE isDefault = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Category>>() {
      @Override
      @NonNull
      public List<Category> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfName = 1;
          final int _cursorIndexOfColor = 2;
          final int _cursorIndexOfIcon = 3;
          final int _cursorIndexOfType = 4;
          final int _cursorIndexOfSpendingLimit = 5;
          final int _cursorIndexOfKeywords = 6;
          final int _cursorIndexOfParentCategoryId = 7;
          final int _cursorIndexOfIsDefault = 8;
          final int _cursorIndexOfIsActive = 9;
          final int _cursorIndexOfCreatedAt = 10;
          final List<Category> _result = new ArrayList<Category>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Category _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpColor;
            if (_cursor.isNull(_cursorIndexOfColor)) {
              _tmpColor = null;
            } else {
              _tmpColor = _cursor.getString(_cursorIndexOfColor);
            }
            final String _tmpIcon;
            if (_cursor.isNull(_cursorIndexOfIcon)) {
              _tmpIcon = null;
            } else {
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            }
            final CategoryType _tmpType;
            _tmpType = __CategoryType_stringToEnum(_cursor.getString(_cursorIndexOfType));
            final Double _tmpSpendingLimit;
            if (_cursor.isNull(_cursorIndexOfSpendingLimit)) {
              _tmpSpendingLimit = null;
            } else {
              _tmpSpendingLimit = _cursor.getDouble(_cursorIndexOfSpendingLimit);
            }
            final List<String> _tmpKeywords;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfKeywords)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfKeywords);
            }
            _tmpKeywords = __converters.fromStringList(_tmp);
            final Long _tmpParentCategoryId;
            if (_cursor.isNull(_cursorIndexOfParentCategoryId)) {
              _tmpParentCategoryId = null;
            } else {
              _tmpParentCategoryId = _cursor.getLong(_cursorIndexOfParentCategoryId);
            }
            final boolean _tmpIsDefault;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsDefault);
            _tmpIsDefault = _tmp_1 != 0;
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final Date _tmpCreatedAt;
            final Long _tmp_3;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            _tmpCreatedAt = __converters.fromTimestamp(_tmp_3);
            _item = new Category(_tmpId,_tmpName,_tmpColor,_tmpIcon,_tmpType,_tmpSpendingLimit,_tmpKeywords,_tmpParentCategoryId,_tmpIsDefault,_tmpIsActive,_tmpCreatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __CategoryType_enumToString(@NonNull final CategoryType _value) {
    switch (_value) {
      case INCOME: return "INCOME";
      case EXPENSE: return "EXPENSE";
      case TRANSFER: return "TRANSFER";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private CategoryType __CategoryType_stringToEnum(@NonNull final String _value) {
    switch (_value) {
      case "INCOME": return CategoryType.INCOME;
      case "EXPENSE": return CategoryType.EXPENSE;
      case "TRANSFER": return CategoryType.TRANSFER;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
