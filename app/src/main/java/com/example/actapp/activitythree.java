package com.example.actapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class activitythree extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitythree);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        recentfragment recentfragment = new recentfragment();
        popularfragment popularfragment = new popularfragment();

        bottomNavigationView = findViewById(R.id.btm_navigation2);

        getSupportFragmentManager().beginTransaction().replace(R.id.container2,recentfragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.recent:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container2, recentfragment).commit();
                        return true;

                    case R.id.popular:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container2, popularfragment).commit();
                        return true;
                }
                return false;
            }
        });

    }
}