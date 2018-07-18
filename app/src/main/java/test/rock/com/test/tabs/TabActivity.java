package test.rock.com.test.tabs;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.rock.com.test.R;
import test.rock.com.test.adapters.PagerAdapter;
import test.rock.com.test.fragments.HomeFragment;
import test.rock.com.test.utils.FragNavController;

public class TabActivity extends AppCompatActivity implements FragNavController.RootFragmentListener{


    @BindView(R.id.bottom_tab_layout)
    TabLayout bottomTabLayout;
    @BindView(R.id.pager)
    ViewPager pager;


    private int[] mTabIconsSelected = {
            R.drawable.home,
            R.drawable.hash,
            R.drawable.puls,
            R.drawable.profile,
            R.drawable.search,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        ButterKnife.bind(this);
        setTitle("");
        initTab();
        switchTab(0);

        bottomTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switchTab(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                switchTab(tab.getPosition());
            }
        });

        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), bottomTabLayout.getTabCount());
        pager.setAdapter(adapter);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(bottomTabLayout));
    }

    private void initTab() {
        if (bottomTabLayout != null) {
            for (int i = 0; i < mTabIconsSelected.length; i++) {
                bottomTabLayout.addTab(bottomTabLayout.newTab());
                TabLayout.Tab tab = bottomTabLayout.getTabAt(i);
                if (tab != null)
                    tab.setCustomView(getTabView(i));
            }
        }
    }


    private View getTabView(int position) {
        View view = LayoutInflater.from(TabActivity.this).inflate(R.layout.tab_item_bottom, null);
        ImageView icon =  view.findViewById(R.id.tab_icon);
        icon.setImageDrawable(getResources().getDrawable(mTabIconsSelected[position]));
        return view;
    }

    private void switchTab(int position) {
        pager.setCurrentItem(position);
    }

    @Override
    public Fragment getRootFragment(int index) {
        switch (index) {
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
        }
        throw new IllegalStateException("Need to send an index that we know");
    }

}
