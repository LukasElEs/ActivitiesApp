package com.example.myapplication;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import activitiesSummary.Activity;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void createActivity(View v) {
        Activity newActivity = new Activity();
        TextInputEditText name = findViewById(R.id.activity_name);
        TextInputEditText description = findViewById(R.id.activity_description);

        newActivity.setName(name.getText().toString());
        newActivity.setDescription(description.getText().toString());
        // TODO setTags and create logic behind tags

    }
}
