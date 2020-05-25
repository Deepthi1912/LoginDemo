package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdSemester extends AppCompatActivity {

    private Button Math3Button;
    Button DataButton;
    Button CoButton;
    Button DigitalButton;
    Button DiscreteButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_semester);

        DiscreteButton = findViewById(R.id.button29);
        DiscreteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdSemester.this, DiscreteMath.class));
            }
        });

        DigitalButton = findViewById(R.id.button28);
        DigitalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdSemester.this, DigitalElectronics.class));
            }
        });

        CoButton = findViewById(R.id.button27);
        CoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdSemester.this, ComputerOrg.class));
            }
        });

        DataButton = findViewById(R.id.button26);
        DataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdSemester.this, DataStructures.class));
            }
        });

        Math3Button = findViewById(R.id.button25);
        Math3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdSemester.this, Maths3.class));
            }
        });
    }
}
