package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
TextView foodDEscription;
ImageView foodImage;
TextView foodPrice;
TextView foodTitle;
Button btnOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        foodDEscription=findViewById(R.id.txtDescription);
        foodImage=findViewById(R.id.ivImage2);
        foodTitle=findViewById(R.id.txtTitle);
        foodPrice=findViewById(R.id.txtPrice);
        btnOrder=findViewById(R.id.btnOrder);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle!=null){
            foodDEscription.setText(mBundle.getString("Description"));
            foodTitle.setText(mBundle.getString("Title"));
            foodPrice.setText(mBundle.getString("Price"));
            foodImage.setImageResource(mBundle.getInt("Image"));

            Glide.with(this)
                    .load(mBundle.getString("Image")).into(foodImage);
        }
    }

    public void OrderNow(View view) {
        Intent intent =new Intent(this,OrderActivity.class);
        intent.putExtra("Title",foodTitle.getText());
        startActivity(intent);
    }
}
