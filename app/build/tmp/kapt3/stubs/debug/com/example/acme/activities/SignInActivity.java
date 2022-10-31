package com.example.acme.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/acme/activities/SignInActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "factory", "Lcom/example/acme/data/viewModel/UserViewModelFactory;", "repository", "Lcom/example/acme/data/repository/UserRepository;", "signIn", "Landroid/widget/Button;", "singUp", "Landroid/widget/TextView;", "userDataBase", "Lcom/example/acme/data/db/DatabaseACME;", "userName", "Landroid/widget/EditText;", "userPass", "viewModel", "Lcom/example/acme/data/viewModel/UserViewModel;", "initView", "", "login", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SignInActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.acme.data.viewModel.UserViewModel viewModel;
    private com.example.acme.data.db.DatabaseACME userDataBase;
    private com.example.acme.data.repository.UserRepository repository;
    private com.example.acme.data.viewModel.UserViewModelFactory factory;
    private android.widget.TextView singUp;
    private android.widget.EditText userName;
    private android.widget.EditText userPass;
    private android.widget.Button signIn;
    
    public SignInActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void login() {
    }
    
    private final void initView() {
    }
}