package com.example.wallwhiz.APIservice;

import com.example.wallwhiz.response.LoginRequest;
import com.example.wallwhiz.response.LoginResponse;
import com.example.wallwhiz.response.SignUpResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Service  {

    @FormUrlEncoded
    @POST("frame/signup.php")  // Replace with your actual PHP script name
    Call<SignUpResponse> registerUser(
            @Field("name") String name,
            @Field("phone_number") String phoneNumber,
            @Field("password") String password
    );
    @POST("frame/login.php") // Make sure this matches your PHP file path
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);
}

