package com.dgreenhalgh.android.oldsample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.astuetz.PagerSlidingTabStrip;
import com.dgreenhalgh.android.oldsample.drawer.DrawerAdapter;
import com.dgreenhalgh.android.oldsample.drawer.DrawerItem;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private PagerSlidingTabStrip mPagerSlidingTabStrip;
    private RecyclerView mDrawerRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.activity_main_viewPager);
        mViewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager()));

        mPagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.activity_main_pagerSlidingTabStrip);
        mPagerSlidingTabStrip.setViewPager(mViewPager);

        mDrawerRecyclerView = (RecyclerView) findViewById(R.id.activity_main_drawer_recyclerView);
        mDrawerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDrawerRecyclerView.setAdapter(new DrawerAdapter(this, DrawerItem.getOrderedDrawerItemList()));
    }
}
