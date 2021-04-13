package com.eman.challenge.databinding;
import com.eman.challenge.R;
import com.eman.challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_search", "layout_search"},
            new int[] {2, 3},
            new int[] {com.eman.challenge.R.layout.toolbar_search,
                com.eman.challenge.R.layout.layout_search});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.progress_bar, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.eman.challenge.databinding.LayoutSearchBinding) bindings[3]
            , (android.widget.ProgressBar) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.eman.challenge.databinding.ToolbarSearchBinding) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        toolSearch.invalidateAll();
        laySearch.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolSearch.hasPendingBindings()) {
            return true;
        }
        if (laySearch.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainAdapter == variableId) {
            setMainAdapter((com.eman.challenge.presentation.ui.main.MainCharacterAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainAdapter(@Nullable com.eman.challenge.presentation.ui.main.MainCharacterAdapter MainAdapter) {
        this.mMainAdapter = MainAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mainAdapter);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolSearch.setLifecycleOwner(lifecycleOwner);
        laySearch.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLaySearch((com.eman.challenge.databinding.LayoutSearchBinding) object, fieldId);
            case 1 :
                return onChangeToolSearch((com.eman.challenge.databinding.ToolbarSearchBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLaySearch(com.eman.challenge.databinding.LayoutSearchBinding LaySearch, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolSearch(com.eman.challenge.databinding.ToolbarSearchBinding ToolSearch, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        com.eman.challenge.presentation.ui.main.MainCharacterAdapter mainAdapter = mMainAdapter;

        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.recyclerView.setAdapter(mainAdapter);
        }
        executeBindingsOn(toolSearch);
        executeBindingsOn(laySearch);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): laySearch
        flag 1 (0x2L): toolSearch
        flag 2 (0x3L): mainAdapter
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}