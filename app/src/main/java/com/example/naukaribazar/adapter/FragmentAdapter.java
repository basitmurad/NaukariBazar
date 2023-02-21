package com.example.naukaribazar.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.naukaribazar.Fragments.ActiveFragment;
import com.example.naukaribazar.Fragments.CompleteFragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;
private  int tabs;

    public FragmentAdapter(@NonNull FragmentManager fm, Context context, int tabs) {
        super(fm);
        this.context = context;
        this.tabs = tabs;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
            {
                case 0:
                    ActiveFragment activeFragment = new ActiveFragment();
                    return activeFragment;
            case 1:
                CompleteFragment completeFragment = new CompleteFragment();
                return completeFragment;

                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return tabs;
    }
}
