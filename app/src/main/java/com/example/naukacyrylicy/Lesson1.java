package com.example.naukacyrylicy;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson1 extends AppCompatActivity {

    TextView lesson_txt, txt;

    String desc = "Pierwsza lekcja obejmuje naukę pierwszej połowy alfabetu cyrylicy. Znajdziesz tu 16 " +
            "pierwszych znaków tego alfabetu i odpowiadające im znaki, bądź wyrażenia w języku polskim. " +
            "Na koniec dostępny jest mini quiz sprawdzający, jak dużo udało Ci się zapamiętać.";
    String top_txt = "Lekcja 1";

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
                Intent start_lesson = new Intent(Lesson1.this, Lesson1Content.class);

                startActivity(start_lesson);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Lesson1.this, MainActivity.class);

                startActivity(back);
            }
        });

    }
}
