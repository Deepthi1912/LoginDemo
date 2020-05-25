package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthSemester extends AppCompatActivity {
    private Button Math4Button;
    Button oopsButton;
    Button faflButton;
    Button microconButton;
    Button desButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_semester);

        desButton = findViewById(R.id.button34);
        desButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FourthSemester.this, DesignAlgo.class));
            }
        });

        microconButton = findViewById(R.id.button33);
        microconButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FourthSemester.this, Microcontroller.class));
            }
        });

        faflButton = findViewById(R.id.button32);
        faflButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FourthSemester.this, Fafl.class));
            }
        });

        oopsButton = findViewById(R.id.button31);
        oopsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FourthSemester.this, Oops.class));
            }
        });

        Math4Button = findViewById(R.id.button30);
        Math4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FourthSemester.this, Math4.class));
            }
        });
    }
}
