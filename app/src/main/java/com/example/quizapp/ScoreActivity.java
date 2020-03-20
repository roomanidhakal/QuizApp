package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity
{
    private TextView scoreView;
    private Button backToStart;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreView = findViewById(R.id.scoreText);
        backToStart = findViewById(R.id.button);

        Intent intent = getIntent();
        String score = intent.getStringExtra("SCORE");
        scoreView.setText(score);


        backToStart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent_start = new Intent(ScoreActivity.this, MainActivity.class);
                startActivity(intent_start);
            }
        });

    }
}
