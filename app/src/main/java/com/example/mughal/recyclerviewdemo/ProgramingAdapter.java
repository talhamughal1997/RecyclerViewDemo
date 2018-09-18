package com.example.mughal.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramingAdapter extends RecyclerView.Adapter<ProgramingAdapter.ProgramingViewHolder>{

    String[] data = {"talha","noman","ishaq","talha","noman","ishaq","talha","noman","ishaq","talha","noman","ishaq","talha","noman","ishaq","talha","noman","ishaq","talha","noman","ishaq","talha","noman","ishaq"};



    @NonNull
    @Override
    public ProgramingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_item,viewGroup,false);
        return new ProgramingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramingViewHolder programingViewHolder, int i) {
        String title = data[i];
        programingViewHolder.textView.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class ProgramingViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;
        public ProgramingViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgIcon);
            textView = itemView.findViewById(R.id.txtView);
        }
    }

}
