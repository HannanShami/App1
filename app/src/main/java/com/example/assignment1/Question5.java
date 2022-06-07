package com.example.assignment1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        ImageView imageView = findViewById(R.id.q5);
        Button btn1=findViewById(R.id.opty);
        Button btn2=findViewById(R.id.optb);
        Button btn3=findViewById(R.id.optt);
        Button btn4=findViewById(R.id.optm);

        imageView.setImageResource(R.drawable.yacht);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialogBuilder.setTitle("Congratulations!!");
                alertDialogBuilder.setMessage("Test Completed, Press OK to go back to home.");
                alertDialogBuilder.setCancelable(false);
                alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Question5.this,MainActivity.class);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialogBuilder.setMessage("Wrong!! Try Again.");
                alertDialog.show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialogBuilder.setMessage("Wrong!! Try Again.");
                alertDialog.show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialogBuilder.setMessage("Wrong!! Try Again.");
                alertDialog.show();
            }
        });


    }
}