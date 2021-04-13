package com.eman.challenge;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.eman.challenge.databinding.ActivityDetailsBindingImpl;
import com.eman.challenge.databinding.ActivityMainBindingImpl;
import com.eman.challenge.databinding.ItemDetailBindingImpl;
import com.eman.challenge.databinding.ItemSearchBindingImpl;
import com.eman.challenge.databinding.LayoutSearchBindingImpl;
import com.eman.challenge.databinding.RowCharacterBindingImpl;
import com.eman.challenge.databinding.ToolbarSearchBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDETAILS = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ITEMDETAIL = 3;

  private static final int LAYOUT_ITEMSEARCH = 4;

  private static final int LAYOUT_LAYOUTSEARCH = 5;

  private static final int LAYOUT_ROWCHARACTER = 6;

  private static final int LAYOUT_TOOLBARSEARCH = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eman.challenge.R.layout.activity_details, LAYOUT_ACTIVITYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eman.challenge.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eman.challenge.R.layout.item_detail, LAYOUT_ITEMDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eman.challenge.R.layout.item_search, LAYOUT_ITEMSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eman.challenge.R.layout.layout_search, LAYOUT_LAYOUTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eman.challenge.R.layout.row_character, LAYOUT_ROWCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eman.challenge.R.layout.toolbar_search, LAYOUT_TOOLBARSEARCH);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDETAILS: {
          if ("layout/activity_details_0".equals(tag)) {
            return new ActivityDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDETAIL: {
          if ("layout/item_detail_0".equals(tag)) {
            return new ItemDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCH: {
          if ("layout/item_search_0".equals(tag)) {
            return new ItemSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSEARCH: {
          if ("layout/layout_search_0".equals(tag)) {
            return new LayoutSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWCHARACTER: {
          if ("layout/row_character_0".equals(tag)) {
            return new RowCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_character is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBARSEARCH: {
          if ("layout/toolbar_search_0".equals(tag)) {
            return new ToolbarSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar_search is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapterComics");
      sKeys.put(2, "adapterEvents");
      sKeys.put(3, "adapterSeries");
      sKeys.put(4, "adapterStores");
      sKeys.put(5, "charDetail");
      sKeys.put(6, "itemsMarvel");
      sKeys.put(7, "mainAdapter");
      sKeys.put(8, "marvelOut");
      sKeys.put(9, "nListener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_details_0", com.eman.challenge.R.layout.activity_details);
      sKeys.put("layout/activity_main_0", com.eman.challenge.R.layout.activity_main);
      sKeys.put("layout/item_detail_0", com.eman.challenge.R.layout.item_detail);
      sKeys.put("layout/item_search_0", com.eman.challenge.R.layout.item_search);
      sKeys.put("layout/layout_search_0", com.eman.challenge.R.layout.layout_search);
      sKeys.put("layout/row_character_0", com.eman.challenge.R.layout.row_character);
      sKeys.put("layout/toolbar_search_0", com.eman.challenge.R.layout.toolbar_search);
    }
  }
}
