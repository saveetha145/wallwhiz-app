package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class adminprofile extends AppCompatActivity  {

    private Button button, btnBack, btnNext, btnSelect;
    private TextView adminProfile, textView18;
    private ImageView logo, imageView3;
    private Button adminName, password, viewOrder, reviews, update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminprofile);

        // Initialize views
        button = findViewById(R.id.button);
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        btnSelect = findViewById(R.id.btnselect);
        adminProfile = findViewById(R.id.admin_profile);
        textView18 = findViewById(R.id.textView18);
        logo = findViewById(R.id.logo);
        imageView3 = findViewById(R.id.imageView3);
        adminName = findViewById(R.id.name);
        password = findViewById(R.id.pw);
        viewOrder = findViewById(R.id.view);
        reviews = findViewById(R.id.reco);
        update = findViewById(R.id.up);

        // Set click listeners for buttons
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle edit profile button click
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next activity
                Intent intent = new Intent(adminprofile.this, editprofile.class);
                startActivity(intent);
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(button.this, changeProfileButton.class);
                startActivity(intent);
            }
        });

        adminName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle admin name button click
            }
        });

        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle password button click
            }
        });

        viewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle view order button click
            }
        });

        reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle reviews button click
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle update button click
            }
        });
    }
}