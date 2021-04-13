package com.eman.challenge.presentation.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00020\u0005`\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/eman/challenge/presentation/ui/detail/DetailsCharacterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/eman/challenge/presentation/ui/detail/DetailsCharacterAdapter$DataViewHolder;", "marvels", "", "Lcom/eman/challenge/domain/model/Items;", "(Ljava/util/List;)V", "addData", "", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DataViewHolder", "app_debug"})
public final class DetailsCharacterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter.DataViewHolder> {
    private java.util.List<com.eman.challenge.domain.model.Items> marvels;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter.DataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter.DataViewHolder holder, int position) {
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.eman.challenge.domain.model.Items> list) {
    }
    
    public DetailsCharacterAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.eman.challenge.domain.model.Items> marvels) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/eman/challenge/presentation/ui/detail/DetailsCharacterAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/eman/challenge/databinding/ItemDetailBinding;", "(Lcom/eman/challenge/databinding/ItemDetailBinding;)V", "getBinding", "()Lcom/eman/challenge/databinding/ItemDetailBinding;", "app_debug"})
    public static final class DataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.eman.challenge.databinding.ItemDetailBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.eman.challenge.databinding.ItemDetailBinding getBinding() {
            return null;
        }
        
        public DataViewHolder(@org.jetbrains.annotations.NotNull()
        com.eman.challenge.databinding.ItemDetailBinding binding) {
            super(null);
        }
    }
}