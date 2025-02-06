package com.example.wallwhiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;
import java.util.ArrayList;

public class Upload_image extends AppCompatActivity {

    private static final int PICK_IMAGES_REQUEST = 1;
    private ArrayList<Uri> imageUris = new ArrayList<>();
    private LinearLayout imageContainer;
    private HorizontalScrollView imageScrollView;
    private Button uploadButton, btnNext;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        // Initialize UI components
        uploadButton = findViewById(R.id.uploadButton);
        btnNext = findViewById(R.id.btnnext);
        imageContainer = findViewById(R.id.imageContainer);
        imageScrollView = findViewById(R.id.imageScrollView);

        // Handle Upload Button Click (Open Gallery)
        uploadButton.setOnClickListener(v -> openGallery());

        // Handle Next Button Click (Navigate to SizeCheckActivity with Image URIs)
        btnNext.setOnClickListener(v -> {
            if (!imageUris.isEmpty()) {
                Intent intent = new Intent(Upload_image.this, Size_check.class);
                intent.putParcelableArrayListExtra("imageUris", imageUris); // Pass URI list
                startActivity(intent);
            } else {
                Toast.makeText(this, "Please upload at least one image!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Open Gallery to Select Multiple Images
    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        startActivityForResult(Intent.createChooser(intent, "Select Images"), PICK_IMAGES_REQUEST);
    }

    // Handle Selected Images from Gallery
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGES_REQUEST && resultCode == RESULT_OK) {
            if (data != null) {
                if (data.getClipData() != null) { // Multiple images selected
                    int count = data.getClipData().getItemCount();
                    for (int i = 0; i < count; i++) {
                        Uri imageUri = data.getClipData().getItemAt(i).getUri();
                        imageUris.add(imageUri);
                        displayImage(imageUri);
                    }
                } else if (data.getData() != null) { // Single image selected
                    Uri imageUri = data.getData();
                    imageUris.add(imageUri);
                    displayImage(imageUri);
                }
                imageScrollView.setVisibility(View.VISIBLE); // Show HorizontalScrollView
            }
        }
    }

    // Dynamically Add Images to HorizontalScrollView
    private void displayImage(Uri imageUri) {
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
            ImageView imageView = new ImageView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(250, 250);
            params.setMargins(10, 10, 10, 10);
            imageView.setLayoutParams(params);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageContainer.addView(imageView);
        } catch (IOException e) {
            Toast.makeText(this, "Failed to load image!", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
