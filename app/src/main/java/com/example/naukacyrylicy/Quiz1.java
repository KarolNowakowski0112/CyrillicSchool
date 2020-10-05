package com.example.naukacyrylicy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

public class Quiz1 extends AppCompatActivity{

    final int quiz_no = 1;

    Button answer1, answer2, answer3, answer4, back, next;

    TextView quiz_up_txt, score_txt, question_txt;

    ImageView sasha;

    private Questions questions = new Questions();
    private String answer;

    private int score = 0;
    private int questions_number = questions.questions1.length;

    int question_no;
    int curr_question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        sasha = findViewById(R.id.sasha);

        answer1 = findViewById(R.id.first_answer);
        answer2 = findViewById(R.id.second_answer);
        answer3 = findViewById(R.id.third_answer);
        answer4 = findViewById(R.id.forth_answer);

        back = findViewById(R.id.back_to_lesson);
        next = findViewById(R.id.next_question);
        quiz_up_txt = findViewById(R.id.quiz_up_txt);

        back.setText("Wróć do lekcji");
        next.setText("Zakończ quiz");
        quiz_up_txt.setText("Quiz 1");

        score_txt = findViewById(R.id.score_txt);
        question_txt = findViewById(R.id.question_txt);

        score_txt.setText("1/10");

        updateQuestion(0);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText().equals(answer))
                    score++;

                question_no++;
                curr_question = question_no + 1;
                score_txt.setText(curr_question + "/10");

                if (question_no == questions_number)
                    endQuiz();
                else
                    updateQuestion(question_no);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText().equals(answer))
                    score++;

                question_no++;
                curr_question = question_no + 1;
                score_txt.setText(curr_question + "/10");

                if (question_no == questions_number)
                    endQuiz();
                else
                    updateQuestion(question_no);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText().equals(answer))
                    score++;

                question_no++;
                curr_question = question_no + 1;
                score_txt.setText(curr_question + "/10");

                if (question_no == questions_number)
                    endQuiz();
                else
                    updateQuestion(question_no);
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText().equals(answer))
                    score++;

                question_no++;
                curr_question = question_no + 1;
                score_txt.setText(curr_question + "/10");

                if (question_no == questions_number)
                    endQuiz();
                else
                    updateQuestion(question_no);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_to_lesson = new Intent(Quiz1.this, Lesson1Content.class);

                startActivity(back_to_lesson);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_to_main = new Intent(Quiz1.this, MainActivity.class);

                startActivity(back_to_main);
            }
        });
    }

    private void updateQuestion(int number){
        question_txt.setText(questions.getQuestion(number, quiz_no));
        answer1.setText(questions.getChoice1(number, quiz_no));
        answer2.setText(questions.getChoice2(number, quiz_no));
        answer3.setText(questions.getChoice3(number, quiz_no));
        answer4.setText(questions.getChoice4(number, quiz_no));

        answer = questions.getCorrectAnswer(number, quiz_no);
    }

    private void endQuiz(){
        answer1.setVisibility(View.GONE);
        answer2.setVisibility(View.GONE);
        answer3.setVisibility(View.GONE);
        answer4.setVisibility(View.GONE);

        question_txt.setVisibility(View.GONE);
        score_txt.setText("Twój wynik, to " + score + " na 10 możliwych.");
        score_txt.setTextSize(30);
        score_txt.setTextColor(getResources().getColor(R.color.score));

        if (score == 10)
            sasha.setVisibility(View.VISIBLE);

    }
}
