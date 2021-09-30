package com.example.tutordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnComeToSignIn;
private Button BtnComeToSignUP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnComeToSignIn = (Button) findViewById(R.id.btnComToSignIn);
        BtnComeToSignUP = (Button) findViewById(R.id.btnComeToSingUp);

        btnComeToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCIn = new Intent(MainActivity.this,Login.class);
                startActivity(intentCIn);

            }
        });
        BtnComeToSignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCUp = new Intent(MainActivity.this,SelectSignUp.class);
                startActivity(intentCUp);
            }
        });
    }
}