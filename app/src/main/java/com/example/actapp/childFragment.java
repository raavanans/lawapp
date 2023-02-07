package com.example.actapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class childFragment extends Fragment {

    Button claw1,claw2,claw3,claw4,claw5,claw6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_child, container, false);

        claw1 = v.findViewById(R.id.claw1);
        claw2 = v.findViewById(R.id.claw2);
        claw3 = v.findViewById(R.id.claw3);
        claw4 = v.findViewById(R.id.claw4);
        claw5 = v.findViewById(R.id.claw5);
        claw6 = v.findViewById(R.id.claw6);

        claw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });


        claw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        claw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });
        claw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        claw5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","");
                startActivity(intent);

            }
        });

        claw6.setOnClickListener(new View.OnClickListener() {
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