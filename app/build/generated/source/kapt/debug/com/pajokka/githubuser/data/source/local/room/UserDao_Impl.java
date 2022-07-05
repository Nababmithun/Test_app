package com.pajokka.githubuser.data.source.local.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.pajokka.githubuser.data.source.local.entity.UserEntity;
import java.lang.Class;
import java.lang.Exception;
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
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserEntity> __insertionAdapterOfUserEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserEntity = new EntityInsertionAdapter<UserEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `users` (`username`,`name`,`avatar`,`company`,`location`,`repository`,`follower`,`following`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserEntity value) {
        if (value.getUsername() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUsername());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAvatar() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAvatar());
        }
        if (value.getCompany() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCompany());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLocation());
        }
        if (value.getRepository() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRepository());
        }
        if (value.getFollower() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getFollower());
        }
        if (value.getFollowing() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFollowing());
        }
      }
    };
    this.__preparedStmtOfDeleteUser = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM users WHERE username = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertUser(final UserEntity user, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserEntity.insert(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteUser(final String username, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUser.acquire();
        int _argIndex = 1;
        if (username == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, username);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteUser.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<UserEntity>> getAllUser() {
    final String _sql = "SELECT * FROM users";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"users"}, false, new Callable<List<UserEntity>>() {
      @Override
      public List<UserEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfRepository = CursorUtil.getColumnIndexOrThrow(_cursor, "repository");
          final int _cursorIndexOfFollower = CursorUtil.getColumnIndexOrThrow(_cursor, "follower");
          final int _cursorIndexOfFollowing = CursorUtil.getColumnIndexOrThrow(_cursor, "following");
          final List<UserEntity> _result = new ArrayList<UserEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserEntity _item;
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpAvatar;
            if (_cursor.isNull(_cursorIndexOfAvatar)) {
              _tmpAvatar = null;
            } else {
              _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
            }
            final String _tmpCompany;
            if (_cursor.isNull(_cursorIndexOfCompany)) {
              _tmpCompany = null;
            } else {
              _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final String _tmpRepository;
            if (_cursor.isNull(_cursorIndexOfRepository)) {
              _tmpRepository = null;
            } else {
              _tmpRepository = _cursor.getString(_cursorIndexOfRepository);
            }
            final String _tmpFollower;
            if (_cursor.isNull(_cursorIndexOfFollower)) {
              _tmpFollower = null;
            } else {
              _tmpFollower = _cursor.getString(_cursorIndexOfFollower);
            }
            final String _tmpFollowing;
            if (_cursor.isNull(_cursorIndexOfFollowing)) {
              _tmpFollowing = null;
            } else {
              _tmpFollowing = _cursor.getString(_cursorIndexOfFollowing);
            }
            _item = new UserEntity(_tmpUsername,_tmpName,_tmpAvatar,_tmpCompany,_tmpLocation,_tmpRepository,_tmpFollower,_tmpFollowing);
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
  public Object getUserByUsername(final String username,
      final Continuation<? super UserEntity> continuation) {
    final String _sql = "SELECT * FROM users WHERE username = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserEntity>() {
      @Override
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfRepository = CursorUtil.getColumnIndexOrThrow(_cursor, "repository");
          final int _cursorIndexOfFollower = CursorUtil.getColumnIndexOrThrow(_cursor, "follower");
          final int _cursorIndexOfFollowing = CursorUtil.getColumnIndexOrThrow(_cursor, "following");
          final UserEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpAvatar;
            if (_cursor.isNull(_cursorIndexOfAvatar)) {
              _tmpAvatar = null;
            } else {
              _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
            }
            final String _tmpCompany;
            if (_cursor.isNull(_cursorIndexOfCompany)) {
              _tmpCompany = null;
            } else {
              _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final String _tmpRepository;
            if (_cursor.isNull(_cursorIndexOfRepository)) {
              _tmpRepository = null;
            } else {
              _tmpRepository = _cursor.getString(_cursorIndexOfRepository);
            }
            final String _tmpFollower;
            if (_cursor.isNull(_cursorIndexOfFollower)) {
              _tmpFollower = null;
            } else {
              _tmpFollower = _cursor.getString(_cursorIndexOfFollower);
            }
            final String _tmpFollowing;
            if (_cursor.isNull(_cursorIndexOfFollowing)) {
              _tmpFollowing = null;
            } else {
              _tmpFollowing = _cursor.getString(_cursorIndexOfFollowing);
            }
            _result = new UserEntity(_tmpUsername,_tmpName,_tmpAvatar,_tmpCompany,_tmpLocation,_tmpRepository,_tmpFollower,_tmpFollowing);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
