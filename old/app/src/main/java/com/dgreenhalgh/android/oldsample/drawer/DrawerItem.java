package com.dgreenhalgh.android.oldsample.drawer;

import android.support.annotation.StringRes;

import com.dgreenhalgh.android.oldsample.R;

import java.util.ArrayList;
import java.util.List;

public enum DrawerItem {

    FIRST(DrawerItemType.HEADER, R.string.first),
    FLOATING_ACTION_BUTTON(DrawerItemType.NAVIGATION, R.string.floating_action_button),
    SNACKBAR(DrawerItemType.NAVIGATION, R.string.snackbar),
    PERCENT_FRAME_LAYOUT(DrawerItemType.NAVIGATION, R.string.percent_frame_layout),
    TEXT_INPUT_LAYOUT(DrawerItemType.NAVIGATION, R.string.text_input_layout);

    private final DrawerItemType mDrawerItemType;
    private final int mDrawerLabelResId;

    DrawerItem(DrawerItemType drawerItemType, @StringRes int drawerLabelResId) {
        mDrawerItemType = drawerItemType;
        mDrawerLabelResId = drawerLabelResId;
    }

    public DrawerItemType getDrawerItemType() {
        return mDrawerItemType;
    }

    public int getDrawerLabelResId() {
        return mDrawerLabelResId;
    }

    public static List<DrawerItem> getOrderedDrawerItemList() {
        List<DrawerItem> drawerItemList = new ArrayList<>();
        drawerItemList.add(FIRST);
        drawerItemList.add(FLOATING_ACTION_BUTTON);
        drawerItemList.add(SNACKBAR);
        drawerItemList.add(PERCENT_FRAME_LAYOUT);
        drawerItemList.add(TEXT_INPUT_LAYOUT);

        return drawerItemList;
    }
}
