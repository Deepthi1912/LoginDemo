package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;
import android.content.Intent;

import com.google.firebase.auth.FirebaseAuth;

public class SekendActivity extends AppCompatActivity {
    //private Toolbar toolbar;
    private FirebaseAuth firebaseAuth;
    Button firstButton;
    Button secondButton;
    Button thirdButton;
    Button fourthButton;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekend);
        //toolbar = findViewById(R.id.myToolBar);
        //setSupportActionBar(toolbar);

        firebaseAuth = FirebaseAuth.getInstance();
        firstButton = findViewById(R.id.button_one);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SekendActivity.this, ThirdActivity.class));
            }
        });

        secondButton = findViewById(R.id.button3);
        secondButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(SekendActivity.this, FourthActivity.class));
            }
        });
        thirdButton = findViewById(R.id.button4);
        thirdButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(SekendActivity.this, FifthActivity.class));
            }
        });

        fourthButton = findViewById(R.id.button5);
        fourthButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(SekendActivity.this, SixthActivity.class));
            }
        });


        logout = (Button)findViewById(R.id.btnLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logout();
            }
        });

    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

   private void Logout(){
       firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SekendActivity.this, MainActivity.class));
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
