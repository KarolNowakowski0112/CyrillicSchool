package com.example.naukacyrylicy;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson5 extends AppCompatActivity {

    TextView lesson_txt, txt;

    String desc = "Jest to już ostatnia lekcja kursu cyrylicy. Przedstawiono w niej pełne zdania " +
            "i złożone wyrażenia pochodzące z języka rosyjskiego. Zostały tu zawarte zarówno wyrażenia " +
            "brzmiące podobnie w języku polskim, jak i kilka innych wyrażeń, których znaczenie trzeba " +
            "wywnioskować. Na końcu tej lekcji dostępny jest mini quiz sprawdzający, jak dobrze " +
            "potrafisz posługiwać się cyrylicą na tym etapie.";
    String top_txt = "Lekcja 5";

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
