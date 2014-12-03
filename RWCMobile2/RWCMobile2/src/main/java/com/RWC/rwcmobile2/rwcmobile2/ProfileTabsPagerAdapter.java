package com.RWC.rwcmobile2.rwcmobile2;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * Created by John Smith on 6/21/2014.
 */
public class ProfileTabsPagerAdapter extends FragmentPagerAdapter {

    public ProfileTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Activity fragment activity
                return new ActivityTabFragment();
            case 1:
                // Portfolio fragment activity
                return new PortfolioTabFragment();
            case 2:
                // Life Path fragment activity
                return new LifepathTabFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
}