package com.example.acme.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0019\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/acme/data/repository/ServiceRepository;", "", "database", "Lcom/example/acme/data/db/DatabaseACME;", "(Lcom/example/acme/data/db/DatabaseACME;)V", "deleteService", "", "service", "Lcom/example/acme/data/db/model/ServiceModel;", "(Lcom/example/acme/data/db/model/ServiceModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllServiceby", "Landroidx/lifecycle/LiveData;", "", "getServicebyId", "serviceId", "", "getServicesByUserId", "userId", "insertService", "updateService", "app_debug"})
public final class ServiceRepository {
    private final com.example.acme.data.db.DatabaseACME database = null;
    
    public ServiceRepository(@org.jetbrains.annotations.NotNull
    com.example.acme.data.db.DatabaseACME database) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertService(@org.jetbrains.annotations.NotNull
    com.example.acme.data.db.model.ServiceModel service, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateService(@org.jetbrains.annotations.NotNull
    com.example.acme.data.db.model.ServiceModel service, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteService(@org.jetbrains.annotations.NotNull
    com.example.acme.data.db.model.ServiceModel service, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.acme.data.db.model.ServiceModel>> getServicesByUserId(int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.acme.data.db.model.ServiceModel> getServicebyId(int serviceId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.acme.data.db.model.ServiceModel>> getAllServiceby() {
        return null;
    }
}