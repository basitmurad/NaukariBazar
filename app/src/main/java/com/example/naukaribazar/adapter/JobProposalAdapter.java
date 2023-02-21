package com.example.naukaribazar.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.naukaribazar.R;
import com.example.naukaribazar.databinding.JobsProposalsBinding;
import com.example.naukaribazar.model.ProposalClass;

import java.util.ArrayList;

public class JobProposalAdapter extends RecyclerView.Adapter<JobProposalAdapter.MyHolder> {
    private Context context;
    ArrayList<ProposalClass> list;

    public JobProposalAdapter(Context context, ArrayList<ProposalClass> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public JobProposalAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.jobs_proposals,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JobProposalAdapter.MyHolder holder, int position) {

        ProposalClass proposalClass = list.get(position);
        holder.binding.imageProposal.setImageResource(proposalClass.getImage());
        holder.binding.nameProposal.setText(proposalClass.getName());
        holder.binding.emailProposal.setText(proposalClass.getEmailId());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        JobsProposalsBinding binding;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            binding= JobsProposalsBinding.bind(itemView);
        }
    }
}
