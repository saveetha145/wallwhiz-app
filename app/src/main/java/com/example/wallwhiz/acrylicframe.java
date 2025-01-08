package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class acrylicframe extends AppCompatActivity {

    private ImageView logo, imageA;
    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acrylicframe);

        logo = findViewById(R.id.logo);
        imageA = findViewById(R.id.a);
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        btnSelect = findViewById(R.id.btnselect);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextActivity();
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFrame();
            }
        });

        imageA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(acrylicframe.this, "Frame A selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void goToNextActivity() {
        Toast.makeText(this, "Navigating to the next screen...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(acrylicframe.this, glass.class);
        startActivity(intent);
    }

    private void selectFrame() {
        // Logic for selecting a frame
        Toast.makeText(this, "Frame selected", Toast.LENGTH_SHORT).show();
        // You can add logic to save or process the selection

    }
}
