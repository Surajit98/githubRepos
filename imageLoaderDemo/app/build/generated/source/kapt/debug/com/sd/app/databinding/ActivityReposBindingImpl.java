package com.sd.app.databinding;
import com.sd.app.R;
import com.sd.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityReposBindingImpl extends ActivityReposBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityReposBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityReposBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.ProgressBar) bindings[3]
            );
        this.list.setTag(null);
        this.loadMoreProgress.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.adapter == variableId) {
            setAdapter((com.sd.app.ui.repo_activity.ReposAdapter) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.sd.app.ui.repo_activity.ReposViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAdapter(@Nullable com.sd.app.ui.repo_activity.ReposAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.sd.app.ui.repo_activity.ReposViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelFetchNextPage((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFetchNextPage(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelFetchNextPage, int fieldId) {
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
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelLoading = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelFetchNextPageGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalse = false;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingGetValue = false;
        java.lang.Boolean viewModelLoadingGetValue = null;
        boolean viewModelLoadingViewModelFetchNextPageBooleanFalse = false;
        com.sd.app.ui.repo_activity.ReposAdapter adapter = mAdapter;
        boolean ViewModelLoadingViewModelFetchNextPageBooleanFalse1 = false;
        boolean AndroidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalse1 = false;
        com.sd.app.ui.repo_activity.ReposViewModel viewModel = mViewModel;
        int AndroidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalseViewVISIBLEViewGONE1 = 0;
        java.lang.Boolean viewModelFetchNextPageGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelFetchNextPage = null;
        boolean ViewModelFetchNextPage1 = false;

        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x1bL) != 0) {



                if (viewModel != null) {
                    // read viewModel.loading
                    viewModelLoading = viewModel.getLoading();
                }
                updateLiveDataRegistration(0, viewModelLoading);


                if (viewModelLoading != null) {
                    // read viewModel.loading.getValue()
                    viewModelLoadingGetValue = viewModelLoading.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoadingGetValue);
            if((dirtyFlags & 0x1bL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingGetValue) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x500L) != 0) {

                if (viewModel != null) {
                    // read viewModel.fetchNextPage
                    viewModelFetchNextPage = viewModel.getFetchNextPage();
                }
                updateLiveDataRegistration(1, viewModelFetchNextPage);


                if (viewModelFetchNextPage != null) {
                    // read viewModel.fetchNextPage.getValue()
                    viewModelFetchNextPageGetValue = viewModelFetchNextPage.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelFetchNextPageGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelFetchNextPageGetValue);

            if ((dirtyFlags & 0x400L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue())
                    ViewModelFetchNextPage1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelFetchNextPageGetValue;
            }
        }

        if ((dirtyFlags & 0x1bL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false
                viewModelLoadingViewModelFetchNextPageBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelFetchNextPageGetValue) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false
                ViewModelLoadingViewModelFetchNextPageBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingGetValue) ? (ViewModelFetchNextPage1) : (false));


                // read androidx.databinding.ViewDataBinding.safeUnbox(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false)
                androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalse = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoadingViewModelFetchNextPageBooleanFalse);
                // read androidx.databinding.ViewDataBinding.safeUnbox(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false)
                AndroidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalse1 = androidx.databinding.ViewDataBinding.safeUnbox(ViewModelLoadingViewModelFetchNextPageBooleanFalse1);
            if((dirtyFlags & 0x1bL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalse) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x1bL) != 0) {
                if(AndroidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalse1) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false) ? View.VISIBLE : View.GONE
                androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalseViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false) ? View.VISIBLE : View.GONE
                AndroidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalseViewVISIBLEViewGONE1 = ((AndroidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.list.setAdapter(adapter);
        }
        if ((dirtyFlags & 0x1bL) != 0) {
            // api target 1

            this.loadMoreProgress.setVisibility(androidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalseViewVISIBLEViewGONE);
            this.progress.setVisibility(AndroidxDatabindingViewDataBindingSafeUnboxViewModelLoadingViewModelFetchNextPageBooleanFalseViewVISIBLEViewGONE1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loading
        flag 1 (0x2L): viewModel.fetchNextPage
        flag 2 (0x3L): adapter
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loading.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchNextPage.getValue()) : false) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}