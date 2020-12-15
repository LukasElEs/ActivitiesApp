package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.myapplication.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        RelativeLayout viewPager = findViewById(R.id.view_pager);
        TabLayout tabs = findViewById(R.id.browse_tab);
        Button onePerson = findViewById(R.id.onePlayer);
        Button twoToFour = findViewById(R.id.twoToFour);
        Button fiveOrMore = findViewById(R.id.fiveOrMore);


        onePerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_result_page);
            }
        });

        twoToFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_result_page);
            }
        });

        fiveOrMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_result_page);
            }
        });

    }

    public void findActivities(View v) {
       // get id
        setContentView(R.layout.activity_result_page);
    }
}