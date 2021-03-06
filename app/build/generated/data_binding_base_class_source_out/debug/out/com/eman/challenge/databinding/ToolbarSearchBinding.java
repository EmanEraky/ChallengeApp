// Generated by data binding compiler. Do not edit!
package com.eman.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.eman.challenge.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ToolbarSearchBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgLogo;

  @NonNull
  public final ImageView imgSearch;

  @NonNull
  public final ConstraintLayout layoutSearch;

  protected ToolbarSearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imgLogo, ImageView imgSearch, ConstraintLayout layoutSearch) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgLogo = imgLogo;
    this.imgSearch = imgSearch;
    this.layoutSearch = layoutSearch;
  }

  @NonNull
  public static ToolbarSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.toolbar_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ToolbarSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ToolbarSearchBinding>inflateInternal(inflater, R.layout.toolbar_search, root, attachToRoot, component);
  }

  @NonNull
  public static ToolbarSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.toolbar_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ToolbarSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ToolbarSearchBinding>inflateInternal(inflater, R.layout.toolbar_search, null, false, component);
  }

  public static ToolbarSearchBinding bind(@NonNull View view) {
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
  public static ToolbarSearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (ToolbarSearchBinding)bind(component, view, R.layout.toolbar_search);
  }
}
