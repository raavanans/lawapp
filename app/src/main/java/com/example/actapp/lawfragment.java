package com.example.actapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class lawfragment extends Fragment {

    Button llaw1,llaw2,llaw3,llaw4,llaw5,llaw6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lawfragment, container, false);

        llaw1 = v.findViewById(R.id.llaw1);
        llaw2 = v.findViewById(R.id.llaw2);
        llaw3 = v.findViewById(R.id.llaw3);
        llaw4 = v.findViewById(R.id.llaw4);
        llaw5 = v.findViewById(R.id.llaw5);
        llaw6 = v.findViewById(R.id.llaw6);


        llaw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });


        llaw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        llaw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        llaw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        llaw5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        llaw6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });







        return v;
    }
}