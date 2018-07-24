package com.myapplicationdev.android.p10knowyourfacts;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


public class Frag2 extends Fragment {

    public Frag2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rowview = inflater.inflate(R.layout.fragment_2, container, false);
        Button changeColor = (Button) rowview.findViewById(R.id.btnChangeColor);
        changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                rowview.setBackgroundColor(color);
            }
        });
        return rowview;
    }


}
