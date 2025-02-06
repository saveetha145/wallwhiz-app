package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Orderlist extends AppCompatActivity {

    private Button btnBack, btnNext;
    private TextView adminProfile, textView7, textView8;
    private ImageView  imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderlist);

        // Initialize views
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        adminProfile = findViewById(R.id.admin_profile);
        textView8 = findViewById(R.id.textView8);
        imageView4 = findViewById(R.id.imageView4);

        // Set click listeners for buttons
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next activity

            }
        });
    }
}