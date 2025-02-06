package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Plastic_frames extends AppCompatActivity {

    private ImageView plastic1, plastic2;
    private Button btnBack; // Back button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plasticframes); // Ensure this matches your XML filename

        plastic1 = findViewById(R.id.plastic1);
        plastic2 = findViewById(R.id.plastic2);
        btnBack = findViewById(R.id.btnback); // Find the back button

        // Click listener for plastic1
        plastic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("plastic1");
            }
        });

        // Click listener for plastic2
        plastic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("plastic2");
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

    private void navigateToARScreen(String selectedPlastic) {
        Intent intent = new Intent(Plastic_frames.this, Ar.class);
        intent.putExtra("selectedplastic", selectedPlastic); // Pass the plastic frame selection
        startActivity(intent);
    }
}
