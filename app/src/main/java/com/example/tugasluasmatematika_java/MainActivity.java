package com.example.tugasluasmatematika_java;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugasluasmatematika_java.fragments.BangunDatarFragment;
import com.example.tugasluasmatematika_java.fragments.BangunRuangFragment;
import com.example.tugasluasmatematika_java.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomView);
        bottomNavigationView.setOnItemSelectedListener(navListener);

        // Load the default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragment, new BangunDatarFragment())
                .commit();
    }

    private BottomNavigationView.OnItemSelectedListener navListener =
            new BottomNavigationView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.menu_bangundatar) {
                        selectedFragment = new BangunDatarFragment();
                    } else if (item.getItemId() == R.id.menu_bangunruang) {
                        selectedFragment = new BangunRuangFragment();
                    } else if (item.getItemId() == R.id.menu_profile) {
                        selectedFragment = new ProfileFragment();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.flFragment, selectedFragment)
                            .commit();

                    return true;
                }
            };
}