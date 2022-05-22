package com.example.assignment1;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageView;
import java.util.Random;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;


    char[] options = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    Button b1 = findViewById(R.id.button);
    Button b2 = findViewById(R.id.button2);
    Button b3 = findViewById(R.id.button3);

    int ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        startTest();

    }

    private void startTest()
    {
        int[] images = {
            R.drawable.apple,R.drawable.bee,R.drawable.cat,R.drawable.dog,R.drawable.egg,R.drawable.flower,R.drawable.goose,R.drawable.hat,R.drawable.icecream,
            R.drawable.jewel,R.drawable.kite,R.drawable.lion,R.drawable.mouse,R.drawable.nut,R.drawable.orange,R.drawable.pea,R.drawable.queen,R.drawable.rabbit,
            R.drawable.snake,R.drawable.tree,R.drawable.umbrella,R.drawable.violin,R.drawable.whale,R.drawable.xylophone,R.drawable.yacht,R.drawable.zebra
         };

        int b=0, c=0; int a=3;
//        int a = generateNumber(0,25);
//        while(b==a)
//        {
//            b = generateNumber(0,25);
//        }
//        while(c==a || c==b)
//        {
//            c = generateNumber(0,25);
//        }

        imageView.setImageResource(images[a]);
        b1.setText(options[a]);
        b2.setText(options[b]);
        b3.setText(options[c]);
        ans = b1.getId();
    }


    private int generateNumber(int min,int max)
    {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == ans)
        {
            startTest();
        }
    }


}
