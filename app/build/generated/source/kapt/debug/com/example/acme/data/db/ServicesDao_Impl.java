package com.example.acme.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.acme.data.db.model.ServiceModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ServicesDao_Impl implements ServicesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ServiceModel> __insertionAdapterOfServiceModel;

  private final EntityDeletionOrUpdateAdapter<ServiceModel> __deletionAdapterOfServiceModel;

  private final EntityDeletionOrUpdateAdapter<ServiceModel> __updateAdapterOfServiceModel;

  public ServicesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfServiceModel = new EntityInsertionAdapter<ServiceModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Services` (`id`,`idUser`,`date`,`street`,`city`,`country`,`postalCode`,`name`,`phone`,`dispatchNote`,`department`,`serviceType`,`reason`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ServiceModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getIdUser() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getIdUser());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.getStreet() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStreet());
        }
        if (value.getCity() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCity());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCountry());
        }
        if (value.getPostalCode() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPostalCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getName());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPhone());
        }
        if (value.getDispatchNote() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDispatchNote());
        }
        if (value.getDepartment() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getDepartment());
        }
        if (value.getServiceType() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getServiceType());
        }
        if (value.getReason() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getReason());
        }
      }
    };
    this.__deletionAdapterOfServiceModel = new EntityDeletionOrUpdateAdapter<ServiceModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Services` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ServiceModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfServiceModel = new EntityDeletionOrUpdateAdapter<ServiceModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Services` SET `id` = ?,`idUser` = ?,`date` = ?,`street` = ?,`city` = ?,`country` = ?,`postalCode` = ?,`name` = ?,`phone` = ?,`dispatchNote` = ?,`department` = ?,`serviceType` = ?,`reason` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ServiceModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getIdUser() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getIdUser());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.getStreet() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStreet());
        }
        if (value.getCity() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCity());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCountry());
        }
        if (value.getPostalCode() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPostalCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getName());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPhone());
        }
        if (value.getDispatchNote() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDispatchNote());
        }
        if (value.getDepartment() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getDepartment());
        }
        if (value.getServiceType() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getServiceType());
        }
        if (value.getReason() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getReason());
        }
        if (value.getId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getId());
        }
      }
    };
  }

  @Override
  public void insertService(final ServiceModel services) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfServiceModel.insert(services);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteService(final ServiceModel services) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfServiceModel.handle(services);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateService(final ServiceModel services) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfServiceModel.handle(services);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<ServiceModel> getService(final int idService) {
    final String _sql = "SELECT * FROM Services WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idService);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Services"}, false, new Callable<ServiceModel>() {
      @Override
      public ServiceModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIdUser = CursorUtil.getColumnIndexOrThrow(_cursor, "idUser");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfStreet = CursorUtil.getColumnIndexOrThrow(_cursor, "street");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfPostalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "postalCode");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfDispatchNote = CursorUtil.getColumnIndexOrThrow(_cursor, "dispatchNote");
          final int _cursorIndexOfDepartment = CursorUtil.getColumnIndexOrThrow(_cursor, "department");
          final int _cursorIndexOfServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceType");
          final int _cursorIndexOfReason = CursorUtil.getColumnIndexOrThrow(_cursor, "reason");
          final ServiceModel _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final Integer _tmpIdUser;
            if (_cursor.isNull(_cursorIndexOfIdUser)) {
              _tmpIdUser = null;
            } else {
              _tmpIdUser = _cursor.getInt(_cursorIndexOfIdUser);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpStreet;
            if (_cursor.isNull(_cursorIndexOfStreet)) {
              _tmpStreet = null;
            } else {
              _tmpStreet = _cursor.getString(_cursorIndexOfStreet);
            }
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final String _tmpPostalCode;
            if (_cursor.isNull(_cursorIndexOfPostalCode)) {
              _tmpPostalCode = null;
            } else {
              _tmpPostalCode = _cursor.getString(_cursorIndexOfPostalCode);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpDispatchNote;
            if (_cursor.isNull(_cursorIndexOfDispatchNote)) {
              _tmpDispatchNote = null;
            } else {
              _tmpDispatchNote = _cursor.getString(_cursorIndexOfDispatchNote);
            }
            final String _tmpDepartment;
            if (_cursor.isNull(_cursorIndexOfDepartment)) {
              _tmpDepartment = null;
            } else {
              _tmpDepartment = _cursor.getString(_cursorIndexOfDepartment);
            }
            final String _tmpServiceType;
            if (_cursor.isNull(_cursorIndexOfServiceType)) {
              _tmpServiceType = null;
            } else {
              _tmpServiceType = _cursor.getString(_cursorIndexOfServiceType);
            }
            final String _tmpReason;
            if (_cursor.isNull(_cursorIndexOfReason)) {
              _tmpReason = null;
            } else {
              _tmpReason = _cursor.getString(_cursorIndexOfReason);
            }
            _result = new ServiceModel(_tmpId,_tmpIdUser,_tmpDate,_tmpStreet,_tmpCity,_tmpCountry,_tmpPostalCode,_tmpName,_tmpPhone,_tmpDispatchNote,_tmpDepartment,_tmpServiceType,_tmpReason);
          } else {
            _result = null;
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
  public LiveData<List<ServiceModel>> getServices(final int user) {
    final String _sql = "SELECT * FROM Services WHERE idUser = ? ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, user);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Services"}, false, new Callable<List<ServiceModel>>() {
      @Override
      public List<ServiceModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIdUser = CursorUtil.getColumnIndexOrThrow(_cursor, "idUser");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfStreet = CursorUtil.getColumnIndexOrThrow(_cursor, "street");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfPostalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "postalCode");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfDispatchNote = CursorUtil.getColumnIndexOrThrow(_cursor, "dispatchNote");
          final int _cursorIndexOfDepartment = CursorUtil.getColumnIndexOrThrow(_cursor, "department");
          final int _cursorIndexOfServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceType");
          final int _cursorIndexOfReason = CursorUtil.getColumnIndexOrThrow(_cursor, "reason");
          final List<ServiceModel> _result = new ArrayList<ServiceModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ServiceModel _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final Integer _tmpIdUser;
            if (_cursor.isNull(_cursorIndexOfIdUser)) {
              _tmpIdUser = null;
            } else {
              _tmpIdUser = _cursor.getInt(_cursorIndexOfIdUser);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpStreet;
            if (_cursor.isNull(_cursorIndexOfStreet)) {
              _tmpStreet = null;
            } else {
              _tmpStreet = _cursor.getString(_cursorIndexOfStreet);
            }
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final String _tmpPostalCode;
            if (_cursor.isNull(_cursorIndexOfPostalCode)) {
              _tmpPostalCode = null;
            } else {
              _tmpPostalCode = _cursor.getString(_cursorIndexOfPostalCode);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpDispatchNote;
            if (_cursor.isNull(_cursorIndexOfDispatchNote)) {
              _tmpDispatchNote = null;
            } else {
              _tmpDispatchNote = _cursor.getString(_cursorIndexOfDispatchNote);
            }
            final String _tmpDepartment;
            if (_cursor.isNull(_cursorIndexOfDepartment)) {
              _tmpDepartment = null;
            } else {
              _tmpDepartment = _cursor.getString(_cursorIndexOfDepartment);
            }
            final String _tmpServiceType;
            if (_cursor.isNull(_cursorIndexOfServiceType)) {
              _tmpServiceType = null;
            } else {
              _tmpServiceType = _cursor.getString(_cursorIndexOfServiceType);
            }
            final String _tmpReason;
            if (_cursor.isNull(_cursorIndexOfReason)) {
              _tmpReason = null;
            } else {
              _tmpReason = _cursor.getString(_cursorIndexOfReason);
            }
            _item = new ServiceModel(_tmpId,_tmpIdUser,_tmpDate,_tmpStreet,_tmpCity,_tmpCountry,_tmpPostalCode,_tmpName,_tmpPhone,_tmpDispatchNote,_tmpDepartment,_tmpServiceType,_tmpReason);
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
  public LiveData<List<ServiceModel>> getAllServices() {
    final String _sql = "SELECT * FROM Services ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Services"}, false, new Callable<List<ServiceModel>>() {
      @Override
      public List<ServiceModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIdUser = CursorUtil.getColumnIndexOrThrow(_cursor, "idUser");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfStreet = CursorUtil.getColumnIndexOrThrow(_cursor, "street");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfPostalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "postalCode");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfDispatchNote = CursorUtil.getColumnIndexOrThrow(_cursor, "dispatchNote");
          final int _cursorIndexOfDepartment = CursorUtil.getColumnIndexOrThrow(_cursor, "department");
          final int _cursorIndexOfServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceType");
          final int _cursorIndexOfReason = CursorUtil.getColumnIndexOrThrow(_cursor, "reason");
          final List<ServiceModel> _result = new ArrayList<ServiceModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ServiceModel _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final Integer _tmpIdUser;
            if (_cursor.isNull(_cursorIndexOfIdUser)) {
              _tmpIdUser = null;
            } else {
              _tmpIdUser = _cursor.getInt(_cursorIndexOfIdUser);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpStreet;
            if (_cursor.isNull(_cursorIndexOfStreet)) {
              _tmpStreet = null;
            } else {
              _tmpStreet = _cursor.getString(_cursorIndexOfStreet);
            }
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final String _tmpPostalCode;
            if (_cursor.isNull(_cursorIndexOfPostalCode)) {
              _tmpPostalCode = null;
            } else {
              _tmpPostalCode = _cursor.getString(_cursorIndexOfPostalCode);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpDispatchNote;
            if (_cursor.isNull(_cursorIndexOfDispatchNote)) {
              _tmpDispatchNote = null;
            } else {
              _tmpDispatchNote = _cursor.getString(_cursorIndexOfDispatchNote);
            }
            final String _tmpDepartment;
            if (_cursor.isNull(_cursorIndexOfDepartment)) {
              _tmpDepartment = null;
            } else {
              _tmpDepartment = _cursor.getString(_cursorIndexOfDepartment);
            }
            final String _tmpServiceType;
            if (_cursor.isNull(_cursorIndexOfServiceType)) {
              _tmpServiceType = null;
            } else {
              _tmpServiceType = _cursor.getString(_cursorIndexOfServiceType);
            }
            final String _tmpReason;
            if (_cursor.isNull(_cursorIndexOfReason)) {
              _tmpReason = null;
            } else {
              _tmpReason = _cursor.getString(_cursorIndexOfReason);
            }
            _item = new ServiceModel(_tmpId,_tmpIdUser,_tmpDate,_tmpStreet,_tmpCity,_tmpCountry,_tmpPostalCode,_tmpName,_tmpPhone,_tmpDispatchNote,_tmpDepartment,_tmpServiceType,_tmpReason);
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
