package com.dgreenhalgh.android.oldsample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PercentDemoActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, PercentDemoActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent_demo);
    }
}
