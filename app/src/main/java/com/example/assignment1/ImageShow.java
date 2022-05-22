package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_show);
        Intent intent = getIntent();

        int image = intent.getIntExtra("Image",-1);

        ImageView imageView = findViewById(R.id.imageView1);
        imageView.setImageResource(image);
    }
}