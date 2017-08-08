package com.adgvit.allan.forum;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Allan on 08-08-2017.
 */

public class ForumPagerAdapter extends FragmentPagerAdapter {

    public ForumPagerAdapter(FragmentManager fm) {
        //required constructor
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1: ForumFrag forumFrag = new ForumFrag();
                    return forumFrag;
            case 0: UserFrag userFrag = new UserFrag();
                    return userFrag;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return  "QUESTIONS";
            case 1: return "FORUM";
        }
        return null;
    }
}
