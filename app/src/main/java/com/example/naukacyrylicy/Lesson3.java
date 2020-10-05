package com.example.naukacyrylicy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson3 extends AppCompatActivity {

    TextView lesson_txt, txt;

    String desc = "Znasz już wszystkie znaki Cyrylicy, świetnie! Teraz czas pójść krok dalej." +
            "W tej lekcji poznasz najprostsze i najważniejsze słowa w języku rosyjskim." +
            "Poćwicz ich pisownię oraz wymowę, a następnie spróbuj rozwiązać quiz.";
    String top_txt = "Lekcja 3";

    Button start_lesson, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        lesson_txt = findViewById(R.id.lesson_txt);
        txt = findViewById(R.id.txt);

        lesson_txt.setText(top_txt);
        txt.setText(desc);

        start_lesson = findViewById(R.id.start_lesson);
        back = findViewById(R.id.prev);

        start_lesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start_lesson = new Intent(Lesson3.this, Lesson3Content.class);

                startActivity(start_lesson);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Lesson3.this, MainActivity.class);

                startActivity(back);
            }
        });
    }
}
