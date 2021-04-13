package com.eman.challenge.presentation.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/eman/challenge/presentation/ui/main/MainCharacterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/eman/challenge/presentation/ui/main/MainCharacterAdapter$DataViewHolder;", "characters", "", "Lcom/eman/challenge/domain/model/BaseModelMarvel;", "listener", "Lcom/eman/challenge/presentation/NavigationListener;", "(Ljava/util/List;Lcom/eman/challenge/presentation/NavigationListener;)V", "getListener", "()Lcom/eman/challenge/presentation/NavigationListener;", "setListener", "(Lcom/eman/challenge/presentation/NavigationListener;)V", "addData", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DataViewHolder", "app_debug"})
public final class MainCharacterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.eman.challenge.presentation.ui.main.MainCharacterAdapter.DataViewHolder> {
    private java.util.List<? extends com.eman.challenge.domain.model.BaseModelMarvel> characters;
    @org.jetbrains.annotations.NotNull()
    private com.eman.challenge.presentation.NavigationListener listener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.eman.challenge.presentation.ui.main.MainCharacterAdapter.DataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.eman.challenge.presentation.ui.main.MainCharacterAdapter.DataViewHolder holder, int position) {
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.eman.challenge.domain.model.BaseModelMarvel> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.challenge.presentation.NavigationListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.eman.challenge.presentation.NavigationListener p0) {
    }
    
    public MainCharacterAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.eman.challenge.domain.model.BaseModelMarvel> characters, @org.jetbrains.annotations.NotNull()
    com.eman.challenge.presentation.NavigationListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/eman/challenge/presentation/ui/main/MainCharacterAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/eman/challenge/databinding/RowCharacterBinding;", "(Lcom/eman/challenge/databinding/RowCharacterBinding;)V", "getBinding", "()Lcom/eman/challenge/databinding/RowCharacterBinding;", "app_debug"})
    public static final class DataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.eman.challenge.databinding.RowCharacterBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.eman.challenge.databinding.RowCharacterBinding getBinding() {
            return null;
        }
        
        public DataViewHolder(@org.jetbrains.annotations.NotNull()
        com.eman.challenge.databinding.RowCharacterBinding binding) {
            super(null);
        }
    }
}