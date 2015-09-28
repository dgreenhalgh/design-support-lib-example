package com.dgreenhalgh.android.designsupportlibsample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TextInputDemoActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, TextInputDemoActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_demo);
    }
}
