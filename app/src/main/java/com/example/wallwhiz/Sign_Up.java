
package com.example.wallwhiz;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.APIservice.RetrofitClient;
import com.example.wallwhiz.APIservice.Service;
import com.example.wallwhiz.Login;
import com.example.wallwhiz.R;
import com.example.wallwhiz.response.SignUpResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sign_Up extends AppCompatActivity {

    private EditText editTextName, editTextPhone, editTextPassword, editTextConfirmPassword;
    private AppCompatButton btnSubmit;
    private Service apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize UI components
        editTextName = findViewById(R.id.btn_name);
        editTextPhone = findViewById(R.id.btn_num);
        editTextPassword = findViewById(R.id.btn_pass);
        editTextConfirmPassword = findViewById(R.id.btn_confirmpass);
        btnSubmit = findViewById(R.id.btn_submit);

        // Initialize Retrofit Service
        apiService = RetrofitClient.getClient().create(Service.class);

        // Set click listener
        btnSubmit.setOnClickListener(v -> validateAndSubmit());
    }

    private void validateAndSubmit() {
        String name = editTextName.getText().toString().trim();
        String phone = editTextPhone.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String confirmPassword = editTextConfirmPassword.getText().toString().trim();

        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(phone) || TextUtils.isEmpty(password) || TextUtils.isEmpty(confirmPassword)) {
            Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show();
            return;
        }

        if (phone.length() != 10) {
            editTextPhone.setError("Enter a valid 10-digit phone number");
            return;
        }

        if (password.length() < 6) {
            editTextPassword.setError("Password must be at least 6 characters");
            return;
        }

        if (!password.equals(confirmPassword)) {
            editTextConfirmPassword.setError("Passwords do not match");
            return;
        }

        registerUser(name, phone, password);
    }

    private void registerUser(String name, String phone, String password) {
        Call<SignUpResponse> call = apiService.registerUser(name, phone, password);
        call.enqueue(new Callback<SignUpResponse>() {
            @Override
            public void onResponse(Call<SignUpResponse> call, Response<SignUpResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    SignUpResponse apiResponse = response.body();
                    Toast.makeText(Sign_Up.this, apiResponse.getMessage(), Toast.LENGTH_SHORT).show();

                    if ("success".equals(apiResponse.getStatus())) {
                        Intent intent = new Intent(Sign_Up.this, Login.class);
                        startActivity(intent);
                        finish();
                    }
                } else {
                    Toast.makeText(Sign_Up.this, "Server Error", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SignUpResponse> call, Throwable t) {
                Toast.makeText(Sign_Up.this, "Network Error: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
