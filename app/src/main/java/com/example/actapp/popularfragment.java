package com.example.actapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class popularfragment extends Fragment {

    Button Rcase8,Rcase9,Rcase10,Rcase11,Rcase12,Rcase13,Rcase14;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_popularfragment, container, false);

        Rcase8 = view.findViewById(R.id.Rcase8);
        Rcase9 = view.findViewById(R.id.Rcase9);
        Rcase10 = view.findViewById(R.id.Rcase10);
        Rcase11 = view.findViewById(R.id.Rcase11);
        Rcase12 = view.findViewById(R.id.Rcase12);
        Rcase13 = view.findViewById(R.id.Rcase13);
        Rcase14 = view.findViewById(R.id.Rcase14);


        Rcase8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","A_K_Gopalan_vs_The_State_Of_Madras_Union_Of_on_19_May_1950.PDF");
                startActivity(intent);

            }
        });


        Rcase9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","Indian_Young_Lawyers_Association_vs_The_State_Of_Kerala_on_28_September_2018.PDF");
                startActivity(intent);

            }
        });

        Rcase10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","Indra_Sawhney_Etc_Etc_vs_Union_Of_India_And_Others_Etc_on_16_November_1992.PDF");
                startActivity(intent);

            }
        });

        Rcase11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","Minerva_Mills_Ltd_Ors_vs_Union_Of_India_Ors_on_31_July_1980.PDF");
                startActivity(intent);

            }
        });

        Rcase12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","Romesh_Thappar_vs_The_State_Of_Madras_on_26_May_1950.PDF");
                startActivity(intent);

            }
        });

        Rcase13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","Sri_Sankari_Prasad_Singh_Deo_vs_Union_Of_India_And_State_Of_on_5_October_1951.PDF");
                startActivity(intent);

            }
        });

        Rcase14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(),Casestudyactivity.class);
                intent.putExtra("CASESTUDYBOOK","The_State_Of_Madras_vs_Srimathi_Champakam_on_9_April_1951.PDF");
                startActivity(intent);

            }
        });




        return view;
    }
}