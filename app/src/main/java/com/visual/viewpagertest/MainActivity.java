package com.visual.viewpagertest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements DetailListener {

    private ViewPager pager;
    private FragmentPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new PagerAdapter(getSupportFragmentManager());
        initViews();
    }

    private void initViews() {
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);
    }

    @Override
    public void onDetailClick() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FragmentDetail()).addToBackStack(null).commit();
    }

    private class PagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments;

        public PagerAdapter(FragmentManager fm) {
            super(fm);

            fragments = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                fragments.add(new FragmentA());
                fragments.add(new FragmentB());
                fragments.add(new FragmentC());
                fragments.add(new FragmentD());
            }
        }

        @Override
        public Fragment getItem(int i) {
            return fragments.get(i);
        }

        @Override
        public int getCount() {
            return fragments == null ? 0 : fragments.size();
        }
    }


}
