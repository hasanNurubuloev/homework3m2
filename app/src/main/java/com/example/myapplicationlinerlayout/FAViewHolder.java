package com.example.myapplicationlinerlayout;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FAViewHolder extends RecyclerView.ViewHolder {
    TextView textView;


    public FAViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.vh_text_view);

    }


}
