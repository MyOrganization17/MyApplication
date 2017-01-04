package com.example.priyanka.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Model.PerData;

/**
 * Created by Priyanka on 1/3/2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {
     List<PerData> perDatas;
    private Context mcontext;


    public DataAdapter(List<PerData> perDatas){
        this.perDatas = perDatas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.perId.setText(perDatas.get(position).getPerId());
        holder.name.setText(perDatas.get(position).getName());
//        holder.image.setImageResource(R.mipmap.ic_launcher);

    }

    @Override
    public int getItemCount() {
        return (null != perDatas ? perDatas.size() : 0);
//        return perDatas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, perId;


        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            perId =(TextView) itemView.findViewById(R.id.perid);
        }
    }
}
