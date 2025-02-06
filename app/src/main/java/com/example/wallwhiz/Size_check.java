package com.example.wallwhiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Size_check extends AppCompatActivity {

    private String selectedSize = null; // To store the selected frame size
    private Uri imageUri; // Store the received image URI

    private ArrayList<Uri> imageUris = new ArrayList<>();
    private ImageView uploadedImage1, uploadedImage2, uploadedImage3; // ImageViews for displaying the uploaded image

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        // Retrieve Image URI from Intent
//        String imageUriString = getIntent().getStringExtra("imageUri");
        ArrayList<Uri> imageUriss = getIntent().getParcelableArrayListExtra("imageUris");
        if (imageUriss != null) {
            imageUris = imageUriss;
        }

        // Initialize frame image views
        ImageView frame1 = findViewById(R.id.frame1);
        ImageView frame2 = findViewById(R.id.frame2);
        ImageView frame3 = findViewById(R.id.frame3);
        ImageView frame4 = findViewById(R.id.frame4);
        ImageView frame5 = findViewById(R.id.frame5);
        ImageView frame6 = findViewById(R.id.frame6);
        ImageView frame7 = findViewById(R.id.frame7);
        ImageView frame8 = findViewById(R.id.frame8);
        ImageView frame9 = findViewById(R.id.frame9);

        // Initialize the uploaded image views (Ensure these IDs exist in your layout file)
//        uploadedImage1 = findViewById(R.id.lay1);
//        uploadedImage2 = findViewById(R.id.lay2);
//        uploadedImage3 = findViewById(R.id.lay3);

        // Set the selected image in ImageView (if imageUri is available)
//        if (imageUri != null) {
//            uploadedImage1.setImageURI(imageUri); // Set the image in uploadedImage1
//        }

        // Set click listeners for frame selection
        View.OnClickListener frameClickListener = v -> {
            selectedSize = v.getResources().getResourceEntryName(v.getId()); // Get frame ID as string
            Toast.makeText(Size_check.this, "Selected: " + selectedSize, Toast.LENGTH_SHORT).show();
        };

        // Set click listeners for each frame
        frame1.setOnClickListener(frameClickListener);
        frame2.setOnClickListener(frameClickListener);
        frame3.setOnClickListener(frameClickListener);
        frame4.setOnClickListener(frameClickListener);
        frame5.setOnClickListener(frameClickListener);
        frame6.setOnClickListener(frameClickListener);
        frame7.setOnClickListener(frameClickListener);
        frame8.setOnClickListener(frameClickListener);
        frame9.setOnClickListener(frameClickListener);

        // Back button
        findViewById(R.id.btnback).setOnClickListener(v -> {
            Intent intent = new Intent(Size_check.this, Upload_image.class);
            startActivity(intent);
            finish();
        });

        // Next button
        findViewById(R.id.btnnext).setOnClickListener(v -> {
            if (selectedSize != null) {
                Intent intent = new Intent(Size_check.this, Layout1.class);
                intent.putExtra("SELECTED_SIZE", selectedSize); // Pass selected frame size
                if (imageUri != null) {
                    intent.putParcelableArrayListExtra("imageUris",imageUris ); // Pass image URI
                }
                startActivity(intent);
            } else {
                Toast.makeText(Size_check.this, "Please select a frame size", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
