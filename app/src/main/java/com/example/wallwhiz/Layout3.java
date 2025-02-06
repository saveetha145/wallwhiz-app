package com.example.wallwhiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Layout3 extends AppCompatActivity {

    private Button btnBack, btnSelect, btnNext;
    private ImageView uploadedImageLay5, uploadedImageLay6, uploadedImage7; // ImageView to display the uploaded image
    private Uri imageUri; // Store the received image URI

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3); // Ensure your XML file name matches

        btnBack = findViewById(R.id.btnback);
        btnSelect = findViewById(R.id.btnselect);
        btnNext = findViewById(R.id.btnnext);
        uploadedImageLay5 = findViewById(R.id.lay5); // Updated ID to lay5
        uploadedImageLay6 = findViewById(R.id.lay6); // Updated ID to lay6

        // Retrieve Image URI from Intent
        String imageUriString = getIntent().getStringExtra("imageUri");
        if (imageUriString != null) {
            imageUri = Uri.parse(imageUriString);
            uploadedImageLay5.setImageURI(imageUri);
            uploadedImageLay6.setImageURI(imageUri); // Set the image in ImageView
        }

        // Navigate to FramesSelection on Select button click
        btnSelect.setOnClickListener(v -> {
            Intent intent = new Intent(Layout3.this, FramesSelection.class);
            if (imageUri != null) {
                intent.putExtra("imageUri", imageUri.toString()); // Pass URI forward
            }
            startActivity(intent);
        });

        // Navigate to Layout4 on Next button click
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Layout3.this, Layout4.class);
            if (imageUri != null) {
                intent.putExtra("imageUri", imageUri.toString()); // Pass URI forward
            }
            startActivity(intent);
        });

        // Navigate back to SizeCheck on Back button click
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(Layout3.this, Size_check.class);
            if (imageUri != null) {
                intent.putExtra("imageUri", imageUri.toString()); // Pass URI back
            }
            startActivity(intent);
        });
    }
}
