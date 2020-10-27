package com.sd.app.data.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.sd.app.data.database.dao.RepoDao;
import com.sd.app.data.database.dao.RepoDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile RepoDao _repoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `repos` (`description` TEXT, `id` INTEGER, `name` TEXT, `openIssuesCount` INTEGER, `license_key` TEXT, `license_name` TEXT, `license_nodeId` TEXT, `license_spdxId` TEXT, `license_url` TEXT, `permissions_admin` INTEGER, `permissions_pull` INTEGER, `permissions_push` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ec86673095f0bdcded3b8b13e7c6b03f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `repos`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRepos = new HashMap<String, TableInfo.Column>(12);
        _columnsRepos.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("openIssuesCount", new TableInfo.Column("openIssuesCount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("license_key", new TableInfo.Column("license_key", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("license_name", new TableInfo.Column("license_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("license_nodeId", new TableInfo.Column("license_nodeId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("license_spdxId", new TableInfo.Column("license_spdxId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("license_url", new TableInfo.Column("license_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("permissions_admin", new TableInfo.Column("permissions_admin", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("permissions_pull", new TableInfo.Column("permissions_pull", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRepos.put("permissions_push", new TableInfo.Column("permissions_push", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRepos = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRepos = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRepos = new TableInfo("repos", _columnsRepos, _foreignKeysRepos, _indicesRepos);
        final TableInfo _existingRepos = TableInfo.read(_db, "repos");
        if (! _infoRepos.equals(_existingRepos)) {
          return new RoomOpenHelper.ValidationResult(false, "repos(com.sd.app.data.model.ReposResponseItem).\n"
                  + " Expected:\n" + _infoRepos + "\n"
                  + " Found:\n" + _existingRepos);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ec86673095f0bdcded3b8b13e7c6b03f", "511558d7774dd212008a318f211c8398");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "repos");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `repos`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RepoDao getRepoDao() {
    if (_repoDao != null) {
      return _repoDao;
    } else {
      synchronized(this) {
        if(_repoDao == null) {
          _repoDao = new RepoDao_Impl(this);
        }
        return _repoDao;
      }
    }
  }
}
