package com.example.naukaribazar.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.naukaribazar.adapter.FragmentAdapter;


import com.example.naukaribazar.databinding.ActivityStatusAndHistoryBinding;
import com.google.android.material.tabs.TabLayout;


public class StatusAndHistoryActivity extends AppCompatActivity {
ActivityStatusAndHistoryBinding binding;

    FragmentAdapter fragmentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStatusAndHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        for(int i=0; i < binding.tablayout12.getTabCount(); i++) {
//            View tab = ((ViewGroup) binding.tablayout12.getChildAt(0)).getChildAt(i);
//            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
//            p.setMargins(0, 0, 50, 0);
//            tab.requestLayout();
//        }

        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),this,binding.tablayout12.getTabCount());
        binding.viewPager.setAdapter(fragmentAdapter);



binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tablayout12));
binding.tablayout12.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        binding.viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});




    }
}