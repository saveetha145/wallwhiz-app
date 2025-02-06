package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Metal_frames extends AppCompatActivity {

    private ImageView metal1, metal2;
    private Button btnBack; // Back button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metalframes); // Ensure this matches your XML filename

        metal1 = findViewById(R.id.metal1);
        metal2 = findViewById(R.id.metal2);
        btnBack = findViewById(R.id.btnback); // Find the back button

        // Click listener for metal1
        metal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("metal1");
            }
        });

        // Click listener for metal2
        metal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("metal2");
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

    private void navigateToARScreen(String selectedMetal) {
        Intent intent = new Intent(Metal_frames.this, Ar.class);
        intent.putExtra("selectedmetal", selectedMetal); // Pass the metal frame selection
        startActivity(intent);
    }
}
