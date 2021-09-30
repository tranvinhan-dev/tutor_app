package com.example.tutordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Login extends AppCompatActivity {
    private ImageView imgvBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        imgvBack = (ImageView) findViewById(R.id.imgvBackFromIn);

        imgvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackFromUp = new Intent(Login.this,MainActivity.class);
                startActivity(intentBackFromUp);
            }
        });
    }
}