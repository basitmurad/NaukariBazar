package com.example.naukaribazar.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.naukaribazar.R;
import com.example.naukaribazar.adapter.JobProposalAdapter;
import com.example.naukaribazar.databinding.ActivityChatsBinding;
import com.example.naukaribazar.model.ProposalClass;

import java.util.ArrayList;

public class ChatsActivity extends AppCompatActivity {

    ActivityChatsBinding binding;
    ArrayList<ProposalClass> list;
    JobProposalAdapter jobProposalAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = new ArrayList<>();
        list.add(new ProposalClass(R.drawable.messi,"user stpoahn","basirtbn@343"));

        jobProposalAdapter = new JobProposalAdapter(this,list);
        binding.chatRecycler.setLayoutManager(new LinearLayoutManager(this));
        binding.chatRecycler.setAdapter(jobProposalAdapter);


    }
}