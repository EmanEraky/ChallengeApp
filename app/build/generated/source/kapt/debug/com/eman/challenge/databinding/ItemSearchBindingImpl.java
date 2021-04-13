package com.eman.challenge.databinding;
import com.eman.challenge.R;
import com.eman.challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemSearchBindingImpl extends ItemSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[2]
            );
        this.businessImg.setTag(null);
        this.itemView.setTag(null);
        this.titleText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.marvelOut == variableId) {
            setMarvelOut((com.eman.challenge.domain.model.BaseModelMarvel) variable);
        }
        else if (BR.nListener == variableId) {
            setNListener((com.eman.challenge.presentation.NavigationListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMarvelOut(@Nullable com.eman.challenge.domain.model.BaseModelMarvel MarvelOut) {
        this.mMarvelOut = MarvelOut;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.marvelOut);
        super.requestRebind();
    }
    public void setNListener(@Nullable com.eman.challenge.presentation.NavigationListener NListener) {
        this.mNListener = NListener;
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
        com.eman.challenge.domain.model.BaseModelMarvel marvelOut = mMarvelOut;
        java.lang.String marvelOutName = null;
        java.lang.String marvelOutThumbnailPathExtension = null;
        com.eman.challenge.domain.model.MarvelImage marvelOutThumbnail = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (marvelOut != null) {
                    // read marvelOut.name
                    marvelOutName = marvelOut.getName();
                    // read marvelOut.thumbnail
                    marvelOutThumbnail = marvelOut.getThumbnail();
                }


                if (marvelOutThumbnail != null) {
                    // read marvelOut.thumbnail.pathExtension
                    marvelOutThumbnailPathExtension = marvelOutThumbnail.getPathExtension();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.eman.challenge.utils.DataBindAdapterKt.setImageUrl(this.businessImg, marvelOutThumbnailPathExtension);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, marvelOutName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): marvelOut
        flag 1 (0x2L): nListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}