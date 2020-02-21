package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FootballActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //super.setTheme(R.style.Football);
        setContentView(R.layout.activity_football);
    }

    /**
     * Displays the given score for Team A or B.
     */
    public void displayScore(TextView scoreView, int score) {
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Update score of Team B.
     */
    public void updateScoreForTeamA(View view) {
        switch (view.getId()) {
            case (R.id.goal_team_A):
            case (R.id.penalty_team_A):
                scoreTeamA = scoreTeamA + 1;
                displayScore((TextView) findViewById(R.id.score_team_A), scoreTeamA);
                break;
            case (R.id.own_goal_team_A):
                scoreTeamB = scoreTeamB + 1;
                displayScore((TextView) findViewById(R.id.score_team_B), scoreTeamB);
                break;
        }
    }

    /**
     * Update score of Team B.
     */
    public void updateScoreForTeamB(View view) {
        switch (view.getId()) {
            case (R.id.goal_team_B):
            case (R.id.penalty_team_B):
                scoreTeamB = scoreTeamB + 1;
                displayScore((TextView) findViewById(R.id.score_team_B), scoreTeamB);
                break;
            case (R.id.own_goal_team_B):
                scoreTeamA = scoreTeamA + 1;
                displayScore((TextView) findViewById(R.id.score_team_A), scoreTeamA);
                break;
        }
    }

    /**
     * Resets the score of Team A and Team B.
     */
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayScore((TextView) findViewById(R.id.score_team_A), scoreTeamA);
        displayScore((TextView) findViewById(R.id.score_team_B), scoreTeamB);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
