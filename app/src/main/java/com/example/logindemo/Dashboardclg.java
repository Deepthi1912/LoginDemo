package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboardclg extends AppCompatActivity {
    Button btn_profile,btn_college,btn_department,btn_student;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboardclg);
        firebaseAuth = FirebaseAuth.getInstance();

        btn_student = findViewById(R.id.buttonStudent);
        btn_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboardclg.this, Firstpage.class));
            }
        });

        btn_department = findViewById(R.id.buttonDepartment);
        btn_department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboardclg.this, "Department Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_college = findViewById(R.id.buttonCollege);
        btn_college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboardclg.this, "College Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_profile = findViewById(R.id.buttonProfile);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboardclg.this, "Profile Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Logout(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(Dashboardclg.this, MainActivity.class));
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.logoutMenu: {
                Logout();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
