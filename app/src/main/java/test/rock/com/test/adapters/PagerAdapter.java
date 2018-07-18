package test.rock.com.test.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import test.rock.com.test.fragments.HomeFragment;
import test.rock.com.test.utils.FragNavController;


public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case FragNavController.TAB1:
                return new HomeFragment();
            case FragNavController.TAB2:
                return new HomeFragment();
            case FragNavController.TAB3:
                return new HomeFragment();
            case FragNavController.TAB4:
                return new HomeFragment();
            case FragNavController.TAB5:
                return new HomeFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}