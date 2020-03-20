package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizAcitvity extends AppCompatActivity
{
    private Button submitQuizButton;
    private int score = 0;
    private RadioGroup radioAnswer1, radioAnswer2, radioAnswer3, radioAnswer4, radioAnswer5, radioAnswer6, radioAnswer7, radioAnswer8;
    private CheckBox checkAnswer1, checkAnswer2, checkAnswer3, checkAnswer4;
    private EditText textAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_acitvity);

        submitQuizButton = findViewById(R.id.submitButton);

        textAnswer = findViewById(R.id.editText);

        checkAnswer1 = findViewById(R.id.check1);
        checkAnswer2 = findViewById(R.id.check2);
        checkAnswer3 = findViewById(R.id.check3);
        checkAnswer4 = findViewById(R.id.check4);

        radioAnswer1 = findViewById(R.id.radio_answer1);
        radioAnswer2 = findViewById(R.id.radio_answer2);
        radioAnswer3 = findViewById(R.id.radio_answer3);
        radioAnswer4 = findViewById(R.id.radio_answer4);
        radioAnswer5 = findViewById(R.id.radio_answer5);
        radioAnswer6 = findViewById(R.id.radio_answer6);
        radioAnswer7 = findViewById(R.id.radio_answer7);
        radioAnswer8 = findViewById(R.id.radio_answer8);

        radioAnswer1.clearCheck();
        radioAnswer2.clearCheck();
        radioAnswer3.clearCheck();
        radioAnswer4.clearCheck();
        radioAnswer5.clearCheck();
        radioAnswer6.clearCheck();
        radioAnswer7.clearCheck();
        radioAnswer8.clearCheck();

        //Question 1
        radioAnswer1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.japan)
                    score += 1;
            }
        });

        //Question 2
        radioAnswer2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.annoying)
                    score += 1;
            }
        });

        //Question 3
        radioAnswer3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.pk)
                    score += 1;
            }
        });

        //Question 4
        radioAnswer4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.kusuke)
                    score += 1;
            }
        });

        //Question 5
        radioAnswer5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.kusuo)
                    score += 1;
            }
        });

        //Question 6
        radioAnswer6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.bugs)
                    score += 1;
            }
        });

        //Question 7
        radioAnswer7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.aren)
                    score += 1;
            }
        });

        //Question 8
        radioAnswer8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.one_month)
                    score += 1;
            }
        });

        submitQuizButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Question 10
                String answer = textAnswer.getText().toString();
                if (answer.equalsIgnoreCase("coffee jelly"));
                    score += 1;

                 //Question 9
                if (checkAnswer1.isChecked() && checkAnswer4.isChecked() && !checkAnswer2.isChecked() && !checkAnswer3.isChecked())
                    score += 1;

                Intent intent = new Intent(QuizAcitvity.this, ScoreActivity.class);
                intent.putExtra("SCORE", score+"/10");
                startActivity(intent);
            }
        });
    }
}
