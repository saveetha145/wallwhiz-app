package com.example.wallwhiz ;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.woodenart;

public class mosaic extends AppCompatActivity {

    private ImageView logo, mosaicImage;
    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mosaic);


        logo = findViewById(R.id.logo);
        mosaicImage = findViewById(R.id.a);
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
                navigateToNextActivity();
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectMosaicArt();
            }
        });


        mosaicImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mosaic.this, "Mosaic Art selected", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void navigateToNextActivity() {

        Intent intent = new Intent(mosaic.this, woodenart.class);
        startActivity(intent);
    }


    private void selectMosaicArt() {
        Toast.makeText(this, "Mosaic Art selected", Toast.LENGTH_SHORT).show();

    }
}

