package com.example.wallwhiz;



import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class signup extends AppCompatActivity {

    private EditText editTextName, editTextPhone, editTextPassword, editTextConfirmPassword;
    private AppCompatButton btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup); // Ensure your XML file is named activity_signup.xml

        // Initialize UI components
        editTextName = findViewById(R.id.btn_name);
        editTextPhone = findViewById(R.id.btn_num);
        editTextPassword = findViewById(R.id.btn_pass);
        editTextConfirmPassword = findViewById(R.id.btn_confirmpass);
        btnSubmit = findViewById(R.id.btn_submit);

        // Set click listener for the SUBMIT button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAndSubmit();
            }
        });
    }

    private void validateAndSubmit() {
        // Get values from the input fields
        String name = editTextName.getText().toString().trim();
        String phone = editTextPhone.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String confirmPassword = editTextConfirmPassword.getText().toString().trim();

        // Validate inputs
        if (TextUtils.isEmpty(name)) {
            editTextName.setError("Name is required");
            editTextName.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(phone)) {
            editTextPhone.setError("Phone number is required");
            editTextPhone.requestFocus();
            return;
        }

        if (phone.length() != 10) {
            editTextPhone.setError("Enter a valid 10-digit phone number");
            editTextPhone.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            editTextPassword.setError("Password must be at least 6 characters");
            editTextPassword.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(confirmPassword)) {
            editTextConfirmPassword.setError("Confirm your password");
            editTextConfirmPassword.requestFocus();
            return;
        }

        if (!password.equals(confirmPassword)) {
            editTextConfirmPassword.setError("Passwords do not match");
            editTextConfirmPassword.requestFocus();
            return;
        }

        // If all validations pass, navigate to the login page
        Toast.makeText(this, "Signup successful!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(signup.this, login.class);
        startActivity(intent);
        finish(); // Close the current activity
    }
}
