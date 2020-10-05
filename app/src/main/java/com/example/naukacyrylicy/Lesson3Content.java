package com.example.naukacyrylicy;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;

public class Lesson3Content extends AppCompatActivity{
    TextView lesson_up_txt, no_txt, sound_txt, sign_expr_txt;
    Button back, quiz;

    TextView sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10,
            sound11, sound12, sound13, sound14, sound15, sound16, sound17;

    TextView sign_expr1, sign_expr2, sign_expr3, sign_expr4, sign_expr5, sign_expr6,
            sign_expr7, sign_expr8, sign_expr9, sign_expr10, sign_expr11, sign_expr12,
            sign_expr13, sign_expr14, sign_expr15, sign_expr16, sign_expr17;

    String lesson_content = "Lekcja 3";

    MediaPlayer player;

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
                Intent back = new Intent(Lesson3Content.this, Lesson3.class);

                startActivity(back);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(Lesson3Content.this, Quiz2.class);

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


        sound1.setText("tak");
        sound2.setText("nie");
        sound3.setText("możliwe");
        sound4.setText("dziękuję");
        sound5.setText("proszę");
        sound6.setText("dzień dobry");
        sound7.setText("do widzenia");
        sound8.setText("przepraszam");
        sound9.setText("wiem");
        sound10.setText("lubię");
        sound11.setText("chcę");
        sound12.setText("nazywam się");
        sound13.setText("potrzebuję");
        sound14.setText("gdzie");
        sound15.setText("kiedy");
        sound16.setText("jak");
        sound17.setText("dlaczego");

        sign_expr1.setText("да");
        sign_expr2.setText("нет");
        sign_expr3.setText("возможно");
        sign_expr4.setText("cпасибо");
        sign_expr5.setText("пожалуйста");
        sign_expr6.setText("доброе утро");
        sign_expr7.setText("до свидания");
        sign_expr8.setText("извините");
        sign_expr9.setText("я знаю");
        sign_expr10.setText("mне нравиться");
        sign_expr11.setText("я хочу");
        sign_expr12.setText("меня зовут");
        sign_expr13.setText("я нуждаюсь");
        sign_expr14.setText("где");
        sign_expr15.setText("когда");
        sign_expr16.setText("как");
        sign_expr17.setText("зачем");
    }

    public void play(View view){
        if (player == null){
            switch(view.getId()){
                case R.id.sing_ex_1_txt:
                {
                    player = MediaPlayer.create(this, R.raw.tak);
                    break;
                }
                case R.id.sing_ex_2_txt:
                {
                    player = MediaPlayer.create(this, R.raw.nie);
                    break;
                }
                case R.id.sing_ex_3_txt:
                {
                    player = MediaPlayer.create(this, R.raw.mozliwe);
                    break;
                }
                case R.id.sing_ex_4_txt:
                {
                    player = MediaPlayer.create(this, R.raw.dziekuje);
                    break;
                }
                case R.id.sing_ex_5_txt:
                {
                    player = MediaPlayer.create(this, R.raw.prosze);
                    break;
                }
                case R.id.sing_ex_6_txt:
                {
                    player = MediaPlayer.create(this, R.raw.dzien_dobry);
                    break;
                }
                case R.id.sing_ex_7_txt:
                {
                    player = MediaPlayer.create(this, R.raw.do_widzenia);
                    break;
                }
                case R.id.sing_ex_8_txt:
                {
                    player = MediaPlayer.create(this, R.raw.przepraszam);
                    break;
                }
                case R.id.sing_ex_9_txt:
                {
                    player = MediaPlayer.create(this, R.raw.wiem);
                    break;
                }
                case R.id.sing_ex_10_txt:
                {
                    player = MediaPlayer.create(this, R.raw.lubie);
                    break;
                }
                case R.id.sing_ex_11_txt:
                {
                    player = MediaPlayer.create(this, R.raw.chce);
                    break;
                }
                case R.id.sing_ex_12_txt:
                {
                    player = MediaPlayer.create(this, R.raw.nazywam_sie);
                    break;
                }
                case R.id.sing_ex_13_txt:
                {
                    player = MediaPlayer.create(this, R.raw.potrzebuje);
                    break;
                }
                case R.id.sing_ex_14_txt:
                {
                    player = MediaPlayer.create(this, R.raw.gdzie);
                    break;
                }
                case R.id.sing_ex_15_txt:
                {
                    player = MediaPlayer.create(this, R.raw.kiedy);
                    break;
                }
                case R.id.sing_ex_16_txt:
                {
                    player = MediaPlayer.create(this, R.raw.jak);
                    break;
                }
                case R.id.sing_ex_17_txt:
                {
                    player = MediaPlayer.create(this, R.raw.dlaczego);
                    break;
                }
            }
            //player = MediaPlayer.create(this, R.raw.dziekuje);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }

        player.start();
    }

    public void stopPlayer(){
        if (player != null){
            player.release();
            player = null;
        }
    }

    @Override
    protected void onStop(){
        super.onStop();
        stopPlayer();
    }
}
