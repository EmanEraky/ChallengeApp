package com.eman.challenge.databinding;
import com.eman.challenge.R;
import com.eman.challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityDetailsBindingImpl extends ActivityDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 8);
        sViewsWithIds.put(R.id.collapsing_toolbar, 9);
        sViewsWithIds.put(R.id.toolbar, 10);
        sViewsWithIds.put(R.id.img_back, 11);
        sViewsWithIds.put(R.id.titleDescription, 12);
        sViewsWithIds.put(R.id.block_comics, 13);
        sViewsWithIds.put(R.id.txt_comic, 14);
        sViewsWithIds.put(R.id.block_events, 15);
        sViewsWithIds.put(R.id.txt_events, 16);
        sViewsWithIds.put(R.id.block_stories, 17);
        sViewsWithIds.put(R.id.txt_stories, 18);
        sViewsWithIds.put(R.id.block_series, 19);
        sViewsWithIds.put(R.id.txt_series, 20);
        sViewsWithIds.put(R.id.progressbar, 21);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[17]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.FrameLayout) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ProgressBar) bindings[21]
            , (android.widget.TextView) bindings[12]
            , (androidx.appcompat.widget.Toolbar) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[18]
            );
        this.description.setTag(null);
        this.image.setTag(null);
        this.listComic.setTag(null);
        this.listEvents.setTag(null);
        this.listSeries.setTag(null);
        this.listStories.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.adapterStores == variableId) {
            setAdapterStores((com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter) variable);
        }
        else if (BR.adapterComics == variableId) {
            setAdapterComics((com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter) variable);
        }
        else if (BR.charDetail == variableId) {
            setCharDetail((com.eman.challenge.domain.model.DetailMarvel) variable);
        }
        else if (BR.adapterSeries == variableId) {
            setAdapterSeries((com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter) variable);
        }
        else if (BR.adapterEvents == variableId) {
            setAdapterEvents((com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAdapterStores(@Nullable com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter AdapterStores) {
        this.mAdapterStores = AdapterStores;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.adapterStores);
        super.requestRebind();
    }
    public void setAdapterComics(@Nullable com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter AdapterComics) {
        this.mAdapterComics = AdapterComics;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.adapterComics);
        super.requestRebind();
    }
    public void setCharDetail(@Nullable com.eman.challenge.domain.model.DetailMarvel CharDetail) {
        this.mCharDetail = CharDetail;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.charDetail);
        super.requestRebind();
    }
    public void setAdapterSeries(@Nullable com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter AdapterSeries) {
        this.mAdapterSeries = AdapterSeries;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.adapterSeries);
        super.requestRebind();
    }
    public void setAdapterEvents(@Nullable com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter AdapterEvents) {
        this.mAdapterEvents = AdapterEvents;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.adapterEvents);
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
        java.lang.String charDetailName = null;
        com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter adapterStores = mAdapterStores;
        com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter adapterComics = mAdapterComics;
        com.eman.challenge.domain.model.DetailMarvel charDetail = mCharDetail;
        com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter adapterSeries = mAdapterSeries;
        java.lang.String charDetailDescription = null;
        com.eman.challenge.domain.model.MarvelImage charDetailThumbnail = null;
        java.lang.String charDetailThumbnailPathExtension = null;
        com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter adapterEvents = mAdapterEvents;

        if ((dirtyFlags & 0x21L) != 0) {
        }
        if ((dirtyFlags & 0x22L) != 0) {
        }
        if ((dirtyFlags & 0x24L) != 0) {



                if (charDetail != null) {
                    // read charDetail.name
                    charDetailName = charDetail.getName();
                    // read charDetail.description
                    charDetailDescription = charDetail.getDescription();
                    // read charDetail.thumbnail
                    charDetailThumbnail = charDetail.getThumbnail();
                }


                if (charDetailThumbnail != null) {
                    // read charDetail.thumbnail.pathExtension
                    charDetailThumbnailPathExtension = charDetailThumbnail.getPathExtension();
                }
        }
        if ((dirtyFlags & 0x28L) != 0) {
        }
        if ((dirtyFlags & 0x30L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, charDetailDescription);
            com.eman.challenge.utils.DataBindAdapterKt.setImageUrl(this.image, charDetailThumbnailPathExtension);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, charDetailName);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            this.listComic.setAdapter(adapterComics);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.listEvents.setAdapter(adapterEvents);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.listSeries.setAdapter(adapterSeries);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            this.listStories.setAdapter(adapterStores);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): adapterStores
        flag 1 (0x2L): adapterComics
        flag 2 (0x3L): charDetail
        flag 3 (0x4L): adapterSeries
        flag 4 (0x5L): adapterEvents
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}