package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seeevensem extends AppCompatActivity {
    private Button entButton;
    Button cgButton;
    Button acaButton;
    Button adhocButton;
    Button multiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeevensem);

        multiButton = findViewById(R.id.button52);
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seeevensem.this, Multicore.class));
            }
        });

        adhocButton = findViewById(R.id.button51);
        adhocButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seeevensem.this, Adhoc.class));
            }
        });

        acaButton = findViewById(R.id.button50);
        acaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seeevensem.this, Advancecomputer.class));
            }
        });

        cgButton = findViewById(R.id.button49);
        cgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seeevensem.this, Computergraphics.class));
            }
        });

        entButton = findViewById(R.id.button48);
        entButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seeevensem.this, Entrepreneurship.class));
            }
        });


    }
}
