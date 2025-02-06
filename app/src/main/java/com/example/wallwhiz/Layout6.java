package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Layout6 extends AppCompatActivity {

    private Button btnBack, btnSelect, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout6); // Ensure your XML file name matches

        btnBack = findViewById(R.id.btnback);
        btnSelect = findViewById(R.id.btnselect);
        btnNext = findViewById(R.id.btnnext);

        // Navigate to AcrylicFrame on Select button click
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Layout6.this, FramesSelection.class);
                startActivity(intent);
            }
        });

        // Navigate to Layout2 on Next button click
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Layout6.this, Layout7.class);
                startActivity(intent);
            }
        });

        // Navigate back to SizeCheck on Back button click
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Layout6.this, Layout5.class);
                startActivity(intent);
            }
        });
    }
}

















