package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
TextView foodDEscription;
ImageView foodImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        foodDEscription=findViewById(R.id.txtDescription);
        foodImage=findViewById(R.id.ivImage2);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle!=null){
            foodDEscription.setText(mBundle.getString("Description"));
            foodImage.setImageResource(mBundle.getInt("Image"));

            Glide.with(this)
                    .load(mBundle.getString("Image")).into(foodImage);
        }
    }
}
