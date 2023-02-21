package com.example.naukaribazar.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.naukaribazar.R;

public class GridAdapterr extends BaseAdapter {
    private Context context;
    private String [] skills;

    public GridAdapterr(Context context, String [] skills) {
        this.context = context;
        this.skills = skills;
    }

    public GridAdapterr() {
    }

    @Override
    public int getCount() {
        return skills.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View view1 = LayoutInflater.from(context).inflate(R.layout.custumgrid,null,false);


       TextView textView =view1.findViewById(R.id.tetxViewd);

       textView.setText(skills[i]);

        return view1;
    }
}
