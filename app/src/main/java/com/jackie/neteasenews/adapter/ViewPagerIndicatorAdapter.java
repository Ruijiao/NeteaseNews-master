package com.jackie.neteasenews.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.widget.TextView;

import com.jackie.neteasenews.R;

import java.util.List;

public class ViewPagerIndicatorAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList;
    private List<View> mCurrentTitleList;


    public ViewPagerIndicatorAdapter(FragmentManager fm, List<Fragment> fragmentList, List<View> currentItemList) {
        super(fm);
        this.mFragmentList = fragmentList;
        this.mCurrentTitleList = currentItemList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        TextView textView = (TextView) mCurrentTitleList.get(position).findViewById(R.id.a_main_tab_item_title);
        return textView.getText().toString();
    }
}