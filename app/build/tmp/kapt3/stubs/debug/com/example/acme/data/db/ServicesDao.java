package com.example.acme.data.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\r\u001a\u00020\u000bH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/acme/data/db/ServicesDao;", "", "deleteService", "", "services", "Lcom/example/acme/data/db/model/ServiceModel;", "getAllServices", "Landroidx/lifecycle/LiveData;", "", "getService", "idService", "", "getServices", "user", "insertService", "updateService", "app_debug"})
public abstract interface ServicesDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Services WHERE id = :idService")
    public abstract androidx.lifecycle.LiveData<com.example.acme.data.db.model.ServiceModel> getService(int idService);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Services WHERE idUser = :user ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.acme.data.db.model.ServiceModel>> getServices(int user);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Services ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.acme.data.db.model.ServiceModel>> getAllServices();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertService(@org.jetbrains.annotations.NotNull
    com.example.acme.data.db.model.ServiceModel services);
    
    @androidx.room.Update
    public abstract void updateService(@org.jetbrains.annotations.NotNull
    com.example.acme.data.db.model.ServiceModel services);
    
    @androidx.room.Delete
    public abstract void deleteService(@org.jetbrains.annotations.NotNull
    com.example.acme.data.db.model.ServiceModel services);
}