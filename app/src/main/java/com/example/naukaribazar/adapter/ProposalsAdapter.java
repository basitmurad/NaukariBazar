package com.example.naukaribazar.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.naukaribazar.R;


import com.example.naukaribazar.activities.ChatsActivity;
import com.example.naukaribazar.activities.ServiceDetailsActivity;
import com.example.naukaribazar.databinding.ServiceProposalLayoutBinding;
import com.example.naukaribazar.model.ProposalClass;

import java.util.ArrayList;


public class ProposalsAdapter extends RecyclerView.Adapter<ProposalsAdapter.myHolder> {
    ArrayList<ProposalClass> list;
    Context context;

    public ProposalsAdapter(ArrayList<ProposalClass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ProposalsAdapter.myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.service_proposal_layout,parent,false);

        return new myHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProposalsAdapter.myHolder holder, int position) {
        ProposalClass proposalClass = list.get(position);
        holder.binding.imageStatus.setImageResource(proposalClass.getImage());
        holder.binding.userName.setText(proposalClass.getName());
        holder.binding.userEmail.setText(proposalClass.getEmailId());
        holder.binding.dollar.setText(proposalClass.getDollars());
        holder.binding.time.setText(proposalClass.getTime());



        holder.binding.serviceDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ServiceDetailsActivity.class);
                context.startActivity(intent);
            }
        });

        holder.binding.btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ChatsActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myHolder extends RecyclerView.ViewHolder {

        ServiceProposalLayoutBinding binding;
        public myHolder(@NonNull View itemView) {
            super(itemView);
            binding =  ServiceProposalLayoutBinding.bind(itemView);
        }
    }
}
