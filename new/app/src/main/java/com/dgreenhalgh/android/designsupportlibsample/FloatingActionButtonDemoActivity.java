package com.dgreenhalgh.android.designsupportlibsample;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FloatingActionButtonDemoActivity extends AppCompatActivity {

    private FloatingActionButton mFloatingActionButton;

    public static Intent newIntent(Context context) {
        return new Intent(context, FloatingActionButtonDemoActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button_demo);

        mFloatingActionButton = (FloatingActionButton) findViewById(R.id.activity_floating_action_button_demo_floatingActionButton);
        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Calling 411", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
