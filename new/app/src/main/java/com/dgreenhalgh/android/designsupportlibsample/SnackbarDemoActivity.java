package com.dgreenhalgh.android.designsupportlibsample;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class SnackbarDemoActivity extends AppCompatActivity {

    private FrameLayout mFrameLayout;
    private Button mButton;

    public static Intent newIntent(Context context) {
        return new Intent(context, SnackbarDemoActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_demo);

        mFrameLayout = (FrameLayout) findViewById(R.id.activity_snackbar_demo_frameLayout);

        mButton = (Button) findViewById(R.id.activity_snackbar_demo_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mFrameLayout, "Hello there!", Snackbar.LENGTH_LONG)
                        .setAction("Click me", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(v.getContext(), "Goodbye, toasts", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });
    }
}
