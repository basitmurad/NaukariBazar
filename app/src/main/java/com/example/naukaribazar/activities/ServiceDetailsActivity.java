package com.example.naukaribazar.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.naukaribazar.R;
import com.example.naukaribazar.adapter.GridAdapterr;
import com.example.naukaribazar.databinding.ActivitySerrviceDetailsBinding;




public class ServiceDetailsActivity extends AppCompatActivity {


    ActivitySerrviceDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySerrviceDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String [] expertise = {"figma ", "prototyping", "ui design", "ux design"
        ,"sketch",  "ui design", "user flows", "ux design"};


        GridAdapterr gridAdapterr = new GridAdapterr(this,expertise);
        binding.gridView.setAdapter(gridAdapterr);

    }
}