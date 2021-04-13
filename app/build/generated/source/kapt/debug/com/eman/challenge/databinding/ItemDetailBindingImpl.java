package com.eman.challenge.databinding;
import com.eman.challenge.R;
import com.eman.challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemDetailBindingImpl extends ItemDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_img, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.containerSubdetail.setTag(null);
        this.imageItemSubdetail.setTag(null);
        this.textItemSubdetail.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.itemsMarvel == variableId) {
            setItemsMarvel((com.eman.challenge.domain.model.Items) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemsMarvel(@Nullable com.eman.challenge.domain.model.Items ItemsMarvel) {
        this.mItemsMarvel = ItemsMarvel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemsMarvel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String itemsMarvelName = null;
        com.eman.challenge.domain.model.Items itemsMarvel = mItemsMarvel;
        java.lang.String itemsMarvelResourceURI = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (itemsMarvel != null) {
                    // read itemsMarvel.name
                    itemsMarvelName = itemsMarvel.getName();
                    // read itemsMarvel.resourceURI
                    itemsMarvelResourceURI = itemsMarvel.getResourceURI();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.eman.challenge.utils.DataBindAdapterKt.setImageUrl(this.imageItemSubdetail, itemsMarvelResourceURI);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textItemSubdetail, itemsMarvelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemsMarvel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}