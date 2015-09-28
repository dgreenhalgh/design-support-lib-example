package com.dgreenhalgh.android.designsupportlibsample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(mToolbar);

        mViewPager = (ViewPager) findViewById(R.id.activity_main_viewPager);
        mViewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager()));

        mTabLayout = (TabLayout) findViewById(R.id.activity_main_tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        mNavigationView = (NavigationView) findViewById(R.id.activity_main_navigationView);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            Context context  = mNavigationView.getContext();

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.sub_item_first:
                        Intent floatingActionButtonDemoIntent = FloatingActionButtonDemoActivity.newIntent(context);
                        startActivity(floatingActionButtonDemoIntent);
                        return true;
                    case R.id.sub_item_second:
                        Intent snackbarDemoIntent = SnackbarDemoActivity.newIntent(context);
                        startActivity(snackbarDemoIntent);
                        return true;
                    case R.id.drawer_item_second:
                        Intent percentDemoIntent = PercentDemoActivity.newIntent(context);
                        startActivity(percentDemoIntent);
                        return true;
                    case R.id.drawer_item_third:
                        Intent textInputDemoIntent = TextInputDemoActivity.newIntent(context);
                        startActivity(textInputDemoIntent);
                        return true;
                }

                return false;
            }
        });
    }
}
