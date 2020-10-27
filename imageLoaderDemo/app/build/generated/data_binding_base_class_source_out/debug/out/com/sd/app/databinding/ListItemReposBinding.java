// Generated by data binding compiler. Do not edit!
package com.sd.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sd.app.R;
import com.sd.app.data.model.ReposResponseItem;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemReposBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout permissionLayout;

  @NonNull
  public final TextView txtDesc;

  @NonNull
  public final TextView txtDescI;

  @NonNull
  public final TextView txtLicense;

  @NonNull
  public final TextView txtName;

  @NonNull
  public final TextView txtOpenIssues;

  @NonNull
  public final TextView txtPermission;

  @Bindable
  protected ReposResponseItem mData;

  protected ListItemReposBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout permissionLayout, TextView txtDesc, TextView txtDescI, TextView txtLicense,
      TextView txtName, TextView txtOpenIssues, TextView txtPermission) {
    super(_bindingComponent, _root, _localFieldCount);
    this.permissionLayout = permissionLayout;
    this.txtDesc = txtDesc;
    this.txtDescI = txtDescI;
    this.txtLicense = txtLicense;
    this.txtName = txtName;
    this.txtOpenIssues = txtOpenIssues;
    this.txtPermission = txtPermission;
  }

  public abstract void setData(@Nullable ReposResponseItem data);

  @Nullable
  public ReposResponseItem getData() {
    return mData;
  }

  @NonNull
  public static ListItemReposBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_repos, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemReposBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemReposBinding>inflateInternal(inflater, R.layout.list_item_repos, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemReposBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_repos, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemReposBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemReposBinding>inflateInternal(inflater, R.layout.list_item_repos, null, false, component);
  }

  public static ListItemReposBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListItemReposBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemReposBinding)bind(component, view, R.layout.list_item_repos);
  }
}