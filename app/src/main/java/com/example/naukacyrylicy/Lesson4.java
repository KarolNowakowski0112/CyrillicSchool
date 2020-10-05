package com.example.naukacyrylicy;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson4 extends AppCompatActivity {

    TextView lesson_txt, txt;

    String desc = "W tej lekcji przedstawiono dłuższe i bardziej skomplikowane słowa rosyjskie. " +
            "Twoja znajomość cyrylicy na tym etapie powinna pozwolić Ci zrozumieć większość słów, " +
            "które mają podobne brzmienie w języku polskim. " +
            "Na końcu tej lekcji dostępny jest krótki quiz sprawdzający, jak dużo udało Ci się zapamiętać.";
    String top_txt = "Lekcja 4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        lesson_txt = findViewById(R.id.lesson_txt);
        txt = findViewById(R.id.txt);

        lesson_txt.setText(top_txt);
        txt.setText(desc);

    }
}