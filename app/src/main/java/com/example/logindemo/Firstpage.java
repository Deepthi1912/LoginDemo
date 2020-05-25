package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Firstpage extends AppCompatActivity {

    private Button FourthyearButton;
    Button FirstyearButton;
    Button SecondYearButton;
    Button ThirdYearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        ThirdYearButton = findViewById(R.id.button6);
        ThirdYearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstpage.this, Teesrayear.class));
            }
        });

        SecondYearButton = findViewById(R.id.button2);
        SecondYearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstpage.this, Year2nd.class));
            }
        });

        FirstyearButton = findViewById(R.id.button);
        FirstyearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstpage.this, Firstyear.class));
            }
        });

        FourthyearButton = findViewById(R.id.button7);
        FourthyearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstpage.this, Firstpage4thyr.class));
            }
        });
    }
}
