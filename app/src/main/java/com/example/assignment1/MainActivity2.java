package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnA = findViewById(R.id.A);
        Button btnB = findViewById(R.id.B);
        Button btnC = findViewById(R.id.C);
        Button btnD = findViewById(R.id.D);
        Button btnE = findViewById(R.id.E);
        Button btnF = findViewById(R.id.F);
        Button btnG = findViewById(R.id.G);
        Button btnH = findViewById(R.id.H);
        Button btnI = findViewById(R.id.I);
        Button btnJ = findViewById(R.id.J);
        Button btnK = findViewById(R.id.K);
        Button btnL = findViewById(R.id.L);
        Button btnM = findViewById(R.id.M);
        Button btnN = findViewById(R.id.N);
        Button btnO = findViewById(R.id.O);
        Button btnP = findViewById(R.id.P);
        Button btnQ = findViewById(R.id.Q);
        Button btnR = findViewById(R.id.R);
        Button btnS = findViewById(R.id.S);
        Button btnT = findViewById(R.id.T);
        Button btnU = findViewById(R.id.U);
        Button btnV = findViewById(R.id.V);
        Button btnW = findViewById(R.id.W);
        Button btnX = findViewById(R.id.X);
        Button btnY = findViewById(R.id.Y);
        Button btnZ = findViewById(R.id.Z);

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnE.setOnClickListener(this);
        btnF.setOnClickListener(this);
        btnG.setOnClickListener(this);
        btnH.setOnClickListener(this);
        btnI.setOnClickListener(this);
        btnJ.setOnClickListener(this);
        btnK.setOnClickListener(this);
        btnL.setOnClickListener(this);
        btnM.setOnClickListener(this);
        btnN.setOnClickListener(this);
        btnO.setOnClickListener(this);
        btnP.setOnClickListener(this);
        btnQ.setOnClickListener(this);
        btnR.setOnClickListener(this);
        btnS.setOnClickListener(this);
        btnT.setOnClickListener(this);
        btnU.setOnClickListener(this);
        btnV.setOnClickListener(this);
        btnW.setOnClickListener(this);
        btnX.setOnClickListener(this);
        btnY.setOnClickListener(this);
        btnZ.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int im;
        Intent intent = new Intent(MainActivity2.this,ImageShow.class);
            switch(view.getId())
            {
                case R.id.A:
                    im = R.drawable.imagea;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.B:
                    im = R.drawable.imageb;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.C:
                    im = R.drawable.imagec;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.D:
                    im = R.drawable.imaged;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.E:
                    im = R.drawable.imagee;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.F:
                    im = R.drawable.imagef;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.G:
                    im = R.drawable.imageg;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.H:
                    im = R.drawable.imageh;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.I:
                    im = R.drawable.imagei;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.J:
                    im = R.drawable.imagej;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.K:
                    im = R.drawable.imagek;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.L:
                    im = R.drawable.imagel;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.M:
                    im = R.drawable.imagem;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.N:
                    im = R.drawable.imagen;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.O:
                    im = R.drawable.imageo;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.P:
                    im = R.drawable.imagep;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.Q:
                    im = R.drawable.imageq;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.R:
                    im = R.drawable.imager;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.S:
                    im = R.drawable.images;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.T:
                    im = R.drawable.imaget;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.U:
                    im = R.drawable.imageu;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.V:
                    im = R.drawable.imagev;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.W:
                    im = R.drawable.imagew;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.X:
                    im = R.drawable.imagex;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.Y:
                    im = R.drawable.imagey;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                case R.id.Z:
                    im = R.drawable.imagez;
                    intent.putExtra("Image",im);
                    startActivity(intent);
                    break;

                default:
                    break;
            }
    }


}