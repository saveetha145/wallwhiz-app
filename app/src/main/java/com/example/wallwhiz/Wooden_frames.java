package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Wooden_frames extends AppCompatActivity {

    private ImageView wooden1, wooden2;
    private Button btnBack; // Back button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woodenframes); // Ensure this matches your XML filename

        wooden1 = findViewById(R.id.wooden1);
        wooden2 = findViewById(R.id.wooden2);
        btnBack = findViewById(R.id.btnback); // Find the back button

        // Click listener for wooden1
        wooden1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("wooden1");
            }
        });

        // Click listener for wooden2
        wooden2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToARScreen("wooden2");
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

    private void navigateToARScreen(String selectedWooden) {
        Intent intent = new Intent(Wooden_frames.this, Ar.class);
        intent.putExtra("selectedwooden", selectedWooden); // Pass the wooden frame selection
        startActivity(intent);
    }
}
