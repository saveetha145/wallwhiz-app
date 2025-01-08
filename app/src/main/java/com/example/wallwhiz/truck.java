package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class truck extends AppCompatActivity {

    private Button btnBack, btnNext;
    private TextView detailsTitle;
    private ImageView logo, imageView, truckImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truck);

        // Initialize views
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.appCompatButton);
        detailsTitle = findViewById(R.id.payment);
        logo = findViewById(R.id.logo);
        imageView = findViewById(R.id.imageView);
        truckImage = findViewById(R.id.truck_image);

        // Set click listeners for buttons
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
                Intent intent = new Intent(truck.this, review.class);
                startActivity(intent);
            }
        });
    }
}