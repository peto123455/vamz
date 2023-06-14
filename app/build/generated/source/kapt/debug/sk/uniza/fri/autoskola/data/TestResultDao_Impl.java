package sk.uniza.fri.autoskola.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TestResultDao_Impl implements TestResultDao {
  private final RoomDatabase __db;

  private final EntityDeletionOrUpdateAdapter<TestResult> __deletionAdapterOfTestResult;

  private final EntityUpsertionAdapter<TestResult> __upsertionAdapterOfTestResult;

  public TestResultDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__deletionAdapterOfTestResult = new EntityDeletionOrUpdateAdapter<TestResult>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TestResult` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TestResult value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__upsertionAdapterOfTestResult = new EntityUpsertionAdapter<TestResult>(new EntityInsertionAdapter<TestResult>(__db) {
      @Override
      public String createQuery() {
        return "INSERT INTO `TestResult` (`id`,`_points`,`_outOf`,`_date`,`_successful`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TestResult value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        stmt.bindLong(2, value.getPoints());
        stmt.bindLong(3, value.getOutOf());
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        final int _tmp = value.getSuccessful() ? 1 : 0;
        stmt.bindLong(5, _tmp);
      }
    }, new EntityDeletionOrUpdateAdapter<TestResult>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE `TestResult` SET `id` = ?,`_points` = ?,`_outOf` = ?,`_date` = ?,`_successful` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TestResult value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        stmt.bindLong(2, value.getPoints());
        stmt.bindLong(3, value.getOutOf());
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        final int _tmp = value.getSuccessful() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
      }
    });
  }

  @Override
  public Object deleteResult(final TestResult testResult,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTestResult.handle(testResult);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object upsertResult(final TestResult testResult,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfTestResult.upsert(testResult);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<TestResult>> getResults() {
    final String _sql = "SELECT * FROM TestResult ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"TestResult"}, false, new Callable<List<TestResult>>() {
      @Override
      public List<TestResult> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPoints = CursorUtil.getColumnIndexOrThrow(_cursor, "_points");
          final int _cursorIndexOfOutOf = CursorUtil.getColumnIndexOrThrow(_cursor, "_outOf");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "_date");
          final int _cursorIndexOfSuccessful = CursorUtil.getColumnIndexOrThrow(_cursor, "_successful");
          final List<TestResult> _result = new ArrayList<TestResult>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TestResult _item;
            final int _tmp_points;
            _tmp_points = _cursor.getInt(_cursorIndexOfPoints);
            final int _tmp_outOf;
            _tmp_outOf = _cursor.getInt(_cursorIndexOfOutOf);
            final String _tmp_date;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_date = null;
            } else {
              _tmp_date = _cursor.getString(_cursorIndexOfDate);
            }
            final boolean _tmp_successful;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfSuccessful);
            _tmp_successful = _tmp != 0;
            _item = new TestResult(_tmp_points,_tmp_outOf,_tmp_date,_tmp_successful);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
