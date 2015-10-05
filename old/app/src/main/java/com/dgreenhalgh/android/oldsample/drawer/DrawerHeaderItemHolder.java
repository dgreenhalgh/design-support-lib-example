package com.dgreenhalgh.android.oldsample.drawer;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class DrawerHeaderItemHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public DrawerHeaderItemHolder(View itemView) {
        super(itemView);

        mTextView = (TextView) itemView;
    }

    public void bind(String headerText) {
        mTextView.setText(headerText);
    }
}
