package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.order;

public class ar extends AppCompatActivity {

    private FrameLayout rectangles;
    private Button btnAdjust, btnPosition;
    private AppCompatButton btnBack, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);


        rectangles = findViewById(R.id.rectangles);
        btnAdjust = findViewById(R.id.btn_adjust);
        btnPosition = findViewById(R.id.btn_position);
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);


        btnAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adjustView();
            }
        });


        btnPosition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adjustFramePosition();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToNextActivity();
            }
        });
    }

    private void adjustView() {

        Toast.makeText(this, "Adjusting AR view...", Toast.LENGTH_SHORT).show();
    }

    private void adjustFramePosition() {

        Toast.makeText(this, "Adjusting frame position...", Toast.LENGTH_SHORT).show();
    }

    private void navigateToNextActivity() {
        Intent intent = new Intent(ar.this,order.class);
        startActivity(intent);
    }
}
