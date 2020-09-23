package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList= new ArrayList<>();
    FoodData mFoodData;
    private DatabaseReference databaseReference;
    ValueEventListener eventListener;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

//        progressDialog = new ProgressDialog(this);
//        progressDialog.setMessage("Loading....");
        myFoodList = new ArrayList<>();

//        mFoodData=new FoodData("Dosa","A South-INDIAN Food loved by all Indians and beyond that","Rs.80",R.drawable.image5);
//        myFoodList.add(mFoodData);
//        mFoodData=new FoodData("Cake","Soft Baked with a touch of sweetest love","Rs.110",R.drawable.image4);
//        myFoodList.add(mFoodData);
//        mFoodData=new FoodData("Ice-Cream","Cool strawberry ,vanilla and chocolate flavoured","Rs.45",R.drawable.imag3);
//        myFoodList.add(mFoodData);
//        mFoodData=new FoodData("Pizza","A mexican dish tastes with exotic pepper from world's best places","Rs.235",R.drawable.image2);
//        myFoodList.add(mFoodData);
//        mFoodData=new FoodData("Pasta","Delicious mouth watering cheesy ","Rs.75",R.drawable.image1);
//        myFoodList.add(mFoodData);


//        final MyAdapter myAdapter = new MyAdapter(MainActivity.this,myFoodList);
//        mRecyclerView.setAdapter(myAdapter);
//
//        databaseReference = FirebaseDatabase.getInstance().getReference("Recipe");
//        progressDialog.show();
//        eventListener= databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                myFoodList.clear();
//                for (DataSnapshot itemSnapshot:dataSnapshot.getChildren()){
//                    FoodData foodData= itemSnapshot.getValue(FoodData.class);
//                    myFoodList.add(foodData);
//                }
//                myAdapter.notifyDataSetChanged();
//                progressDialog.dismiss();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//                progressDialog.dismiss();
//            }
//        });
    }

    public void btn_uploadActivity(View view) {
        startActivity(new Intent(this,Upload_Recipe.class));
    }
}

