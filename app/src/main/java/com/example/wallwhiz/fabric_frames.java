package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class fabric_frames extends AppCompatActivity {

    private ImageView fabric1, fabric2;
    private Button btnBack; // Back button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabricframes); // Ensure this matches your XML filename

        fabric1 = findViewById(R.id.fabric1);
        fabric2 = findViewById(R.id.fabric2);
        btnBack = findViewById(R.id.btnback); // Find the back button

        // Click listener for fabric1
        fabric1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("fabric1");
            }
        });

        // Click listener for fabric2
        fabric2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("fabric2");
            }
        });

        // Click listener for back button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // This will close the activity and return to the previous screen
            }
        });
    }

    private void navigateToARScreen(String selectedFabric) {
        Intent intent = new Intent(fabric_frames.this, Ar.class);
        intent.putExtra("selectedfabric", selectedFabric); // Pass the fabric frame selection
        startActivity(intent);
    }
}
