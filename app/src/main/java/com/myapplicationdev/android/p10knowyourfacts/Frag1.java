package com.myapplicationdev.android.p10knowyourfacts;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Random;


public class Frag1 extends Fragment {

    public Frag1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rowview = inflater.inflate(R.layout.fragment_1, container, false);

        Button changeColor = (Button) rowview.findViewById(R.id.btnChangeColor);
        ImageView iv = (ImageView)rowview.findViewById(R.id.iv);
        String url = "https://78.media.tumblr.com/9d401bb26bb82278dbcc3f4dda840360/tumblr_pccg9cDVVp1roqv59o1_500.png";
        Picasso.with(getActivity()).load(url).into(iv);

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
