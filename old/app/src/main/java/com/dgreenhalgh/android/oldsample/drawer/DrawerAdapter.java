package com.dgreenhalgh.android.oldsample.drawer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dgreenhalgh.android.oldsample.R;

import java.util.List;

public class DrawerAdapter extends RecyclerView.Adapter {

    private final Context mContext;
    private final List<DrawerItem> mDrawerItemList;

    public DrawerAdapter(Context context, List<DrawerItem> drawerItemList) {
        mContext = context;
        mDrawerItemList = drawerItemList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        DrawerItemType drawerItemType = DrawerItemType.values()[viewType];
        View view;
        switch (drawerItemType) {
            default:
            case HEADER:
                view = inflater.inflate(R.layout.list_item_drawer_header, parent, false);
                return new DrawerHeaderItemHolder(view);
            case NAVIGATION:
                view = inflater.inflate(R.layout.list_item_drawer_navigation, parent, false);
                return new DrawerNavigationItemHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DrawerItemType drawerItemType = DrawerItemType.values()[getItemViewType(position)];
        DrawerItem drawerItem = mDrawerItemList.get(position);
        String label = mContext.getString(drawerItem.getDrawerLabelResId());
        switch (drawerItemType) {
            case HEADER:
                ((DrawerHeaderItemHolder) holder).bind(label);
                break;
            case NAVIGATION:
                ((DrawerNavigationItemHolder) holder).bind(drawerItem, label);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mDrawerItemList.size();
    }

    @Override
    public int getItemViewType(int position) {
        DrawerItem drawerItem = mDrawerItemList.get(position);
        return drawerItem.getDrawerItemType().ordinal();
    }
}
