package com.example.sierzega.soldiersupportapp;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sierzega.soldiersupportapp.EquipmentPanel.EquipmentFragment;
import com.example.sierzega.soldiersupportapp.PersonalInfPanel.PersonalInfFragment;
import com.example.sierzega.soldiersupportapp.TriagePanel.TriageFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager(),
                MainActivity.this));
        viewPager.setCurrentItem(1);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }


    public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
        private Context context;
        private String tabTitles[] = new String[] { "Personal information","Triage", "Equipment" };
        final int PAGE_COUNT = tabTitles.length;

        public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
            super(fm);
            this.context = context;
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position){
                case 0:
                    fragment = new PersonalInfFragment();
                    break;
                case 1:
                    fragment = new TriageFragment();
                    break;
                case 2:
                    fragment = new EquipmentFragment();
            }
            if(fragment == null) fragment = new TriageFragment();
            return fragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }
    }
}
