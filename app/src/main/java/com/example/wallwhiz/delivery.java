package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class delivery extends AppCompatActivity  {

    private Button btnBack, btnNext, btnSelect;
    private TextView delivery, customizeFrameText, details, phn, altphn, add, land, payment;
    private ImageView logo, gpay, scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        // Initialize views
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        btnSelect = findViewById(R.id.btnselect);
        delivery = findViewById(R.id.delivery);
        customizeFrameText = findViewById(R.id.customize_frame_text);
        details = findViewById(R.id.details);
        phn = findViewById(R.id.phn);
        altphn = findViewById(R.id.altphn);
        add = findViewById(R.id.add);
        land = findViewById(R.id.land);
        payment = findViewById(R.id.payment);
        logo = findViewById(R.id.logo);
        gpay = findViewById(R.id.gpay);
        scanner = findViewById(R.id.logo);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.wallwhiz.delivery.this, truck.class);
                startActivity(intent);
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}