package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void point3A(View view) {
        scoreA += 3;
        displayScoreA(scoreA);
    }

    public void point2A(View view) {
        scoreA += 2;
        displayScoreA(scoreA);
    }

    public void point1A(View view) {
        scoreA += 1;
        displayScoreA(scoreA);
    }

    public void point3B(View view) {
        scoreB += 3;
        displayScoreB(scoreB);
    }

    public void point2B(View view) {
        scoreB += 2;
        displayScoreB(scoreB);
    }

    public void point1B(View view) {
        scoreB += 1;
        displayScoreB(scoreB);
    }
    public void reset(View view){
        scoreB = 0;
        scoreA = 0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);

    }

    public void displayScoreA(int score) {
        TextView text = (TextView) findViewById(R.id.scoreA_text_view);
        text.setText(String.valueOf(score));
    }

    public void displayScoreB(int score) {
        TextView text = (TextView) findViewById(R.id.scoreB_text_view);
        text.setText(String.valueOf(score));
    }
}