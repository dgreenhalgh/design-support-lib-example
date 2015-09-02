package com.dgreenhalgh.android.designsupportlibsample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

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
    }
}
