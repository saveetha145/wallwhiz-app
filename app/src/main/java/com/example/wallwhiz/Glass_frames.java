package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Glass_frames extends AppCompatActivity {

    private ImageView glass1, glass2;
    private Button btnBack; // Back button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glassframes); // Ensure this matches your XML filename

        glass1 = findViewById(R.id.glass1);
        glass2 = findViewById(R.id.glass2);
        btnBack = findViewById(R.id.btnback); // Find the back button

        // Click listener for glass1
        glass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("glass1");
            }
        });

        // Click listener for glass2
        glass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("glass2");
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

    private void navigateToARScreen(String selectedGlass) {
        Intent intent = new Intent(Glass_frames.this, Ar.class);
        intent.putExtra("selectedGlass", selectedGlass);
        startActivity(intent);
    }
}
