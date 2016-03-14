package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Displays the given score for Team A.
     */

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    public void threePoints(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPoints(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void onePoint(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void onePointB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
