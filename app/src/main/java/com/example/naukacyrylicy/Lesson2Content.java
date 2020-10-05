package com.example.naukacyrylicy;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class Lesson2Content extends AppCompatActivity{
    TextView lesson_up_txt, no_txt, sound_txt, sign_expr_txt;
    Button back, quiz;

    TextView sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10,
            sound11, sound12, sound13, sound14, sound15, sound16, sound17;

    TextView sign_expr1, sign_expr2, sign_expr3, sign_expr4, sign_expr5, sign_expr6,
            sign_expr7, sign_expr8, sign_expr9, sign_expr10, sign_expr11, sign_expr12,
            sign_expr13, sign_expr14, sign_expr15, sign_expr16, sign_expr17;

    String lesson_content = "Lekcja 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_content);

        lesson_up_txt = findViewById(R.id.lesson_content_txt);
        lesson_up_txt.setText(lesson_content);

        back = findViewById(R.id.back_to_desc);
        quiz = findViewById(R.id.go_to_quiz);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Lesson2Content.this, Lesson2.class);

                startActivity(back);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(Lesson2Content.this, Quiz2.class);

                startActivity(quiz);
            }
        });

        no_txt = findViewById(R.id.no_txt);
        sound_txt = findViewById(R.id.sound_txt);
        sign_expr_txt = findViewById(R.id.sing_expression_txt);

        no_txt.setText("No");
        sound_txt.setText("Pol");
        sign_expr_txt.setText("Rus");

        sound1 = findViewById(R.id.sound_1_txt);
        sound2 = findViewById(R.id.sound_2_txt);
        sound3 = findViewById(R.id.sound_3_txt);
        sound4 = findViewById(R.id.sound_4_txt);
        sound5 = findViewById(R.id.sound_5_txt);
        sound6 = findViewById(R.id.sound_6_txt);
        sound7 = findViewById(R.id.sound_7_txt);
        sound8 = findViewById(R.id.sound_8_txt);
        sound9 = findViewById(R.id.sound_9_txt);
        sound10 = findViewById(R.id.sound_10_txt);
        sound11 = findViewById(R.id.sound_11_txt);
        sound12 = findViewById(R.id.sound_12_txt);
        sound13 = findViewById(R.id.sound_13_txt);
        sound14 = findViewById(R.id.sound_14_txt);
        sound15 = findViewById(R.id.sound_15_txt);
        sound16 = findViewById(R.id.sound_16_txt);
        sound17 = findViewById(R.id.sound_17_txt);

        sign_expr1 = findViewById(R.id.sing_ex_1_txt);
        sign_expr2 = findViewById(R.id.sing_ex_2_txt);
        sign_expr3 = findViewById(R.id.sing_ex_3_txt);
        sign_expr4 = findViewById(R.id.sing_ex_4_txt);
        sign_expr5 = findViewById(R.id.sing_ex_5_txt);
        sign_expr6 = findViewById(R.id.sing_ex_6_txt);
        sign_expr7 = findViewById(R.id.sing_ex_7_txt);
        sign_expr8 = findViewById(R.id.sing_ex_8_txt);
        sign_expr9 = findViewById(R.id.sing_ex_9_txt);
        sign_expr10 = findViewById(R.id.sing_ex_10_txt);
        sign_expr11 = findViewById(R.id.sing_ex_11_txt);
        sign_expr12 = findViewById(R.id.sing_ex_12_txt);
        sign_expr13 = findViewById(R.id.sing_ex_13_txt);
        sign_expr14 = findViewById(R.id.sing_ex_14_txt);
        sign_expr15 = findViewById(R.id.sing_ex_15_txt);
        sign_expr16 = findViewById(R.id.sing_ex_16_txt);
        sign_expr17 = findViewById(R.id.sing_ex_17_txt);


        sound1.setText("P p");
        sound2.setText("R r");
        sound3.setText("S s");
        sound4.setText("T t");
        sound5.setText("U u");
        sound6.setText("F f");
        sound7.setText("Ch ch");
        sound8.setText("C c");
        sound9.setText("Cz cz");
        sound10.setText("Sz sz");
        sound11.setText("Szcz szcz");
        sound12.setText("twardy znak");
        sound13.setText("Y y");
        sound14.setText("miękki znak");
        sound15.setText("E e");
        sound16.setText("ju");
        sound17.setText("ja");

        sign_expr1.setText("П n");
        sign_expr2.setText("Р р");
        sign_expr3.setText("С с");
        sign_expr4.setText("Т т");
        sign_expr5.setText("У у");
        sign_expr6.setText("Ф ф");
        sign_expr7.setText("Х х");
        sign_expr8.setText("Ц ц");
        sign_expr9.setText("Ч ч");
        sign_expr10.setText("Ш ш");
        sign_expr11.setText("Щ щ");
        sign_expr12.setText("Ъ ъ");
        sign_expr13.setText("Ы ы");
        sign_expr14.setText("Ь ь");
        sign_expr15.setText("Э э");
        sign_expr16.setText("Ю ю");
        sign_expr17.setText("Я я");
    }
}
