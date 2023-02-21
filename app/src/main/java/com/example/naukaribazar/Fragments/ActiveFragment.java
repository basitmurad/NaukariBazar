package com.example.naukaribazar.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.naukaribazar.R;
import com.example.naukaribazar.adapter.StatusActiveAdapter;
import com.example.naukaribazar.databinding.FragmentActiveBinding;
import com.example.naukaribazar.model.StatusClass;

import java.util.ArrayList;


public class ActiveFragment extends Fragment {

    FragmentActiveBinding binding;


StatusActiveAdapter statusAdapter;
ArrayList<StatusClass> list;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            binding = FragmentActiveBinding.inflate(getLayoutInflater());


                list =new ArrayList<>();

        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","Thrusday 13:34","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","Thrusday 13:34","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","Thrusday 13:34","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","Thrusday 13:34","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","Thrusday 13:34","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","Thrusday 13:34","12 proposals"));
        list.add(new StatusClass(R.drawable.logo_mian,"Administrative Associate","Business Commercial Property","Thrusday 13:34","12 proposals"));


        statusAdapter = new StatusActiveAdapter(list,getActivity().getApplicationContext());
      binding.recycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        binding.recycler    .setAdapter(statusAdapter);









        return binding.getRoot();













    }
}