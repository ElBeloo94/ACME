package com.example.acme.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/acme/activities/InsertServiceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "ServiceDataBase", "Lcom/example/acme/data/db/DatabaseACME;", "addButton", "Landroid/widget/Button;", "adress", "Landroid/widget/EditText;", "date", "dept", "ditpach", "factory", "Lcom/example/acme/data/viewModel/ServiceViewModelFactory;", "name", "phone", "reason", "repository", "Lcom/example/acme/data/repository/ServiceRepository;", "type", "viewModel", "Lcom/example/acme/data/viewModel/ServiceViewModel;", "initView", "", "insertar", "user", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public final class InsertServiceActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.acme.data.viewModel.ServiceViewModel viewModel;
    private com.example.acme.data.db.DatabaseACME ServiceDataBase;
    private com.example.acme.data.repository.ServiceRepository repository;
    private com.example.acme.data.viewModel.ServiceViewModelFactory factory;
    private android.widget.EditText name;
    private android.widget.EditText phone;
    private android.widget.EditText adress;
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
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void insertar(int user) {
    }
    
    private final void initView() {
    }
}