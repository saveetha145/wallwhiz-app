package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.databinding.ActivityLayout1Binding;
import com.example.wallwhiz.databinding.ActivityLayout3Binding;
import com.example.wallwhiz.databinding.ActivitySizeBinding;


public class layout3 extends AppCompatActivity {


    private ActivityLayout3Binding binding;
    private AppCompatButton btnNext, btnBack, btnSelectFrames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLayout3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        btnNext = findViewById(R.id.btnnext);
        btnBack = findViewById(R.id.btnback);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(layout3.this, layout_4.class));
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