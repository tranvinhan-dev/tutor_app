package com.example.tutordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SelectSignUp extends AppCompatActivity {
private ImageView imgvBack;
private Button btnComeToTeacher;
private Button btnComeToStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sign_up);
        btnComeToStudent = (Button) findViewById(R.id.btnComeToStudent);
        btnComeToTeacher = (Button) findViewById(R.id.btnComToTeacher);
        imgvBack = (ImageView) findViewById(R.id.imgvBackFromSelect);

        btnComeToStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCStudent = new Intent(SelectSignUp.this,Register.class);
                startActivity(intentCStudent);
            }
        });
        btnComeToTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCTeacher = new Intent(SelectSignUp.this,TeacherRegister.class);
                startActivity(intentCTeacher);
            }
        });
        imgvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBSelect = new Intent(SelectSignUp.this,MainActivity.class);
                startActivity(intentBSelect);
            }
        });

    }
}