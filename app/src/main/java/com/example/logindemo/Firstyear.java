package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Firstyear extends AppCompatActivity {

    private Button FirstsemButton;
    Button SecondsemButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstyear);

        SecondsemButton = findViewById(R.id.button11);
        SecondsemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstyear.this, Ccycle.class));
            }
        });

        FirstsemButton = findViewById(R.id.button10);
        FirstsemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstyear.this, Pcycle.class));
            }
        });
    }
}
