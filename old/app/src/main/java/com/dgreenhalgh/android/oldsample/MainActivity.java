package com.dgreenhalgh.android.oldsample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.astuetz.PagerSlidingTabStrip;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private PagerSlidingTabStrip mPagerSlidingTabStrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.activity_main_viewPager);
        mViewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager()));

        mPagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.activity_main_pagerSlidingTabStrip);
        mPagerSlidingTabStrip.setViewPager(mViewPager);
    }
}
