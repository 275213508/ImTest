package com.example.imtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recadapter extends RecyclerView.Adapter<Recadapter.MyHolder> {

    private final Context context;
    private final List<String> data;

    public Recadapter(Context context, List<String> data) {
        this.context = context;
        this.data=data;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv, parent, false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.tv.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public  class  MyHolder extends RecyclerView.ViewHolder {

        private final TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tvvv);
        }
    }
}
