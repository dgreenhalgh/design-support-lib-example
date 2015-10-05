package com.dgreenhalgh.android.oldsample.drawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dgreenhalgh.android.oldsample.FloatingActionButtonDemoActivity;
import com.dgreenhalgh.android.oldsample.PercentDemoActivity;
import com.dgreenhalgh.android.oldsample.SnackbarDemoActivity;
import com.dgreenhalgh.android.oldsample.TextInputDemoActivity;

public class DrawerNavigationItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView mTextView;

    private Context mContext;
    private DrawerItem mDrawerItem;

    public DrawerNavigationItemHolder(View itemView) {
        super(itemView);

        mTextView = (TextView) itemView;
        mContext = itemView.getContext();

        itemView.setOnClickListener(this);
    }

    public void bind(DrawerItem drawerItem, String labelText) {
        mDrawerItem = drawerItem;
        mTextView.setText(labelText);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (mDrawerItem) {
            case FLOATING_ACTION_BUTTON:
                intent = new Intent(mContext, FloatingActionButtonDemoActivity.class);
                break;
            case SNACKBAR:
                intent = new Intent(mContext, SnackbarDemoActivity.class);
                break;
            case PERCENT_FRAME_LAYOUT:
                intent = new Intent(mContext, PercentDemoActivity.class);
                break;
            case TEXT_INPUT_LAYOUT:
                intent = new Intent(mContext, TextInputDemoActivity.class);
                break;
        }

        mContext.startActivity(intent);
    }
}
