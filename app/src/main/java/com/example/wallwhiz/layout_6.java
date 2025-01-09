package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.databinding.ActivityLayout1Binding;
import com.example.wallwhiz.databinding.ActivityLayout6Binding;
import com.example.wallwhiz.databinding.ActivitySizeBinding;


public class layout_6 extends AppCompatActivity {


    private ActivityLayout6Binding binding;
    private AppCompatButton btnNext, btnBack, btnSelectFrames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLayout6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        btnNext = findViewById(R.id.btnnext);
        btnBack = findViewById(R.id.btnback);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(layout_6.this, layout7.class));
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}