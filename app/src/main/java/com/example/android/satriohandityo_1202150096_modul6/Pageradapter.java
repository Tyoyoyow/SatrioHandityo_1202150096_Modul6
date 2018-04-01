package com.example.android.satriohandityo_1202150096_modul6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by tyo on 01/04/18.
 */

public class Pageradapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public Pageradapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new TabTimeline();

            case 1:
                return new TabProfile();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
