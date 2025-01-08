
package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class digital extends AppCompatActivity {

    private Button btnBack, btnNext, btnSelect;
    private ImageView logo, imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital);


        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        btnSelect = findViewById(R.id.btnselect);
        logo = findViewById(R.id.logo);
        imageView = findViewById(R.id.digitalimg);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(digital.this, mosaic.class);
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