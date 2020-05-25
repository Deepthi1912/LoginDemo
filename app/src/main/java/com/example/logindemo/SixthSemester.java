package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthSemester extends AppCompatActivity {

    private Button oomdButton;
    Button cnButton;
    Button wtButton;
    Button imgButton;
    Button dcButton;
    Button compilerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_semester);

        compilerButton = findViewById(R.id.button47);
        compilerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SixthSemester.this, Compilerdesign.class));
            }
        });

        dcButton = findViewById(R.id.button46);
        dcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SixthSemester.this, Datacommunication.class));
            }
        });

        imgButton = findViewById(R.id.button45);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SixthSemester.this, Digitalimg.class));
            }
        });

        wtButton = findViewById(R.id.button44);
        wtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SixthSemester.this, Webtechnology.class));
            }
        });

        cnButton = findViewById(R.id.button43);
        cnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SixthSemester.this, Computernetwork.class));
            }
        });

        oomdButton = findViewById(R.id.button42);
        oomdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SixthSemester.this, Oomd.class));
            }
        });

    }
}
