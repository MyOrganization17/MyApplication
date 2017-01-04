package com.example.priyanka.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

import Model.PerData;

import static android.R.attr.data;


public class MainActivity extends AppCompatActivity {
    private static DataAdapter adapter;
    private ArrayList<PerData> datalist = new ArrayList<>();
    private RecyclerView recycler_view;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    private ImageView list_image,grid_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);


        list_image = (ImageView) findViewById(R.id.list_image);
        grid_image =(ImageView) findViewById(R.id.grid_image);



        recycler_view = (RecyclerView) findViewById(R.id.list);
        adapter = new DataAdapter(datalist);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recycler_view.setLayoutManager(mStaggeredLayoutManager);
       /* RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_view.setLayoutManager(mLayoutManager);*/
        recycler_view.setItemAnimator(new DefaultItemAnimator());
        recycler_view.setAdapter(adapter);

        getData();


        list_image.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

               if(list_image.getVisibility()== View.VISIBLE) {
                   grid_image.setVisibility(View.VISIBLE);
                   list_image.setVisibility(View.GONE);
                    mStaggeredLayoutManager.setSpanCount(2);


                }else{
                   list_image.setVisibility(View.VISIBLE);
                   grid_image.setVisibility(View.GONE);
                }
            }
        });

        grid_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(grid_image.getVisibility()== View.VISIBLE) {
                    list_image.setVisibility(View.VISIBLE);
                    grid_image.setVisibility(View.GONE);
                    mStaggeredLayoutManager.setSpanCount(1);


                }else{
                    grid_image.setVisibility(View.VISIBLE);
                    list_image.setVisibility(View.GONE);
                }

            }
        });
    }

    private void getData() {
        PerData perData = new PerData("1001","Aaaa");
        datalist.add(perData);

        perData = new PerData("1002","Bbbb");
        datalist.add(perData);

        perData = new PerData("1003","Cccc");
        datalist.add(perData);

        perData = new PerData("1004","Dddd");
        datalist.add(perData);

        perData = new PerData("1005","Eeee");
        datalist.add(perData);

        perData = new PerData("1006","Ffff");
        datalist.add(perData);

        perData = new PerData("1007","Gggg");
        datalist.add(perData);

        perData = new PerData("1008","Hhhh");
        datalist.add(perData);

    }

}