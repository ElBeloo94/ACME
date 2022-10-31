package com.example.acme.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/acme/activities/CalendarActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "ServiceDataBase", "Lcom/example/acme/data/db/DatabaseACME;", "events", "Ljava/util/ArrayList;", "Lcom/applandeo/materialcalendarview/EventDay;", "getEvents", "()Ljava/util/ArrayList;", "setEvents", "(Ljava/util/ArrayList;)V", "factory", "Lcom/example/acme/data/viewModel/ServiceViewModelFactory;", "repository", "Lcom/example/acme/data/repository/ServiceRepository;", "viewModel", "Lcom/example/acme/data/viewModel/ServiceViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class CalendarActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.acme.data.viewModel.ServiceViewModel viewModel;
    private com.example.acme.data.db.DatabaseACME ServiceDataBase;
    private com.example.acme.data.repository.ServiceRepository repository;
    private com.example.acme.data.viewModel.ServiceViewModelFactory factory;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.applandeo.materialcalendarview.EventDay> events;
    
    public CalendarActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.applandeo.materialcalendarview.EventDay> getEvents() {
        return null;
    }
    
    public final void setEvents(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.applandeo.materialcalendarview.EventDay> p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}