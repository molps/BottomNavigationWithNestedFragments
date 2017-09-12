package com.molps.navfrag;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragPageAdapter extends FragmentPagerAdapter {
    public FragPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new FragmentPage1();
        else
            return new FragmentPage2();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
