package com.sd.app.data.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.sd.app.data.model.License;
import com.sd.app.data.model.Permissions;
import com.sd.app.data.model.ReposResponseItem;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RepoDao_Impl implements RepoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ReposResponseItem> __insertionAdapterOfReposResponseItem;

  public RepoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfReposResponseItem = new EntityInsertionAdapter<ReposResponseItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `repos` (`description`,`id`,`name`,`openIssuesCount`,`license_key`,`license_name`,`license_nodeId`,`license_spdxId`,`license_url`,`permissions_admin`,`permissions_pull`,`permissions_push`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReposResponseItem value) {
        if (value.getDescription() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getDescription());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getOpenIssuesCount() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getOpenIssuesCount());
        }
        final License _tmpLicense = value.getLicense();
        if(_tmpLicense != null) {
          if (_tmpLicense.getKey() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpLicense.getKey());
          }
          if (_tmpLicense.getName() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpLicense.getName());
          }
          if (_tmpLicense.getNodeId() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpLicense.getNodeId());
          }
          if (_tmpLicense.getSpdxId() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpLicense.getSpdxId());
          }
          if (_tmpLicense.getUrl() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpLicense.getUrl());
          }
        } else {
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
        }
        final Permissions _tmpPermissions = value.getPermissions();
        if(_tmpPermissions != null) {
          final Integer _tmp;
          _tmp = _tmpPermissions.getAdmin() == null ? null : (_tmpPermissions.getAdmin() ? 1 : 0);
          if (_tmp == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindLong(10, _tmp);
          }
          final Integer _tmp_1;
          _tmp_1 = _tmpPermissions.getPull() == null ? null : (_tmpPermissions.getPull() ? 1 : 0);
          if (_tmp_1 == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindLong(11, _tmp_1);
          }
          final Integer _tmp_2;
          _tmp_2 = _tmpPermissions.getPush() == null ? null : (_tmpPermissions.getPush() ? 1 : 0);
          if (_tmp_2 == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindLong(12, _tmp_2);
          }
        } else {
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
        }
      }
    };
  }

  @Override
  public void insert(final ReposResponseItem repo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfReposResponseItem.insert(repo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<ReposResponseItem> repo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfReposResponseItem.insert(repo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<ReposResponseItem>> getRepos(final int offset) {
    final String _sql = "select * from repos limit 10 offset ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, offset);
    return __db.getInvalidationTracker().createLiveData(new String[]{"repos"}, false, new Callable<List<ReposResponseItem>>() {
      @Override
      public List<ReposResponseItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfOpenIssuesCount = CursorUtil.getColumnIndexOrThrow(_cursor, "openIssuesCount");
          final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "license_key");
          final int _cursorIndexOfName_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "license_name");
          final int _cursorIndexOfNodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "license_nodeId");
          final int _cursorIndexOfSpdxId = CursorUtil.getColumnIndexOrThrow(_cursor, "license_spdxId");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "license_url");
          final int _cursorIndexOfAdmin = CursorUtil.getColumnIndexOrThrow(_cursor, "permissions_admin");
          final int _cursorIndexOfPull = CursorUtil.getColumnIndexOrThrow(_cursor, "permissions_pull");
          final int _cursorIndexOfPush = CursorUtil.getColumnIndexOrThrow(_cursor, "permissions_push");
          final List<ReposResponseItem> _result = new ArrayList<ReposResponseItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ReposResponseItem _item;
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final Integer _tmpOpenIssuesCount;
            if (_cursor.isNull(_cursorIndexOfOpenIssuesCount)) {
              _tmpOpenIssuesCount = null;
            } else {
              _tmpOpenIssuesCount = _cursor.getInt(_cursorIndexOfOpenIssuesCount);
            }
            final License _tmpLicense;
            if (! (_cursor.isNull(_cursorIndexOfKey) && _cursor.isNull(_cursorIndexOfName_1) && _cursor.isNull(_cursorIndexOfNodeId) && _cursor.isNull(_cursorIndexOfSpdxId) && _cursor.isNull(_cursorIndexOfUrl))) {
              final String _tmpKey;
              _tmpKey = _cursor.getString(_cursorIndexOfKey);
              final String _tmpName_1;
              _tmpName_1 = _cursor.getString(_cursorIndexOfName_1);
              final String _tmpNodeId;
              _tmpNodeId = _cursor.getString(_cursorIndexOfNodeId);
              final String _tmpSpdxId;
              _tmpSpdxId = _cursor.getString(_cursorIndexOfSpdxId);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              _tmpLicense = new License(_tmpKey,_tmpName_1,_tmpNodeId,_tmpSpdxId,_tmpUrl);
            }  else  {
              _tmpLicense = null;
            }
            final Permissions _tmpPermissions;
            if (! (_cursor.isNull(_cursorIndexOfAdmin) && _cursor.isNull(_cursorIndexOfPull) && _cursor.isNull(_cursorIndexOfPush))) {
              final Boolean _tmpAdmin;
              final Integer _tmp;
              if (_cursor.isNull(_cursorIndexOfAdmin)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getInt(_cursorIndexOfAdmin);
              }
              _tmpAdmin = _tmp == null ? null : _tmp != 0;
              final Boolean _tmpPull;
              final Integer _tmp_1;
              if (_cursor.isNull(_cursorIndexOfPull)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getInt(_cursorIndexOfPull);
              }
              _tmpPull = _tmp_1 == null ? null : _tmp_1 != 0;
              final Boolean _tmpPush;
              final Integer _tmp_2;
              if (_cursor.isNull(_cursorIndexOfPush)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getInt(_cursorIndexOfPush);
              }
              _tmpPush = _tmp_2 == null ? null : _tmp_2 != 0;
              _tmpPermissions = new Permissions(_tmpAdmin,_tmpPull,_tmpPush);
            }  else  {
              _tmpPermissions = null;
            }
            _item = new ReposResponseItem(_tmpDescription,_tmpId,_tmpLicense,_tmpName,_tmpOpenIssuesCount,_tmpPermissions);
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
}
