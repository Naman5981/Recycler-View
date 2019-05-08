package com.naman.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {
    public String[] myDataset = {"Apple","Blackberrry","Cisco","Deloitte","Epson","Honda","Internet","Java","Kingston"};

    public myAdapter(String[] myDataSet) {
        this.myDataset = myDataset;

    }

    @NonNull
    @Override
    public myAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder Holder, int position) {
        Holder.textView.setText(myDataset[position]);
    }

    @Override
    public int getItemCount() {
        return myDataset.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public MyViewHolder(View v) {
            super(v);
            this.textView = (TextView) itemView.findViewById(R.id.my_text_view);
        }
    }
}