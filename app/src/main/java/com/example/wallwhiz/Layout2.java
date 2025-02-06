package com.example.wallwhiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Layout2 extends AppCompatActivity {

    private Button btnBack, btnSelect, btnNext;
    private ImageView uploadedImageLay3, uploadedImageLay4; // ImageView to display the uploaded image
    private Uri imageUri; // Store the received image URI

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2); // Ensure your XML file name matches

        btnBack = findViewById(R.id.btnback);
        btnSelect = findViewById(R.id.btnselect);
        btnNext = findViewById(R.id.btnnext);
        uploadedImageLay3 = findViewById(R.id.lay3); // Updated ID to lay3
        uploadedImageLay4 = findViewById(R.id.lay4); // Updated ID to lay4

        // Retrieve Image URI from Intent
        String imageUriString = getIntent().getStringExtra("imageUri");
        if (imageUriString != null) {
            imageUri = Uri.parse(imageUriString);
            uploadedImageLay3.setImageURI(imageUri);
            uploadedImageLay4.setImageURI(imageUri); // Set the image in ImageView
        }

        // Navigate to FramesSelection on Select button click
        btnSelect.setOnClickListener(v -> {
            Intent intent = new Intent(Layout2.this, FramesSelection.class);
            if (imageUri != null) {
                intent.putExtra("imageUri", imageUri.toString()); // Pass URI forward
            }
            startActivity(intent);
        });

        // Navigate to Layout3 on Next button click
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Layout2.this, Layout3.class);
            if (imageUri != null) {
                intent.putExtra("imageUri", imageUri.toString()); // Pass URI forward
            }
            startActivity(intent);
        });

        // Navigate back to SizeCheck on Back button click
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(Layout2.this, Size_check.class);
            if (imageUri != null) {
                intent.putExtra("imageUri", imageUri.toString()); // Pass URI back
            }
            startActivity(intent);
        });
    }
}
