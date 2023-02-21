package com.example.naukaribazar.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naukaribazar.R;
import com.example.naukaribazar.adapter.StatusActiveAdapter;
import com.example.naukaribazar.adapter.StatusCompleteAdapter;
import com.example.naukaribazar.databinding.FragmentActiveBinding;
import com.example.naukaribazar.databinding.FragmentCompleteBinding;
import com.example.naukaribazar.model.StatusClass;

import java.util.ArrayList;


public class CompleteFragment extends Fragment {


ArrayList<StatusClass> list;

StatusCompleteAdapter statusAdapter;
FragmentCompleteBinding binding;

    @SuppressLint("SuspiciousIndentation")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCompleteBinding.inflate(getLayoutInflater());


        list = new ArrayList<>();


        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","12/12/23 13:00","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","12/12/23 13:00","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","12/12/23 13:00","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","12/12/23 13:00","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","12/12/23 13:00","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","12/12/23 13:00","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","12/12/23 13:00","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","12/12/23 13:00","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","12/12/23 13:00","12 proposals"));



        statusAdapter = new StatusCompleteAdapter(list,getActivity().getApplicationContext());
       binding.recycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        binding.recycler.setAdapter(statusAdapter);



        return binding.getRoot();
    }
}