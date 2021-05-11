package com.example.praktikum_tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.example.praktikum_tugas3.R;
import com.example.praktikum_tugas3.CallFragment;
import com.example.praktikum_tugas3.GenshinFragment;



import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(this);
        loadFragment(new GenshinFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fr_main_container,fragment)
                    .commit();
            return true;
        }
        return false;
    }

@Override
public boolean onNavigationItemSelected(MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
        case R.id.action_home:
        fragment = new GenshinFragment();
        break;
        case R.id.action_call:
        fragment = new CallFragment();
        break;

        }
        return loadFragment(fragment);
        }
}