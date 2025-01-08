package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    private EditText etName, etPhoneEmail, etPassword, etConfirmPassword;
    private Button btnSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etName = findViewById(R.id.btn_name);
        etPhoneEmail = findViewById(R.id.btn_num);
        etPassword = findViewById(R.id.btn_pass);
        etConfirmPassword = findViewById(R.id.btn_confirmpass);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSubmit();
            }
        });
    }

    private void handleSubmit() {
        String name = etName.getText().toString().trim();
        String phoneEmail = etPhoneEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        String confirmPassword = etConfirmPassword.getText().toString().trim();

//        if (name.isEmpty()) {
//            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        else if (phoneEmail.isEmpty()) {
//            Toast.makeText(this, "Please enter your phone number or email", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        else if (password.isEmpty()) {
//            Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        else if (confirmPassword.isEmpty()) {
//            Toast.makeText(this, "Please confirm your password", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        else if (!password.equals(confirmPassword)) {
//            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
//            return;
//        }
//        else{
//            Intent intent = new Intent(signup.this, upload.class);
//            startActivity(intent);
//        }

        Intent intent = new Intent(signup.this, upload.class);
        startActivity(intent);

        // If all inputs are valid, proceed further
        Toast.makeText(this, "Signup successful", Toast.LENGTH_SHORT).show();

    }
}
