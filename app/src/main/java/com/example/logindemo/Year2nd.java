package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Year2nd extends AppCompatActivity {

    private Button ThirdsemButton;
    Button FourthsemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year2nd);

        FourthsemButton = findViewById(R.id.button24);
        FourthsemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Year2nd.this, FourthSemester.class));
            }
        });

        ThirdsemButton = findViewById(R.id.button23);
        ThirdsemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Year2nd.this, ThirdSemester.class));
            }
        });
    }
}
