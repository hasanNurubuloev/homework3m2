package com.example.myapplicationlinerlayout;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FAAdapter extends RecyclerView.Adapter<FAViewHolder> {
    ArrayList<String> data;

    public FAAdapter() {
        data = new ArrayList<>();
    }
    public void addText(String s){
        data.add(s);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FAViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View v = inflater.inflate(R.layout.viewholder_fa, parent, false);

        return new FAViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull FAViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {

        return data.size();

    }
}
