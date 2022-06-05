package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView l1 = findViewById(R.id.list1);
        ArrayList<Alphabets> aa = new ArrayList<>();

        Alphabets a = new Alphabets("A",R.drawable.apple,R.drawable.imagea);
        Alphabets b = new Alphabets("B",R.drawable.bee,R.drawable.imageb);
        Alphabets c = new Alphabets("C",R.drawable.cat,R.drawable.imagec);
        Alphabets d = new Alphabets("D",R.drawable.dog,R.drawable.imaged);
        Alphabets e = new Alphabets("E",R.drawable.egg,R.drawable.imagee);
        Alphabets f = new Alphabets("F",R.drawable.flower,R.drawable.imagef);
        Alphabets g = new Alphabets("G",R.drawable.goose,R.drawable.imageg);
        Alphabets h = new Alphabets("H",R.drawable.hat,R.drawable.imageh);
        Alphabets i = new Alphabets("I",R.drawable.icecream,R.drawable.imagei);
        Alphabets j = new Alphabets("J",R.drawable.jewel,R.drawable.imagej);
        Alphabets k = new Alphabets("K",R.drawable.kite,R.drawable.imagek);
        Alphabets l = new Alphabets("L",R.drawable.lion,R.drawable.imagel);
        Alphabets m = new Alphabets("M",R.drawable.mouse,R.drawable.imagem);
        Alphabets n = new Alphabets("N",R.drawable.nut,R.drawable.imagen);
        Alphabets o = new Alphabets("O",R.drawable.orange,R.drawable.imageo);
        Alphabets p = new Alphabets("P",R.drawable.pea,R.drawable.imagep);
        Alphabets q = new Alphabets("Q",R.drawable.queen,R.drawable.imageq);
        Alphabets r = new Alphabets("R",R.drawable.rabbit,R.drawable.imager);
        Alphabets s = new Alphabets("S",R.drawable.snake,R.drawable.images);
        Alphabets t = new Alphabets("T",R.drawable.tree,R.drawable.imaget);
        Alphabets u = new Alphabets("U",R.drawable.umbrella,R.drawable.imageu);
        Alphabets v = new Alphabets("V",R.drawable.violin,R.drawable.imagev);
        Alphabets w = new Alphabets("W",R.drawable.whale,R.drawable.imagew);
        Alphabets x = new Alphabets("X",R.drawable.xylophone,R.drawable.imagex);
        Alphabets y = new Alphabets("Y",R.drawable.yacht,R.drawable.imagey);
        Alphabets z = new Alphabets("Z",R.drawable.zebra,R.drawable.imagez);

        aa.add(a);
        aa.add(b);
        aa.add(c);
        aa.add(d);
        aa.add(e);
        aa.add(f);
        aa.add(g);
        aa.add(h);
        aa.add(i);
        aa.add(j);
        aa.add(k);
        aa.add(l);
        aa.add(m);
        aa.add(n);
        aa.add(o);
        aa.add(o);
        aa.add(q);
        aa.add(r);
        aa.add(s);
        aa.add(t);
        aa.add(u);
        aa.add(v);
        aa.add(w);
        aa.add(x);
        aa.add(y);
        aa.add(z);

        MyAdapter ad = new MyAdapter(this,0,aa);

        l1.setAdapter(ad);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long lo) {
                Intent intent = new Intent(MainActivity2.this,ImageShow.class);
                switch(position)
                {
                    case 0:
                        intent.putExtra("Image",a.getIm());
                        startActivity(intent);
                        break;

                    case 1:
                        intent.putExtra("Image",b.getIm());
                        startActivity(intent);
                        break;

                    case 2:
                        intent.putExtra("Image",c.getIm());
                        startActivity(intent);
                        break;

                    case 3:
                        intent.putExtra("Image",d.getIm());
                        startActivity(intent);
                        break;

                    case 4:
                        intent.putExtra("Image",e.getIm());
                        startActivity(intent);
                        break;

                    case 5:
                        intent.putExtra("Image",f.getIm());
                        startActivity(intent);
                        break;

                    case 6:
                        intent.putExtra("Image",g.getIm());
                        startActivity(intent);
                        break;

                    case 7:
                        intent.putExtra("Image",h.getIm());
                        startActivity(intent);
                        break;

                    case 8:
                        intent.putExtra("Image",i.getIm());
                        startActivity(intent);
                        break;

                    case 9:
                        intent.putExtra("Image",j.getIm());
                        startActivity(intent);
                        break;

                    case 10:
                        intent.putExtra("Image",k.getIm());
                        startActivity(intent);
                        break;

                    case 11:
                        intent.putExtra("Image",l.getIm());
                        startActivity(intent);
                        break;

                    case 12:
                        intent.putExtra("Image",m.getIm());
                        startActivity(intent);
                        break;

                    case 13:
                        intent.putExtra("Image",n.getIm());
                        startActivity(intent);
                        break;

                    case 14:
                        intent.putExtra("Image",o.getIm());
                        startActivity(intent);
                        break;

                    case 15:
                        intent.putExtra("Image",p.getIm());
                        startActivity(intent);
                        break;

                    case 16:
                        intent.putExtra("Image",q.getIm());
                        startActivity(intent);
                        break;

                    case 17:
                        intent.putExtra("Image",r.getIm());
                        startActivity(intent);
                        break;

                    case 18:
                        intent.putExtra("Image",s.getIm());
                        startActivity(intent);
                        break;

                    case 19:
                        intent.putExtra("Image",t.getIm());
                        startActivity(intent);
                        break;

                    case 20:
                        intent.putExtra("Image",u.getIm());
                        startActivity(intent);
                        break;

                    case 21:
                        intent.putExtra("Image",v.getIm());
                        startActivity(intent);
                        break;

                    case 22:
                        intent.putExtra("Image",w.getIm());
                        startActivity(intent);
                        break;

                    case 23:
                        intent.putExtra("Image",x.getIm());
                        startActivity(intent);
                        break;

                    case 24:
                        intent.putExtra("Image",y.getIm());
                        startActivity(intent);
                        break;

                    case 25:
                        intent.putExtra("Image",z.getIm());
                        startActivity(intent);
                        break;

                }
            }
        });

    }


}