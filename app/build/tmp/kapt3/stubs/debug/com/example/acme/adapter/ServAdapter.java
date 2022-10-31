package com.example.acme.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/acme/adapter/ServAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/acme/adapter/ServAdapter$ViewHolder;", "context", "Landroid/content/Context;", "mList", "", "Lcom/example/acme/data/db/model/ServiceModel;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ServAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.acme.adapter.ServAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final java.util.List<com.example.acme.data.db.model.ServiceModel> mList = null;
    
    public ServAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.acme.data.db.model.ServiceModel> mList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.acme.adapter.ServAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.acme.adapter.ServAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/example/acme/adapter/ServAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "city", "Landroid/widget/TextView;", "getCity", "()Landroid/widget/TextView;", "country", "getCountry", "dateService", "getDateService", "edit", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getEdit", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "idService", "getIdService", "postalCode", "getPostalCode", "street", "getStreet", "tipeService", "getTipeService", "viewButton", "Landroid/widget/Button;", "getViewButton", "()Landroid/widget/Button;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView dateService = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView idService = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tipeService = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView street = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView city = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView country = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView postalCode = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.constraintlayout.widget.ConstraintLayout edit = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.Button viewButton = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View ItemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDateService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getIdService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTipeService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getStreet() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getCity() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getCountry() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getPostalCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.constraintlayout.widget.ConstraintLayout getEdit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.Button getViewButton() {
            return null;
        }
    }
}