package com.example.renjitha.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
    private ArrayList<String> countries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv=(RecyclerView)findViewById(R.id.recycle_view);
     RecyclerView.LayoutManager layout= new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layout);
rv.setHasFixedSize(true);
countries=new ArrayList<String>();
countries.add("America");
        countries.add("India");
        countries.add("Europe");

RecyclerView.Adapter ad=new Dadapter(countries);
        rv.setAdapter(ad);
    }


}
