package com.example.kupengfinance.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kupengfinance.Adapter.SectionPagerAdapter;
import com.example.kupengfinance.R;
import com.google.android.material.tabs.TabLayout;

public class TransactionFragment extends Fragment {
    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;

    public TransactionFragment() {
        // Required empty public constructor
    }


    public static TransactionFragment getInstance() {
        return new TransactionFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_transaction, container, false);

        viewPager = myFragment.findViewById(R.id.viewPager);
        tabLayout = myFragment.findViewById(R.id.tabLayout);

        return myFragment;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new JanuaryFragment(), "January");
        adapter.addFragment(new FebruaryFragment(), "February");
        adapter.addFragment(new MarchFragment(), "March");
        adapter.addFragment(new AprilFragment(), "April");
        adapter.addFragment(new MayFragment(), "May");
        adapter.addFragment(new JuneFragment(), "June");
        adapter.addFragment(new JulyFragment(), "July");
        adapter.addFragment(new AugustFragment(), "August");
        adapter.addFragment(new SeptemberFragment(), "September");
        adapter.addFragment(new OctoberFragment(), "October");
        adapter.addFragment(new NovemberFragment(), "November");
        adapter.addFragment(new DecemberFragment(), "December");


        viewPager.setAdapter(adapter);
    }
}