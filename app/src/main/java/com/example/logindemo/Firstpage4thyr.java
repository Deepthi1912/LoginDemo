package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Firstpage4thyr extends AppCompatActivity {

    private Button EightsemButton;
    Button SeventhsemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage4thyr);

        SeventhsemButton = findViewById(R.id.button8);
        SeventhsemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstpage4thyr.this, Seeevensem.class));
            }
        });

        EightsemButton = findViewById(R.id.button9);
        EightsemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstpage4thyr.this, SekendActivity.class));
            }
        });
    }
}
