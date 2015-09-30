package com.dgreenhalgh.android.oldsample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;
import com.nispok.snackbar.listeners.ActionClickListener;

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
                SnackbarManager.show(
                        Snackbar.with(v.getContext())
                                .text("Hello there!")
                                .actionLabel("Click me!")
                                .actionListener(new ActionClickListener() {
                                    @Override
                                    public void onActionClicked(Snackbar snackbar) {
                                        Toast.makeText(snackbar.getContext(), "Goodbye, toasts", Toast.LENGTH_SHORT).show();
                                    }
                                })
                );
            }
        });
    }
}
