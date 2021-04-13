// Generated by data binding compiler. Do not edit!
package com.eman.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.eman.challenge.R;
import com.eman.challenge.domain.model.DetailMarvel;
import com.eman.challenge.presentation.ui.detail.DetailsCharacterAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final LinearLayout blockComics;

  @NonNull
  public final LinearLayout blockEvents;

  @NonNull
  public final LinearLayout blockSeries;

  @NonNull
  public final LinearLayout blockStories;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final TextView description;

  @NonNull
  public final AppCompatImageView image;

  @NonNull
  public final FrameLayout imgBack;

  @NonNull
  public final RecyclerView listComic;

  @NonNull
  public final RecyclerView listEvents;

  @NonNull
  public final RecyclerView listSeries;

  @NonNull
  public final RecyclerView listStories;

  @NonNull
  public final TextView name;

  @NonNull
  public final ProgressBar progressbar;

  @NonNull
  public final TextView titleDescription;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView txtComic;

  @NonNull
  public final TextView txtEvents;

  @NonNull
  public final TextView txtSeries;

  @NonNull
  public final TextView txtStories;

  @Bindable
  protected DetailsCharacterAdapter mAdapterComics;

  @Bindable
  protected DetailsCharacterAdapter mAdapterEvents;

  @Bindable
  protected DetailsCharacterAdapter mAdapterStores;

  @Bindable
  protected DetailsCharacterAdapter mAdapterSeries;

  @Bindable
  protected DetailMarvel mCharDetail;

  protected ActivityDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBarLayout, LinearLayout blockComics, LinearLayout blockEvents,
      LinearLayout blockSeries, LinearLayout blockStories,
      CollapsingToolbarLayout collapsingToolbar, TextView description, AppCompatImageView image,
      FrameLayout imgBack, RecyclerView listComic, RecyclerView listEvents, RecyclerView listSeries,
      RecyclerView listStories, TextView name, ProgressBar progressbar, TextView titleDescription,
      Toolbar toolbar, TextView txtComic, TextView txtEvents, TextView txtSeries,
      TextView txtStories) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarLayout = appBarLayout;
    this.blockComics = blockComics;
    this.blockEvents = blockEvents;
    this.blockSeries = blockSeries;
    this.blockStories = blockStories;
    this.collapsingToolbar = collapsingToolbar;
    this.description = description;
    this.image = image;
    this.imgBack = imgBack;
    this.listComic = listComic;
    this.listEvents = listEvents;
    this.listSeries = listSeries;
    this.listStories = listStories;
    this.name = name;
    this.progressbar = progressbar;
    this.titleDescription = titleDescription;
    this.toolbar = toolbar;
    this.txtComic = txtComic;
    this.txtEvents = txtEvents;
    this.txtSeries = txtSeries;
    this.txtStories = txtStories;
  }

  public abstract void setAdapterComics(@Nullable DetailsCharacterAdapter adapterComics);

  @Nullable
  public DetailsCharacterAdapter getAdapterComics() {
    return mAdapterComics;
  }

  public abstract void setAdapterEvents(@Nullable DetailsCharacterAdapter adapterEvents);

  @Nullable
  public DetailsCharacterAdapter getAdapterEvents() {
    return mAdapterEvents;
  }

  public abstract void setAdapterStores(@Nullable DetailsCharacterAdapter adapterStores);

  @Nullable
  public DetailsCharacterAdapter getAdapterStores() {
    return mAdapterStores;
  }

  public abstract void setAdapterSeries(@Nullable DetailsCharacterAdapter adapterSeries);

  @Nullable
  public DetailsCharacterAdapter getAdapterSeries() {
    return mAdapterSeries;
  }

  public abstract void setCharDetail(@Nullable DetailMarvel charDetail);

  @Nullable
  public DetailMarvel getCharDetail() {
    return mCharDetail;
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailsBinding>inflateInternal(inflater, R.layout.activity_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailsBinding>inflateInternal(inflater, R.layout.activity_details, null, false, component);
  }

  public static ActivityDetailsBinding bind(@NonNull View view) {
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
  public static ActivityDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDetailsBinding)bind(component, view, R.layout.activity_details);
  }
}
