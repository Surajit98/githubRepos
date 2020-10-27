package com.sd.app.databinding;
import com.sd.app.R;
import com.sd.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemReposBindingImpl extends ListItemReposBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txtName, 12);
        sViewsWithIds.put(R.id.txtDesc, 13);
        sViewsWithIds.put(R.id.txtOpenIssues, 14);
        sViewsWithIds.put(R.id.txtPermission, 15);
        sViewsWithIds.put(R.id.permissionLayout, 16);
        sViewsWithIds.put(R.id.txtLicense, 17);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemReposBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ListItemReposBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.txtDescI.setTag(null);
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
        if (BR.data == variableId) {
            setData((com.sd.app.data.model.ReposResponseItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.sd.app.data.model.ReposResponseItem Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
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
        java.lang.String javaLangStringNodeIdDataLicenseNodeId = null;
        java.lang.String javaLangStringSpdxIdDataLicenseSpdxId = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPush = false;
        java.lang.String dataLicenseName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPull = false;
        java.lang.String dataLicenseKey = null;
        com.sd.app.data.model.ReposResponseItem data = mData;
        boolean dataPermissionsPush = false;
        java.lang.Integer dataOpenIssuesCount = null;
        java.lang.String javaLangStringKeyDataLicenseKey = null;
        java.lang.String javaLangStringUrlDataLicenseUrl = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdmin = false;
        boolean dataPermissionsAdmin = false;
        java.lang.String javaLangStringNameDataLicenseName = null;
        java.lang.Boolean DataPermissionsAdmin1 = null;
        boolean AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdmin1 = false;
        com.sd.app.data.model.License dataLicense = null;
        java.lang.String dataLicenseUrl = null;
        java.lang.String dataDescription = null;
        java.lang.Boolean DataPermissionsPush1 = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdminMboundView4AndroidColorMaterialOnBackgroundDisabledMboundView4AndroidColorHoloGreenDark = 0;
        boolean dataPermissionsPull = false;
        com.sd.app.data.model.Permissions dataPermissions = null;
        java.lang.Boolean DataPermissionsPull1 = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPullMboundView5AndroidColorMaterialOnBackgroundDisabledMboundView5AndroidColorHoloGreenDark = 0;
        java.lang.String dataLicenseNodeId = null;
        java.lang.String dataOpenIssuesCountToString = null;
        boolean AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsPush1 = false;
        int androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPushMboundView6AndroidColorMaterialOnBackgroundDisabledMboundView6AndroidColorHoloGreenDark = 0;
        boolean AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsPull1 = false;
        java.lang.String dataName = null;
        java.lang.String dataLicenseSpdxId = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.openIssuesCount
                    dataOpenIssuesCount = data.getOpenIssuesCount();
                    // read data.license
                    dataLicense = data.getLicense();
                    // read data.description
                    dataDescription = data.getDescription();
                    // read data.permissions
                    dataPermissions = data.getPermissions();
                    // read data.name
                    dataName = data.getName();
                }


                if (dataOpenIssuesCount != null) {
                    // read data.openIssuesCount.toString()
                    dataOpenIssuesCountToString = dataOpenIssuesCount.toString();
                }
                if (dataLicense != null) {
                    // read data.license.name
                    dataLicenseName = dataLicense.getName();
                    // read data.license.key
                    dataLicenseKey = dataLicense.getKey();
                    // read data.license.url
                    dataLicenseUrl = dataLicense.getUrl();
                    // read data.license.nodeId
                    dataLicenseNodeId = dataLicense.getNodeId();
                    // read data.license.spdxId
                    dataLicenseSpdxId = dataLicense.getSpdxId();
                }
                if (dataPermissions != null) {
                    // read data.permissions.admin
                    DataPermissionsAdmin1 = dataPermissions.getAdmin();
                    // read data.permissions.push
                    DataPermissionsPush1 = dataPermissions.getPush();
                    // read data.permissions.pull
                    DataPermissionsPull1 = dataPermissions.getPull();
                }


                // read ("Name :") + (data.license.name)
                javaLangStringNameDataLicenseName = ("Name :") + (dataLicenseName);
                // read ("Key :") + (data.license.key)
                javaLangStringKeyDataLicenseKey = ("Key :") + (dataLicenseKey);
                // read ("Url :") + (data.license.url)
                javaLangStringUrlDataLicenseUrl = ("Url :") + (dataLicenseUrl);
                // read ("Node Id :") + (data.license.nodeId)
                javaLangStringNodeIdDataLicenseNodeId = ("Node Id :") + (dataLicenseNodeId);
                // read ("Spdx Id :") + (data.license.spdxId)
                javaLangStringSpdxIdDataLicenseSpdxId = ("Spdx Id :") + (dataLicenseSpdxId);
                // read androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.admin)
                androidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdmin = androidx.databinding.ViewDataBinding.safeUnbox(DataPermissionsAdmin1);
                // read androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.push)
                AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsPush1 = androidx.databinding.ViewDataBinding.safeUnbox(DataPermissionsPush1);
                // read androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.pull)
                androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPull = androidx.databinding.ViewDataBinding.safeUnbox(DataPermissionsPull1);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.admin)
                dataPermissionsAdmin = !androidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdmin;
                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.push)
                dataPermissionsPush = !AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsPush1;
                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.pull)
                dataPermissionsPull = !androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPull;


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.admin))
                AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdmin1 = androidx.databinding.ViewDataBinding.safeUnbox(dataPermissionsAdmin);
                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.push))
                androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPush = androidx.databinding.ViewDataBinding.safeUnbox(dataPermissionsPush);
                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.pull))
                AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsPull1 = androidx.databinding.ViewDataBinding.safeUnbox(dataPermissionsPull);
            if((dirtyFlags & 0x3L) != 0) {
                if(AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdmin1) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPush) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsPull1) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.admin)) ? @android:color/material_on_background_disabled : @android:color/holo_green_dark
                androidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdminMboundView4AndroidColorMaterialOnBackgroundDisabledMboundView4AndroidColorHoloGreenDark = ((AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdmin1) ? (getColorFromResource(mboundView4, R.color.material_on_background_disabled)) : (getColorFromResource(mboundView4, android.R.color.holo_green_dark)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.push)) ? @android:color/material_on_background_disabled : @android:color/holo_green_dark
                androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPushMboundView6AndroidColorMaterialOnBackgroundDisabledMboundView6AndroidColorHoloGreenDark = ((androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPush) ? (getColorFromResource(mboundView6, R.color.material_on_background_disabled)) : (getColorFromResource(mboundView6, android.R.color.holo_green_dark)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.pull)) ? @android:color/material_on_background_disabled : @android:color/holo_green_dark
                androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPullMboundView5AndroidColorMaterialOnBackgroundDisabledMboundView5AndroidColorHoloGreenDark = ((AndroidxDatabindingViewDataBindingSafeUnboxDataPermissionsPull1) ? (getColorFromResource(mboundView5, R.color.material_on_background_disabled)) : (getColorFromResource(mboundView5, android.R.color.holo_green_dark)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, javaLangStringUrlDataLicenseUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, javaLangStringNodeIdDataLicenseNodeId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, dataOpenIssuesCountToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, javaLangStringKeyDataLicenseKey);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, javaLangStringNameDataLicenseName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, javaLangStringSpdxIdDataLicenseSpdxId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescI, dataDescription);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView4.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(androidxDatabindingViewDataBindingSafeUnboxDataPermissionsAdminMboundView4AndroidColorMaterialOnBackgroundDisabledMboundView4AndroidColorHoloGreenDark));
                this.mboundView5.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPullMboundView5AndroidColorMaterialOnBackgroundDisabledMboundView5AndroidColorHoloGreenDark));
                this.mboundView6.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(androidxDatabindingViewDataBindingSafeUnboxDataPermissionsPushMboundView6AndroidColorMaterialOnBackgroundDisabledMboundView6AndroidColorHoloGreenDark));
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.admin)) ? @android:color/material_on_background_disabled : @android:color/holo_green_dark
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.admin)) ? @android:color/material_on_background_disabled : @android:color/holo_green_dark
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.pull)) ? @android:color/material_on_background_disabled : @android:color/holo_green_dark
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.pull)) ? @android:color/material_on_background_disabled : @android:color/holo_green_dark
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.push)) ? @android:color/material_on_background_disabled : @android:color/holo_green_dark
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.permissions.push)) ? @android:color/material_on_background_disabled : @android:color/holo_green_dark
    flag mapping end*/
    //end
}