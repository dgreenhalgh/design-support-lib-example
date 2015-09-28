package com.dgreenhalgh.android.designsupportlibsample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FloatingActionButtonDemoActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, FloatingActionButtonDemoActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button_demo);
    }
}
