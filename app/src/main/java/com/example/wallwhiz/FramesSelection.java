package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class FramesSelection extends AppCompatActivity {

    private Button btnBack;
    private Spinner Spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frames_selection);

        btnBack = findViewById(R.id.btnback);
        Spinner = findViewById(R.id.spinner);

        // Frame options
        String[] frames = {"Select a Frame", "Glass Frame", "Wooden Frame", "Fabric Frame", "Metal Frame", "Plastic Frame"};

        // Adapter for the Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, frames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner.setAdapter(adapter);

        // Handle item selection
        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) return; // Ignore "Select a Frame" option

                Intent intent = null;
                switch (position) {
                    case 1: // Glass Frame
                        intent = new Intent(FramesSelection.this, Glass_frames.class);
                        break;
                    case 2: // Wooden Frame
                        intent = new Intent(FramesSelection.this, Wooden_frames.class);
                        break;
                    case 3: // Fabric Frame
                        intent = new Intent(FramesSelection.this, fabric_frames.class);
                        break;
                    case 4: // Metal Frame
                        intent = new Intent(FramesSelection.this, Metal_frames.class);
                        break;
                    case 5: // Plastic Frame
                        intent = new Intent(FramesSelection.this, Plastic_frames.class);
                        break;
                }
                if (intent != null) {
                    startActivity(intent);
                    Spinner.setSelection(0); // Reset selection to default
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        // Click listener for back button
        btnBack.setOnClickListener(v -> finish());
    }
}
