package com.yourname.budgetai.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yourname.budgetai.data.models.Transaction;
import com.yourname.budgetai.data.models.TransactionType;
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
public final class TransactionDao_Impl implements TransactionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Transaction> __insertionAdapterOfTransaction;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Transaction> __deletionAdapterOfTransaction;

  private final EntityDeletionOrUpdateAdapter<Transaction> __updateAdapterOfTransaction;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTransactions;

  private final SharedSQLiteStatement __preparedStmtOfMarkAsProcessed;

  public TransactionDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTransaction = new EntityInsertionAdapter<Transaction>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `transactions` (`id`,`amount`,`currency`,`transactionType`,`sender`,`receiver`,`transactionId`,`smsText`,`timestamp`,`category`,`isProcessed`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Transaction entity) {
        statement.bindLong(1, entity.getId());
        statement.bindDouble(2, entity.getAmount());
        if (entity.getCurrency() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCurrency());
        }
        statement.bindString(4, __TransactionType_enumToString(entity.getTransactionType()));
        if (entity.getSender() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSender());
        }
        if (entity.getReceiver() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getReceiver());
        }
        if (entity.getTransactionId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getTransactionId());
        }
        if (entity.getSmsText() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getSmsText());
        }
        final Long _tmp = __converters.dateToTimestamp(entity.getTimestamp());
        if (_tmp == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, _tmp);
        }
        if (entity.getCategory() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getCategory());
        }
        final int _tmp_1 = entity.isProcessed() ? 1 : 0;
        statement.bindLong(11, _tmp_1);
        final Long _tmp_2 = __converters.dateToTimestamp(entity.getCreatedAt());
        if (_tmp_2 == null) {
          statement.bindNull(12);
        } else {
          statement.bindLong(12, _tmp_2);
        }
      }
    };
    this.__deletionAdapterOfTransaction = new EntityDeletionOrUpdateAdapter<Transaction>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `transactions` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Transaction entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfTransaction = new EntityDeletionOrUpdateAdapter<Transaction>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `transactions` SET `id` = ?,`amount` = ?,`currency` = ?,`transactionType` = ?,`sender` = ?,`receiver` = ?,`transactionId` = ?,`smsText` = ?,`timestamp` = ?,`category` = ?,`isProcessed` = ?,`createdAt` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Transaction entity) {
        statement.bindLong(1, entity.getId());
        statement.bindDouble(2, entity.getAmount());
        if (entity.getCurrency() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCurrency());
        }
        statement.bindString(4, __TransactionType_enumToString(entity.getTransactionType()));
        if (entity.getSender() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSender());
        }
        if (entity.getReceiver() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getReceiver());
        }
        if (entity.getTransactionId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getTransactionId());
        }
        if (entity.getSmsText() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getSmsText());
        }
        final Long _tmp = __converters.dateToTimestamp(entity.getTimestamp());
        if (_tmp == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, _tmp);
        }
        if (entity.getCategory() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getCategory());
        }
        final int _tmp_1 = entity.isProcessed() ? 1 : 0;
        statement.bindLong(11, _tmp_1);
        final Long _tmp_2 = __converters.dateToTimestamp(entity.getCreatedAt());
        if (_tmp_2 == null) {
          statement.bindNull(12);
        } else {
          statement.bindLong(12, _tmp_2);
        }
        statement.bindLong(13, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteAllTransactions = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM transactions";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAsProcessed = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE transactions SET isProcessed = 1 WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertTransaction(final Transaction transaction,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfTransaction.insertAndReturnId(transaction);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertTransactions(final List<Transaction> transactions,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTransaction.insert(transactions);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteTransaction(final Transaction transaction,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTransaction.handle(transaction);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateTransaction(final Transaction transaction,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTransaction.handle(transaction);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAllTransactions(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTransactions.acquire();
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
          __preparedStmtOfDeleteAllTransactions.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object markAsProcessed(final long transactionId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAsProcessed.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, transactionId);
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
          __preparedStmtOfMarkAsProcessed.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Transaction>> getAllTransactions() {
    final String _sql = "SELECT `transactions`.`id` AS `id`, `transactions`.`amount` AS `amount`, `transactions`.`currency` AS `currency`, `transactions`.`transactionType` AS `transactionType`, `transactions`.`sender` AS `sender`, `transactions`.`receiver` AS `receiver`, `transactions`.`transactionId` AS `transactionId`, `transactions`.`smsText` AS `smsText`, `transactions`.`timestamp` AS `timestamp`, `transactions`.`category` AS `category`, `transactions`.`isProcessed` AS `isProcessed`, `transactions`.`createdAt` AS `createdAt` FROM transactions ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"transactions"}, new Callable<List<Transaction>>() {
      @Override
      @NonNull
      public List<Transaction> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfAmount = 1;
          final int _cursorIndexOfCurrency = 2;
          final int _cursorIndexOfTransactionType = 3;
          final int _cursorIndexOfSender = 4;
          final int _cursorIndexOfReceiver = 5;
          final int _cursorIndexOfTransactionId = 6;
          final int _cursorIndexOfSmsText = 7;
          final int _cursorIndexOfTimestamp = 8;
          final int _cursorIndexOfCategory = 9;
          final int _cursorIndexOfIsProcessed = 10;
          final int _cursorIndexOfCreatedAt = 11;
          final List<Transaction> _result = new ArrayList<Transaction>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Transaction _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpCurrency;
            if (_cursor.isNull(_cursorIndexOfCurrency)) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final TransactionType _tmpTransactionType;
            _tmpTransactionType = __TransactionType_stringToEnum(_cursor.getString(_cursorIndexOfTransactionType));
            final String _tmpSender;
            if (_cursor.isNull(_cursorIndexOfSender)) {
              _tmpSender = null;
            } else {
              _tmpSender = _cursor.getString(_cursorIndexOfSender);
            }
            final String _tmpReceiver;
            if (_cursor.isNull(_cursorIndexOfReceiver)) {
              _tmpReceiver = null;
            } else {
              _tmpReceiver = _cursor.getString(_cursorIndexOfReceiver);
            }
            final String _tmpTransactionId;
            if (_cursor.isNull(_cursorIndexOfTransactionId)) {
              _tmpTransactionId = null;
            } else {
              _tmpTransactionId = _cursor.getString(_cursorIndexOfTransactionId);
            }
            final String _tmpSmsText;
            if (_cursor.isNull(_cursorIndexOfSmsText)) {
              _tmpSmsText = null;
            } else {
              _tmpSmsText = _cursor.getString(_cursorIndexOfSmsText);
            }
            final Date _tmpTimestamp;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __converters.fromTimestamp(_tmp);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final boolean _tmpIsProcessed;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsProcessed);
            _tmpIsProcessed = _tmp_1 != 0;
            final Date _tmpCreatedAt;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            _tmpCreatedAt = __converters.fromTimestamp(_tmp_2);
            _item = new Transaction(_tmpId,_tmpAmount,_tmpCurrency,_tmpTransactionType,_tmpSender,_tmpReceiver,_tmpTransactionId,_tmpSmsText,_tmpTimestamp,_tmpCategory,_tmpIsProcessed,_tmpCreatedAt);
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
  public Flow<List<Transaction>> getTransactionsByType(final TransactionType type) {
    final String _sql = "SELECT * FROM transactions WHERE transactionType = ? ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, __TransactionType_enumToString(type));
    return CoroutinesRoom.createFlow(__db, false, new String[] {"transactions"}, new Callable<List<Transaction>>() {
      @Override
      @NonNull
      public List<Transaction> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionType");
          final int _cursorIndexOfSender = CursorUtil.getColumnIndexOrThrow(_cursor, "sender");
          final int _cursorIndexOfReceiver = CursorUtil.getColumnIndexOrThrow(_cursor, "receiver");
          final int _cursorIndexOfTransactionId = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionId");
          final int _cursorIndexOfSmsText = CursorUtil.getColumnIndexOrThrow(_cursor, "smsText");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfIsProcessed = CursorUtil.getColumnIndexOrThrow(_cursor, "isProcessed");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<Transaction> _result = new ArrayList<Transaction>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Transaction _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpCurrency;
            if (_cursor.isNull(_cursorIndexOfCurrency)) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final TransactionType _tmpTransactionType;
            _tmpTransactionType = __TransactionType_stringToEnum(_cursor.getString(_cursorIndexOfTransactionType));
            final String _tmpSender;
            if (_cursor.isNull(_cursorIndexOfSender)) {
              _tmpSender = null;
            } else {
              _tmpSender = _cursor.getString(_cursorIndexOfSender);
            }
            final String _tmpReceiver;
            if (_cursor.isNull(_cursorIndexOfReceiver)) {
              _tmpReceiver = null;
            } else {
              _tmpReceiver = _cursor.getString(_cursorIndexOfReceiver);
            }
            final String _tmpTransactionId;
            if (_cursor.isNull(_cursorIndexOfTransactionId)) {
              _tmpTransactionId = null;
            } else {
              _tmpTransactionId = _cursor.getString(_cursorIndexOfTransactionId);
            }
            final String _tmpSmsText;
            if (_cursor.isNull(_cursorIndexOfSmsText)) {
              _tmpSmsText = null;
            } else {
              _tmpSmsText = _cursor.getString(_cursorIndexOfSmsText);
            }
            final Date _tmpTimestamp;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __converters.fromTimestamp(_tmp);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final boolean _tmpIsProcessed;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsProcessed);
            _tmpIsProcessed = _tmp_1 != 0;
            final Date _tmpCreatedAt;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            _tmpCreatedAt = __converters.fromTimestamp(_tmp_2);
            _item = new Transaction(_tmpId,_tmpAmount,_tmpCurrency,_tmpTransactionType,_tmpSender,_tmpReceiver,_tmpTransactionId,_tmpSmsText,_tmpTimestamp,_tmpCategory,_tmpIsProcessed,_tmpCreatedAt);
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
  public Object getTotalByType(final TransactionType type,
      final Continuation<? super Double> $completion) {
    final String _sql = "SELECT SUM(amount) FROM transactions WHERE transactionType = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, __TransactionType_enumToString(type));
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Double>() {
      @Override
      @Nullable
      public Double call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Double _result;
          if (_cursor.moveToFirst()) {
            final Double _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Transaction>> searchTransactions(final String searchTerm) {
    final String _sql = "SELECT * FROM transactions WHERE smsText LIKE '%' || ? || '%' ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchTerm == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchTerm);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"transactions"}, new Callable<List<Transaction>>() {
      @Override
      @NonNull
      public List<Transaction> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionType");
          final int _cursorIndexOfSender = CursorUtil.getColumnIndexOrThrow(_cursor, "sender");
          final int _cursorIndexOfReceiver = CursorUtil.getColumnIndexOrThrow(_cursor, "receiver");
          final int _cursorIndexOfTransactionId = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionId");
          final int _cursorIndexOfSmsText = CursorUtil.getColumnIndexOrThrow(_cursor, "smsText");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfIsProcessed = CursorUtil.getColumnIndexOrThrow(_cursor, "isProcessed");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<Transaction> _result = new ArrayList<Transaction>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Transaction _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpCurrency;
            if (_cursor.isNull(_cursorIndexOfCurrency)) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final TransactionType _tmpTransactionType;
            _tmpTransactionType = __TransactionType_stringToEnum(_cursor.getString(_cursorIndexOfTransactionType));
            final String _tmpSender;
            if (_cursor.isNull(_cursorIndexOfSender)) {
              _tmpSender = null;
            } else {
              _tmpSender = _cursor.getString(_cursorIndexOfSender);
            }
            final String _tmpReceiver;
            if (_cursor.isNull(_cursorIndexOfReceiver)) {
              _tmpReceiver = null;
            } else {
              _tmpReceiver = _cursor.getString(_cursorIndexOfReceiver);
            }
            final String _tmpTransactionId;
            if (_cursor.isNull(_cursorIndexOfTransactionId)) {
              _tmpTransactionId = null;
            } else {
              _tmpTransactionId = _cursor.getString(_cursorIndexOfTransactionId);
            }
            final String _tmpSmsText;
            if (_cursor.isNull(_cursorIndexOfSmsText)) {
              _tmpSmsText = null;
            } else {
              _tmpSmsText = _cursor.getString(_cursorIndexOfSmsText);
            }
            final Date _tmpTimestamp;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __converters.fromTimestamp(_tmp);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final boolean _tmpIsProcessed;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsProcessed);
            _tmpIsProcessed = _tmp_1 != 0;
            final Date _tmpCreatedAt;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            _tmpCreatedAt = __converters.fromTimestamp(_tmp_2);
            _item = new Transaction(_tmpId,_tmpAmount,_tmpCurrency,_tmpTransactionType,_tmpSender,_tmpReceiver,_tmpTransactionId,_tmpSmsText,_tmpTimestamp,_tmpCategory,_tmpIsProcessed,_tmpCreatedAt);
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
  public Object getUnprocessedTransactions(
      final Continuation<? super List<Transaction>> $completion) {
    final String _sql = "SELECT `transactions`.`id` AS `id`, `transactions`.`amount` AS `amount`, `transactions`.`currency` AS `currency`, `transactions`.`transactionType` AS `transactionType`, `transactions`.`sender` AS `sender`, `transactions`.`receiver` AS `receiver`, `transactions`.`transactionId` AS `transactionId`, `transactions`.`smsText` AS `smsText`, `transactions`.`timestamp` AS `timestamp`, `transactions`.`category` AS `category`, `transactions`.`isProcessed` AS `isProcessed`, `transactions`.`createdAt` AS `createdAt` FROM transactions WHERE isProcessed = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Transaction>>() {
      @Override
      @NonNull
      public List<Transaction> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfAmount = 1;
          final int _cursorIndexOfCurrency = 2;
          final int _cursorIndexOfTransactionType = 3;
          final int _cursorIndexOfSender = 4;
          final int _cursorIndexOfReceiver = 5;
          final int _cursorIndexOfTransactionId = 6;
          final int _cursorIndexOfSmsText = 7;
          final int _cursorIndexOfTimestamp = 8;
          final int _cursorIndexOfCategory = 9;
          final int _cursorIndexOfIsProcessed = 10;
          final int _cursorIndexOfCreatedAt = 11;
          final List<Transaction> _result = new ArrayList<Transaction>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Transaction _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpCurrency;
            if (_cursor.isNull(_cursorIndexOfCurrency)) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final TransactionType _tmpTransactionType;
            _tmpTransactionType = __TransactionType_stringToEnum(_cursor.getString(_cursorIndexOfTransactionType));
            final String _tmpSender;
            if (_cursor.isNull(_cursorIndexOfSender)) {
              _tmpSender = null;
            } else {
              _tmpSender = _cursor.getString(_cursorIndexOfSender);
            }
            final String _tmpReceiver;
            if (_cursor.isNull(_cursorIndexOfReceiver)) {
              _tmpReceiver = null;
            } else {
              _tmpReceiver = _cursor.getString(_cursorIndexOfReceiver);
            }
            final String _tmpTransactionId;
            if (_cursor.isNull(_cursorIndexOfTransactionId)) {
              _tmpTransactionId = null;
            } else {
              _tmpTransactionId = _cursor.getString(_cursorIndexOfTransactionId);
            }
            final String _tmpSmsText;
            if (_cursor.isNull(_cursorIndexOfSmsText)) {
              _tmpSmsText = null;
            } else {
              _tmpSmsText = _cursor.getString(_cursorIndexOfSmsText);
            }
            final Date _tmpTimestamp;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __converters.fromTimestamp(_tmp);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final boolean _tmpIsProcessed;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsProcessed);
            _tmpIsProcessed = _tmp_1 != 0;
            final Date _tmpCreatedAt;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfCreatedAt);
            }
            _tmpCreatedAt = __converters.fromTimestamp(_tmp_2);
            _item = new Transaction(_tmpId,_tmpAmount,_tmpCurrency,_tmpTransactionType,_tmpSender,_tmpReceiver,_tmpTransactionId,_tmpSmsText,_tmpTimestamp,_tmpCategory,_tmpIsProcessed,_tmpCreatedAt);
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

  private String __TransactionType_enumToString(@NonNull final TransactionType _value) {
    switch (_value) {
      case CREDIT: return "CREDIT";
      case DEBIT: return "DEBIT";
      case UNKNOWN: return "UNKNOWN";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private TransactionType __TransactionType_stringToEnum(@NonNull final String _value) {
    switch (_value) {
      case "CREDIT": return TransactionType.CREDIT;
      case "DEBIT": return TransactionType.DEBIT;
      case "UNKNOWN": return TransactionType.UNKNOWN;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
