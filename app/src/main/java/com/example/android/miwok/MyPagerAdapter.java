package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ADMIN on 08-05-2018.
 */


    public class MyPagerAdapter extends FragmentPagerAdapter {

   // private String[] tabtitle = {"Numbers", "Family", "Colors","Phrases"};
    private  Context mContext;

        public MyPagerAdapter(Context context, FragmentManager fm) {

            super(fm);
            mContext = context;

        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: return new NumbersFragment();
                case 1: return new FamilyFragment();
                case 2: return new ColorsFragment();
                case 3: return new PhrasesFragment();
                default: return new NumbersFragment();
            }
        }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getString(R.string.category_colors);
        } else {
            return mContext.getString(R.string.category_phrases);
        }
    }

    @Override
        public int getCount() {
            return 4;
        }
    }


