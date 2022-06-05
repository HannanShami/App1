package com.example.assignment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Alphabets> {

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Alphabets> objects) {
        super(context, resource, objects);
    }

    public View getView(int position, View conversion, ViewGroup parent)
    {
        Alphabets s = getItem(position);
        View convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout1, parent, false);
        TextView t1 = convertView.findViewById(R.id.letterview);
        ImageView iv = convertView.findViewById(R.id.letterimage);

        t1.setText((s.getName()));
        iv.setImageResource(s.getImageID());

        return convertView;
    }




}
