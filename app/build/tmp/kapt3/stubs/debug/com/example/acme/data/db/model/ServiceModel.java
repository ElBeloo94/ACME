package com.example.acme.data.db.model;

import java.lang.System;

@androidx.room.Entity(tableName = "Services")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/example/acme/data/db/model/ServiceModel;", "", "id", "", "idUser", "date", "", "street", "city", "country", "postalCode", "name", "phone", "dispatchNote", "department", "serviceType", "reason", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getDate", "getDepartment", "getDispatchNote", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIdUser", "getName", "getPhone", "getPostalCode", "getReason", "getServiceType", "getStreet", "app_debug"})
public final class ServiceModel {
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer idUser = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String date = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String street = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String city = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String postalCode = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String dispatchNote = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String department = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String serviceType = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String reason = null;
    
    public ServiceModel(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.Integer idUser, @org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    java.lang.String street, @org.jetbrains.annotations.Nullable
    java.lang.String city, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.Nullable
    java.lang.String postalCode, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String dispatchNote, @org.jetbrains.annotations.Nullable
    java.lang.String department, @org.jetbrains.annotations.Nullable
    java.lang.String serviceType, @org.jetbrains.annotations.Nullable
    java.lang.String reason) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getIdUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStreet() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPostalCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDispatchNote() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDepartment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getServiceType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReason() {
        return null;
    }
}