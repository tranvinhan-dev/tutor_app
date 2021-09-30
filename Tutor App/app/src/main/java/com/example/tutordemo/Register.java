package com.example.tutordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Register extends AppCompatActivity {
private ImageView imgvBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        imgvBack = (ImageView) findViewById(R.id.imgvBackFromUp);

        imgvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackFromIN = new Intent(Register.this,SelectSignUp.class);
                startActivity(intentBackFromIN);
            }
        });
    }
}