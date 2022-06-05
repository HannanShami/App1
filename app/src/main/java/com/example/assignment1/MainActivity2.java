package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView l1 = findViewById(R.id.list1);
        ArrayList<Alphabets> aa = new ArrayList<Alphabets>();

        aa.add(new Alphabets("A",R.drawable.apple));
        aa.add(new Alphabets("B",R.drawable.bee));
        aa.add(new Alphabets("C",R.drawable.cat));
        aa.add(new Alphabets("D",R.drawable.dog));
        aa.add(new Alphabets("E",R.drawable.egg));
        aa.add(new Alphabets("F",R.drawable.flower));
        aa.add(new Alphabets("G",R.drawable.goose));
        aa.add(new Alphabets("H",R.drawable.hat));
        aa.add(new Alphabets("I",R.drawable.icecream));
        aa.add(new Alphabets("J",R.drawable.jewel));
        aa.add(new Alphabets("K",R.drawable.kite));
        aa.add(new Alphabets("L",R.drawable.lion));
        aa.add(new Alphabets("M",R.drawable.mouse));
        aa.add(new Alphabets("N",R.drawable.nut));
        aa.add(new Alphabets("O",R.drawable.orange));
        aa.add(new Alphabets("P",R.drawable.pea));
        aa.add(new Alphabets("Q",R.drawable.queen));
        aa.add(new Alphabets("R",R.drawable.rabbit));
        aa.add(new Alphabets("S",R.drawable.snake));
        aa.add(new Alphabets("T",R.drawable.tree));
        aa.add(new Alphabets("U",R.drawable.umbrella));
        aa.add(new Alphabets("V",R.drawable.violin));
        aa.add(new Alphabets("W",R.drawable.whale));
        aa.add(new Alphabets("X",R.drawable.xylophone));
        aa.add(new Alphabets("Y",R.drawable.yacht));
        aa.add(new Alphabets("Z",R.drawable.zebra));
        
        MyAdapter ad = new MyAdapter(this,0,aa);

        l1.setAdapter(ad);

    }


}