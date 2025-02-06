
package com.example.wallwhiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Layout1 extends AppCompatActivity {

    private Button btnBack, btnSelect, btnNext;
    private ImageView uploadedImageLay1,uploadedImageLay2; // ImageView to display the uploaded image
    private Uri imageUri; // Store the received image URI

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1); // Ensure your XML file name matches

        btnBack = findViewById(R.id.btnback);
        btnSelect = findViewById(R.id.btnselect);
        btnNext = findViewById(R.id.btnnext);
        uploadedImageLay1 = findViewById(R.id.lay1);
        uploadedImageLay2 = findViewById(R.id.lay2);

        // Retrieve Image URI from Intent
        ArrayList<Uri> imageUriss = getIntent().getParcelableArrayListExtra("imageUris");

        if (imageUriss != null && !imageUriss.isEmpty()) {
            // Ensure you have enough ImageViews to display the images
            if (imageUriss.size() > 0) {
                uploadedImageLay1.setImageURI(imageUriss.get(0));
            }
            if (imageUriss.size() > 1) {
                uploadedImageLay2.setImageURI(imageUriss.get(1));
            }
        }


        // Navigate to FramesSelection on Select button click
        btnSelect.setOnClickListener(v -> {
            Intent intent = new Intent(Layout1.this, FramesSelection.class);
            if (imageUri != null) {
                intent.putExtra("imageUri", imageUri.toString()); // Pass URI forward
            }
            startActivity(intent);
        });

        // Navigate to Layout2 on Next button click
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Layout1.this, Layout2.class);
            if (imageUri != null) {
                intent.putExtra("imageUri", imageUri.toString()); // Pass URI forward
            }
            startActivity(intent);
        });

        // Navigate back to SizeCheck on Back button click
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(Layout1.this, Size_check.class);
            if (imageUri != null) {
                intent.putExtra("imageUri", imageUri.toString()); // Pass URI back
            }
            startActivity(intent);
        });
    }
}
