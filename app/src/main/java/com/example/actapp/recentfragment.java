package com.example.actapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class recentfragment extends Fragment {

    Button Rcase1,Rcase2,Rcase3,Rcase4,Rcase5,Rcase6,Rcase7;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_recentfragment, container, false);


        Rcase1 = v.findViewById(R.id.Rcase1);
        Rcase2 = v.findViewById(R.id.Rcase2);
        Rcase3 = v.findViewById(R.id.Rcase3);
        Rcase4 = v.findViewById(R.id.Rcase4);
        Rcase5 = v.findViewById(R.id.Rcase5);
        Rcase6 = v.findViewById(R.id.Rcase6);
        Rcase7 = v.findViewById(R.id.Rcase7);


        Rcase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","A_G_Perarivalan_vs_The_State_Of_Tamil_Nadu_State_on_18_May_2022.PDF");
                startActivity(intent);

            }
        });


        Rcase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","Vintage_Distillers_Limited_vs_Ramesh_Chand_Parekh_on_16_November_2022.PDF");
                startActivity(intent);

            }
        });

        Rcase3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","Karnataka_Power_Transmission_vs_Jsw_Energy_Limited_on_22_November_2022.PDF");
                startActivity(intent);

            }
        });

        Rcase4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","Rajiv_Chakraborty_Resolution_vs_Directorate_Of_Enforcement_on_11_November_2022.PDF");
                startActivity(intent);

            }
        });

        Rcase5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","Future_Bath_Products_Private_vs_Corza_International_Ors_on_4_November_2022.PDF");
                startActivity(intent);

            }
        });

        Rcase6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","The_State_Of_Karnataka_vs_Mr_Prasanna_Kumar_R_on_29_October_2022.PDF");
                startActivity(intent);

            }
        });

        Rcase7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","M_S_Google_India_Private_Limited_vs_Dy_D_I_T_Bangalore_on_19_October_2022.PDF");
                startActivity(intent);

            }
        });

        return v;
    }
}