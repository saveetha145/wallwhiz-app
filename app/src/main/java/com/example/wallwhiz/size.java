package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.databinding.ActivitySizeBinding;


public class size extends AppCompatActivity {


    private ActivitySizeBinding binding;
    private AppCompatButton btnNext, btnBack, btnSelectFrames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySizeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        btnNext = findViewById(R.id.btnnext);
        btnBack = findViewById(R.id.btnback);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  startActivity(new Intent(size.this,layout1.class));
            }
        });

        binding.frame1.setOnClickListener(v -> {
            startActivity(new Intent(size.this, layout1.class));
        });
        binding.frame2.setOnClickListener(v -> {
            startActivity(new Intent(size.this, layout2.class));
        });
        binding.frame3.setOnClickListener(v -> {
            startActivity(new Intent(size.this, layout3.class));
        });
        binding.frame4.setOnClickListener(v -> {
            startActivity(new Intent(size.this, layout_4.class));
        });
        binding.frame5.setOnClickListener(v -> {
            startActivity(new Intent(size.this, layout5.class));
        });
        binding.frame6.setOnClickListener(v -> {
            startActivity(new Intent(size.this, layout_6.class));
        });
        binding.frame7.setOnClickListener(v -> {
            startActivity(new Intent(size.this, layout7.class));
        });
        binding.frame8.setOnClickListener(v -> {
            startActivity(new Intent(size.this, layout7.class));
        });
        binding.frame9.setOnClickListener(v -> {
            startActivity(new Intent(size.this, layout1.class));
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

   /* private void setImageViewListeners() {
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: First");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Two");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Three");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Four");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Five");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Six");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Seven");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Eight");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Nine");
            }
        });
    }*/

//    private void updateSizeSelector(String sizeText) {
//        sizeSelector.setText(sizeText);
//        Toast.makeText(this, sizeText + " selected", Toast.LENGTH_SHORT).show();
//    }
//
//    private void goToNextActivity() {
//        String selectedSize = sizeSelector.getText().toString().trim();
//        if (selectedSize.isEmpty()) {
//            Toast.makeText(this, "Please select a size before proceeding", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, "Navigating to the next screen...", Toast.LENGTH_SHORT).show();
//            // Navigate to the next activity
//            Intent intent = new Intent(size.this, layout1.class);
//            intent.putExtra("selectedSize", selectedSize);
//            startActivity(intent);
//        }
//    }
}
