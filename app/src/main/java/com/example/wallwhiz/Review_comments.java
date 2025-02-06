package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Review_comments extends AppCompatActivity {

    private TextView desgin, write, exp, five, four, three, two, one;
    private ImageView  fivestar, fourstar, threestar, twostar, onestar;
    private EditText comments;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review); // Ensure this matches your XML file name

        // Initialize TextViews
        desgin = findViewById(R.id.desgin);
        write = findViewById(R.id.write);
        exp = findViewById(R.id.exp);
        five = findViewById(R.id.five);
        four = findViewById(R.id.four);
        three = findViewById(R.id.three);
        two = findViewById(R.id.two);
        one = findViewById(R.id.one);

        // Initialize ImageViews
        fivestar = findViewById(R.id.fivestar);
        fourstar = findViewById(R.id.fourstar);
        threestar = findViewById(R.id.threestar);
        twostar = findViewById(R.id.twostar);
        onestar = findViewById(R.id.onestar);

        // Initialize EditText
        comments = findViewById(R.id.comments);

        // Initialize Button
        submitButton = findViewById(R.id.submitButton);

        // Set OnClickListener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userComments = comments.getText().toString();

                if (userComments.isEmpty()) {
                    Toast.makeText(Review_comments.this, "Please enter your comments!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Review_comments.this, "Review submitted!", Toast.LENGTH_SHORT).show();
                    goToNextActivity();
                }
            }
        });

        // Example: Set OnClickListener for a star (e.g., five stars)
        fivestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Review_comments.this, "Rated 5 stars", Toast.LENGTH_SHORT).show();
            }
        });


        // Similarly, you can set listeners for other star ratings (fourstar, threestar, etc.)
    }

    private void goToNextActivity() {
        Toast.makeText(this, "Navigating to the next screen...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Review_comments.this, Upload_image.class);
        startActivity(intent);
    }
}
