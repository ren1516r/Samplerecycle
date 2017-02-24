package com.example.renjitha.sample;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by renjitha on 24-02-2017.
 */
public class Dadapter extends RecyclerView.Adapter<Dadapter.contentHolder> {
    private ArrayList<String> countries;

    public Dadapter(ArrayList<String> countries) {

        this.countries = countries;

    }

    @Override
    public Dadapter.contentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        Toast.makeText(parent.getContext(),"from card",Toast.LENGTH_LONG).show();
        return  new contentHolder(view);

    }

    @Override
    public void onBindViewHolder(Dadapter.contentHolder holder, int position) {
holder.t.setText(countries.get(position));

    }


    @Override
    public int getItemCount() {
        return 0;
    }


    public class contentHolder extends RecyclerView.ViewHolder {

TextView t;
        public contentHolder(View itemview) {
            super(itemview);

            t=(TextView) itemView.findViewById(R.id.tv_country);

        }
    }
}
