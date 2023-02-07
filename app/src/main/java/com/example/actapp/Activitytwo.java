package com.example.actapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Activitytwo extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        lawfragment lawfragment = new lawfragment();
        childFragment childFragment = new childFragment();
        womenfragment womenfragment = new womenfragment();

        bottomNavigationView = findViewById(R.id.btm_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,lawfragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.laws:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,lawfragment).commit();
                        return true;

                    case R.id.child:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,childFragment).commit();
                        return true;

                    case R.id.women:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,womenfragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}