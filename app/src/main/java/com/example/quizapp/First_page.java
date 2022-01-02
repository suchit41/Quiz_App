package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class First_page extends AppCompatActivity {
 private final String[] questions ={"1.Garbage Collection is manual process.",
         "2.The JRE deletes objects when it determines that they are no longer being used. This process is called Garbage Collection.",
         "3.Assignment operator is evaluated Left to Right.",
         "4.All binary operators except for the assignment operators are evaluated from Left to Right",
         "5.int x[] = new int[]{10,20,30};<br><br>Arrays can also be created and initialize as in above statement"
 };

 private int Score =0;
    Button True;
    Button False;

    TextView Question;

 private final boolean [] answers ={false,true,false,true,true};
    int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
         True = findViewById(R.id.True);
         False = findViewById(R.id.False);
        Question = findViewById(R.id.Question);
       Question.setText(questions[index]);
         True.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){
                    Toast.makeText(First_page.this, "Your Score Is"+Score, Toast.LENGTH_SHORT).show();
                }
                if(answers[index]){
                    Score++;
                }  index++;
                if(index<=questions.length-1) {
                    Question.setText(questions[index]);
                } else {
                    Toast.makeText(First_page.this, "Your Score Is"+Score, Toast.LENGTH_SHORT).show();
                }
            }
         });
            False.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(index<=questions.length-1){
            Toast.makeText(First_page.this, "Your Score Is"+Score, Toast.LENGTH_SHORT).show();
            }
            if(!answers[index]){
            Score++;

            }  index++;
            if(index<=questions.length-1) {
            Question.setText(questions[index]);
            } else {
            Toast.makeText(First_page.this, "Your Score Is"+Score, Toast.LENGTH_SHORT).show();
            }
            }
            });
            }
            }