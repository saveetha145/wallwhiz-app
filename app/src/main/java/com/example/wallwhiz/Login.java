package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import com.example.wallwhiz.APIservice.RetrofitClient;
import com.example.wallwhiz.APIservice.Service;
import com.example.wallwhiz.response.LoginRequest;
import com.example.wallwhiz.response.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Login extends AppCompatActivity {

    private EditText edtUsername, edtPassword;
    private Button btnSubmit;
    private TextView tvSignup, tvForgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Make sure this matches your XML filename

        // Initialize UI components
        edtUsername = findViewById(R.id.btnusername);
        edtPassword = findViewById(R.id.pass);
        btnSubmit = findViewById(R.id.btn_submit);
        tvSignup = findViewById(R.id.signup);
        tvForgetPassword = findViewById(R.id.forget);

        // Handle Login button click
        btnSubmit.setOnClickListener(this::onClick);

        // Handle Signup click (navigate to SignupActivity)
        tvSignup.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Sign_Up.class);
            startActivity(intent);
        });

        // Handle Forgot Password click (navigate to ForgotPasswordActivity)
        tvForgetPassword.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Forget_password.class);
            startActivity(intent);
        });
    }

    private void onClick(View v) {
        String username = edtUsername.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(Login.this, "Please enter all details", Toast.LENGTH_SHORT).show();
        } else {
            // Create a LoginRequest object
            LoginRequest loginRequest = new LoginRequest(username, password);

            // Make the Retrofit call
            Service apiService = RetrofitClient.getClient().create(Service.class);
            Call<LoginResponse> call = apiService.loginUser(loginRequest);

            call.enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        LoginResponse loginResponse = response.body();
                        if (loginResponse.isSuccess()) {
                            // If login is successful, navigate to Upload activity
                            Intent intent = new Intent(Login.this, Upload_image.class);
                            startActivity(intent);
                            finish(); // Finish the login activity so user can't go back
                        } else {
                            // Show error message from server
                            Toast.makeText(Login.this, loginResponse.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(Login.this, "Login failed. Please try again.", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    Toast.makeText(Login.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                    Log.d("TAG", "onResponse: "+t.getMessage());

                }
            });
        }
    }
}
