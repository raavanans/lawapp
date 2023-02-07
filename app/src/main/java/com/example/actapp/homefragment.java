package com.example.actapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;


public class homefragment extends Fragment {

    Activity two;
    Activity three;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        two = getActivity();
        three = getActivity();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_homefragment, container, false);

        imageSlider = view.findViewById(R.id.imageslider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.ambedkar,null));
        imageList.add(new SlideModel(R.drawable.ambedkar2,null));
        imageList.add(new SlideModel(R.drawable.ambedkar3,null));
        imageList.add(new SlideModel(R.drawable.ambedkar4,null));

        imageSlider.setImageList(imageList);

        return view;


    }

    ImageSlider imageSlider;


    public void onStart() {
        {
            super.onStart();
            Button btn = (Button) two.findViewById(R.id.btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(two, Activitytwo.class);
                    startActivity(intent);
                }
            });
        }
        {
            super.onStart();
            Button btn2 = (Button) three.findViewById(R.id.btn2);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(three, activitythree.class);
                    startActivity(intent);
                }
            });
        }

    }









}