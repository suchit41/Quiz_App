package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button Start;
TextView Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Start(View v){
       // Toast.makeText(this,"working",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,First_page.class);
        startActivity(intent);
        Start = findViewById(R.id.Start);
        Name = findViewById(R.id.Name);
        String name = Name.getText().toString();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}