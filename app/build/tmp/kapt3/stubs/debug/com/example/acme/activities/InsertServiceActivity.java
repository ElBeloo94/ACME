package com.example.acme.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/acme/activities/InsertServiceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "ServiceDataBase", "Lcom/example/acme/data/db/DatabaseACME;", "addButton", "Landroid/widget/Button;", "city", "Landroid/widget/EditText;", "country", "date", "dept", "ditpach", "factory", "Lcom/example/acme/data/viewModel/ServiceViewModelFactory;", "name", "phone", "postalCode", "reason", "repository", "Lcom/example/acme/data/repository/ServiceRepository;", "street", "type", "viewModel", "Lcom/example/acme/data/viewModel/ServiceViewModel;", "initView", "", "insertar", "user", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class InsertServiceActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.acme.data.viewModel.ServiceViewModel viewModel;
    private com.example.acme.data.db.DatabaseACME ServiceDataBase;
    private com.example.acme.data.repository.ServiceRepository repository;
    private com.example.acme.data.viewModel.ServiceViewModelFactory factory;
    private android.widget.EditText name;
    private android.widget.EditText phone;
    private android.widget.EditText street;
    private android.widget.EditText city;
    private android.widget.EditText country;
    private android.widget.EditText postalCode;
    private android.widget.Button addButton;
    private android.widget.EditText date;
    private android.widget.EditText ditpach;
    private android.widget.EditText type;
    private android.widget.EditText dept;
    private android.widget.EditText reason;
    
    public InsertServiceActivity() {
        super();
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void insertar(int user) {
    }
    
    private final void initView() {
    }
}