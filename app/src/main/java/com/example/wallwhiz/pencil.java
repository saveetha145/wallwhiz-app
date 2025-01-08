//package com.example.wallwhiz ;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.AppCompatButton;
//
//public class pencil extends AppCompatActivity {
//
//    private ImageView logo, pencilArtImage;
//    private AppCompatButton btnBack, btnNext, btnSelect;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_pencil); // Layout file name: pencil.xml
//
//        // Initialize views
//        logo = findViewById(R.id.logo);
//        pencilArtImage = findViewById(R.id.a);
//        btnBack = findViewById(R.id.btnback);
//        btnNext = findViewById(R.id.btnnext);
//        btnSelect = findViewById(R.id.btnselect);
//
//        // Set click listeners for buttons
//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish(); // Navigate back to the previous activity
//            }
//        });
//
//        btnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                navigateToNextActivity(); // Navigate to the next activity
//            }
//        });
//
//        btnSelect.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(woodenframe.this, pencil.class);
//
//            }
//        });
//
//        // Optional: Click listener for the image
//        pencilArtImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(pencil.this, "Pencil Art selected", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    private void navigateToNextActivity() {
//        // Navigate to the next activity
//        Intent intent = new Intent(pencil.this, digital.class); // Replace 'NextActivity' with the actual class name
//        startActivity(intent);
//    }
//
//    private void selectPencilArt() {
//        // Logic for selecting the pencil art
//        Toast.makeText(this, "Pencil Art selected", Toast.LENGTH_SHORT).show();
//        // Add additional logic here to save or process the selection
//    }
//}


package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class pencil extends AppCompatActivity {

    private ImageView logo, pencilArtImage;
    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencil); // Layout file name: pencil.xml

        // Initialize views
        logo = findViewById(R.id.logo);
        pencilArtImage = findViewById(R.id.a);
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        btnSelect = findViewById(R.id.btnselect);

        // Set click listeners for buttons
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Navigate back to the previous activity
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToNextActivity(); // Navigate to the next activity
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToWoodenFrame(); // Navigate to WoodenFrame activity
            }
        });

        // Optional: Click listener for the image
        pencilArtImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pencil.this, "Pencil Art selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void navigateToNextActivity() {
        // Navigate to the next activity
        Intent intent = new Intent(pencil.this, digital.class); // Replace 'digital.class' with the actual next activity class name
        startActivity(intent);
    }

    private void navigateToWoodenFrame() {
        // Navigate to the WoodenFrame activity
        Intent intent = new Intent(pencil.this, woodenframe.class); // Replace 'woodenframe.class' with the actual class name for the WoodenFrame activity
        startActivity(intent);
    }
}
