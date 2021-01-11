package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.sql.*;

import com.example.myapplication.ui.main.SectionsPagerAdapter;

import Database.PostgreSQLJDBC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        RelativeLayout viewPager = findViewById(R.id.view_pager);
        TabLayout tabs = findViewById(R.id.browse_tab);


    }

    public void findActivities(View v) {
        setContentView(R.layout.activity_result_page);
    }
    public void createActivity(View v) {
        setContentView(R.layout.activity_add);
    }
    //Class.forName("org.postgresql.Driver");


}