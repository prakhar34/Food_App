package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData=new FoodData("Dosa","A South-INDIAN Food loved by all Indians and beyond that","Rs.80",R.drawable.image5);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Cake","Soft Baked with a touch of sweetest love","Rs.110",R.drawable.image4);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Ice-Cream","Cool strawberry ,vanilla and chocolate flavoured","Rs.45",R.drawable.imag3);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Pizza","A mexican dish tastes with exotic pepper from world's best places","Rs.235",R.drawable.image2);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Pasta","Delicious mouth watering cheesy ","Rs.75",R.drawable.image1);
        myFoodList.add(mFoodData);


        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);
    }

}

