package com.example.naukacyrylicy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button lesson1, lesson2, lesson3, lesson4, lesson5, lesson6, test1, test2, test3, prev, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lesson1 = findViewById(R.id.lesson1);
        lesson2 = findViewById(R.id.lesson2);
        lesson3 = findViewById(R.id.lesson3);
        lesson4 = findViewById(R.id.lesson4);
        lesson5 = findViewById(R.id.lesson5);
        lesson6 = findViewById(R.id.lesson6);
        test1 = findViewById(R.id.test1);
        test2 = findViewById(R.id.test2);
        test3 = findViewById(R.id.test3);
        //prev = findViewById(R.id.prev);
        //next = findViewById(R.id.next);


        lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent les1 = new Intent(MainActivity.this, Lesson1.class);

                startActivity(les1);
            }
        });
        lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent les2 = new Intent(MainActivity.this, Lesson2.class);

                startActivity(les2);
            }
        });
        lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent les3 = new Intent(MainActivity.this, Lesson3.class);

                startActivity(les3);
            }
        });
        lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent les4 = new Intent(MainActivity.this, Lesson4.class);

                startActivity(les4);
            }
        });
        lesson5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent les5 = new Intent(MainActivity.this, Lesson5.class);

                startActivity(les5);
            }
        });
        //activities for lesson6 and all 3 tests
    }
}
