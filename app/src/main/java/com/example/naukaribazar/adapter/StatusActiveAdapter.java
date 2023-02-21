package com.example.naukaribazar.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.naukaribazar.R;
import com.example.naukaribazar.activities.ServiceProposalsActivity;
import com.example.naukaribazar.databinding.StatusActiveLayoutBinding;

import com.example.naukaribazar.model.StatusClass;

import java.util.ArrayList;

public class StatusActiveAdapter extends RecyclerView.Adapter<StatusActiveAdapter.Myholder> {

    ArrayList<StatusClass> list;
    private Context context;
    StatusActiveAdapter statusAdapter;


    public StatusActiveAdapter(ArrayList<StatusClass> list, Context context) {
        this.list = list;
        this.context = context;


    }

    @NonNull
    @Override
    public StatusActiveAdapter.Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.status_active_layout,parent,false);

        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusActiveAdapter.Myholder holder, int position) {
        StatusClass statusClass = list.get(position);

        holder.binding.logoImage.setImageResource(statusClass.getLogo());
        holder.binding.dateTextview.setText(statusClass.getTime());
        holder.binding.proposalTextview.setText(statusClass.getProposals());
        holder.binding.companyName.setText(statusClass.getCompanyName());
        holder.binding.companySubtitle.setText(statusClass.getCompanySubTitle());

holder.binding.btnViewProposals.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(context, "Clicked Successfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(context, ServiceProposalsActivity.class);
intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

    }
});


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Myholder  extends  RecyclerView.ViewHolder{

        StatusActiveLayoutBinding binding;
        public Myholder(@NonNull View itemView) {
            super(itemView);
            binding =StatusActiveLayoutBinding.bind(itemView);
        }
    }
}
