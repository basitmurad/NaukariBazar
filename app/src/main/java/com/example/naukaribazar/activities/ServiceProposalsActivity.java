package com.example.naukaribazar.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.naukaribazar.R;
import com.example.naukaribazar.adapter.ProposalsAdapter;
import com.example.naukaribazar.databinding.ActivityServiceProposalsBinding;
import com.example.naukaribazar.model.ProposalClass;

import java.util.ArrayList;

public class ServiceProposalsActivity extends AppCompatActivity {

    ArrayList<ProposalClass> list;
    ProposalsAdapter proposalsAdapter;

    ActivityServiceProposalsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityServiceProposalsBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());



        list = new ArrayList<>();
        list.add(new ProposalClass("User stephan","abcdefg@3434","10 Days","1500$", R.drawable.messi));
        list.add(new ProposalClass("User stephan","abcdefg@3434","10 Days","1500$",R.drawable.messi));
        list.add(new ProposalClass("User stephan","abcdefg@3434","10 Days","1500$",R.drawable.messi));
        list.add(new ProposalClass("User stephan","abcdefg@3434","10 Days","1500$",R.drawable.messi));
        list.add(new ProposalClass("User stephan","abcdefg@3434","10 Days","1500$",R.drawable.messi));
        list.add(new ProposalClass("User stephan","abcdefg@3434","10 Days","1500$",R.drawable.messi));



        proposalsAdapter = new ProposalsAdapter(list,this);
        binding.recyler.setLayoutManager(new LinearLayoutManager(this));
        binding.recyler.setAdapter(proposalsAdapter);




    }
}