package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ccycle extends AppCompatActivity {

    private Button ChemistryButton;
    Button CprogButton;
    Button ElectronicsButton;
    Button EnglishButton;
    Button Maths2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccycle);

        Maths2Button = findViewById(R.id.button22);
        Maths2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ccycle.this, Maths2.class));
            }
        });

        EnglishButton = findViewById(R.id.button21);
        EnglishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ccycle.this, English.class));
            }
        });

        ElectronicsButton = findViewById(R.id.button20);
        ElectronicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ccycle.this, Electronics.class));
            }
        });

        CprogButton = findViewById(R.id.button19);
        CprogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ccycle.this, Cprogramming.class));
            }
        });

        ChemistryButton = findViewById(R.id.button18);
        ChemistryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ccycle.this, Chem_is_tree.class));

            }
        });
    }
}
