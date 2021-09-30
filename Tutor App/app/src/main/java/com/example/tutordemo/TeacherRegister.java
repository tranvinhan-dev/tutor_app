package com.example.tutordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TeacherRegister extends AppCompatActivity {
private ImageView imgvBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_register);
        imgvBack = (ImageView) findViewById(R.id.imgvBackFromTeachUp);

        imgvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBTeacher = new Intent(TeacherRegister.this,SelectSignUp.class);
                startActivity(intentBTeacher);
            }
        });
    }
}