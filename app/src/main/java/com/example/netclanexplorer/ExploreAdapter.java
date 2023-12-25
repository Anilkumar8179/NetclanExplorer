package com.example.netclanexplorer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.netclanexplorer.Fragments.ExploreFragment;

import java.util.List;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder> {

    private final List<ExploreModal> dataList;
    private ExploreFragment context;
    private ExploreModal exploreModal;

    public ExploreAdapter(List<ExploreModal> dataList, ExploreFragment context) {
        this.dataList = dataList;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.explore, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ExploreModal exploreModal = dataList.get(position);

        // Set data to views
        holder.imageView.setImageResource(exploreModal.getImageResource());
        holder.textView1.setText(exploreModal.getPersonName());
        holder.textView2.setText(exploreModal.getPersonAddress());
        holder.textView3.setText(exploreModal.getDistance());
        holder.textView4.setText(exploreModal.getFriendship());
        holder.textView5.setText(exploreModal.getCommunity());
    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1, textView2, textView3, textView4, textView5;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageResource);
            textView1 = itemView.findViewById(R.id.personName);
            textView2 = itemView.findViewById(R.id.personAddress);
            textView3 = itemView.findViewById(R.id.distance);
            textView4 = itemView.findViewById(R.id.friendship);
            textView5 = itemView.findViewById(R.id.Community);
        }
    }
}