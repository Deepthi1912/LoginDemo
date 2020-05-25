package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teesrayear extends AppCompatActivity {
    private Button FifthsemButton;
    Button SixthsemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teesrayear);

        SixthsemButton = findViewById(R.id.button36);
        SixthsemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Teesrayear.this, SixthSemester.class));
            }
        });

        FifthsemButton = findViewById(R.id.button35);
        FifthsemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Teesrayear.this, FifthSemester.class));
            }
        });
    }
}
