package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pcycle extends AppCompatActivity {

    private Button PhysicsButton;
    Button Maths1Button;
    Button ElectricalButton;
    Button CivilButton;
    Button MechanicalButton;
    Button KannadaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcycle);

        KannadaButton = findViewById(R.id.button17);
        KannadaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pcycle.this, Kannada.class));
            }
        });

        MechanicalButton = findViewById(R.id.button16);
        MechanicalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pcycle.this, Mechanical.class));
            }
        });

        CivilButton = findViewById(R.id.button15);
        CivilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pcycle.this, Civil.class));
            }
        });


        ElectricalButton = findViewById(R.id.button14);
        ElectricalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pcycle.this, Electrical.class));
            }
        });

        Maths1Button = findViewById(R.id.button13);
        Maths1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pcycle.this, Maths1.class));
            }
        });

        PhysicsButton = findViewById(R.id.button12);
        PhysicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pcycle.this, Physics.class));
            }
        });
    }
}
