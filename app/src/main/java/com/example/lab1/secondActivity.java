package com.example.lab1;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class secondActivity extends AppCompatActivity {

    TextView label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        label=findViewById(R.id.label);
        Intent i= getIntent();
        String name=i.getStringExtra("name");
        String age=i.getStringExtra("age");
        label.setText("Hello : "+name+" your age is : "+age);

    }
}