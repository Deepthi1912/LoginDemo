package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthSemester extends AppCompatActivity {

    private Button uspButton;
    Button javaButton;
    Button dbmsButton;
    Button addsButton;
    Button stButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_semester);

        stButton = findViewById(R.id.button41);
        stButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FifthSemester.this, Softwaretest.class));
            }
        });

        addsButton = findViewById(R.id.button40);
        addsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FifthSemester.this, Adds.class));
            }
        });

        dbmsButton = findViewById(R.id.button39);
        dbmsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FifthSemester.this, Dbms.class));
            }
        });

        javaButton = findViewById(R.id.button38);
        javaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FifthSemester.this, Adjava.class));
            }
        });

        uspButton = findViewById(R.id.button37);
        uspButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FifthSemester.this, Usp.class));
            }
        });

    }
}
