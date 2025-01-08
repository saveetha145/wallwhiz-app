
package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class order extends AppCompatActivity {

    private Button btnBack, btnNext;
    private TextView textView15, textView5, textView6, textView3, textView16, textView2, detailsTitle, admin;
    private ImageView logo, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Initialize views
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        textView15 = findViewById(R.id.textView15);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView3 = findViewById(R.id.textView3);
        textView16 = findViewById(R.id.textView16);
        textView2 = findViewById(R.id.textView2);
        detailsTitle = findViewById(R.id.payment);
        admin = findViewById(R.id.admin_profile);
        logo = findViewById(R.id.logo);

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
                Intent intent = new Intent(order.this, delivery.class);
                startActivity(intent);
            }
        });
    }
}
