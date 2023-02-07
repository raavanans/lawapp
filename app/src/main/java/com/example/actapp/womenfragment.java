package com.example.actapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class womenfragment extends Fragment {

    Button wlaw1,wlaw2,wlaw3,wlaw4,wlaw5,wlaw6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v  = inflater.inflate(R.layout.fragment_womenfragment, container, false);

        wlaw1 = v.findViewById(R.id.wlaw1);
        wlaw2 = v.findViewById(R.id.wlaw2);
        wlaw3 = v.findViewById(R.id.wlaw3);
        wlaw4 = v.findViewById(R.id.wlaw4);
        wlaw5 = v.findViewById(R.id.wlaw5);
        wlaw6 = v.findViewById(R.id.wlaw6);


        wlaw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });


        wlaw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        wlaw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });
        wlaw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        wlaw5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        wlaw6.setOnClickListener(new View.OnClickListener() {
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