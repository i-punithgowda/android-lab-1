package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText nameText;
    EditText ageText;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText=findViewById(R.id.name);
        ageText=findViewById(R.id.age);
        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nameText.getText().toString();
                String age=ageText.getText().toString();
                Intent i=new Intent(getApplicationContext(),secondActivity.class);
                i.putExtra("name",name);
                i.putExtra("age",age);
                startActivity(i);
            }
        });

    }
}