package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class login extends AppCompatActivity {


    private EditText edtUsername, edtPassword;
    private AppCompatButton btnSubmit;
    private TextView tvSignup, tvForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edtUsername = findViewById(R.id.btnusername);
        edtPassword = findViewById(R.id.pass);
        btnSubmit = findViewById(R.id.btn_submit);
        tvSignup = findViewById(R.id.signup);
        tvForgotPassword = findViewById(R.id.forget);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve user input
                String username = edtUsername.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();


//                if (username.isEmpty() || password.isEmpty()) {
//                    Toast.makeText(login.this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
//                } else {
//
//                    Toast.makeText(login.this, "Login successful", Toast.LENGTH_SHORT).show();


                    Intent intent = new Intent(login.this, upload.class);
                    startActivity(intent);
//                }
            }
        });

        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the signup activity
                Intent intent = new Intent(login.this, signup.class);
                startActivity(intent);
            }
        });

        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the forgot password activity
                Intent intent = new Intent(login.this, forget.class);
                startActivity(intent);
            }
        });
    }
}