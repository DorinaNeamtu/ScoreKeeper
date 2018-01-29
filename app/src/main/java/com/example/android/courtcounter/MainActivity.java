package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamReal=0;
    int penaltyTeamReal=0;
    int cornerTeamReal=0;
    int scoreTeamBarca=0;
    int penaltyTeamBarca=0;
    int cornerTeamBarca=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team Real by 1 point.
     */
    public void addScoreForReal(View v) {
        scoreTeamReal=scoreTeamReal+1;
        displayScoreForTeamReal(scoreTeamReal);
    }

    /**
     * Increase the no of penalties for Team Real by 1.
     */
    public void addPenaltyForReal(View v) {
        penaltyTeamReal=penaltyTeamReal+1;
        displayPenaltyForTeamReal(penaltyTeamReal);
    }

    /**
     * Increase the no of corners for Team Real by 1.
     */
    public void addCornerForReal(View v) {
        cornerTeamReal=cornerTeamReal+1;
        displayCornerForTeamReal(cornerTeamReal);
    }

    /**
     * Displays the given score for Team Real.
     */
    public void displayScoreForTeamReal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the penalties for Team Real.
     */
    public void displayPenaltyForTeamReal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the corners for Team Real.
     */
    public void displayCornerForTeamReal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Team Barca by 1 point.
     */
    public void addScoreForBarca(View v) {
        scoreTeamBarca=scoreTeamBarca+1;
        displayScoreForTeamBarca(scoreTeamBarca);
    }

    /**
     * Increase the no of penalties for Team Barca by 1.
     */
    public void addPenaltyForBarca(View v) {
        penaltyTeamBarca=penaltyTeamBarca+1;
        displayPenaltyForTeamBarca(penaltyTeamBarca);
    }

    /**
     * Increase the no of corners for Team Barca by 1.
     */
    public void addCornerForBarca(View v) {
        cornerTeamBarca=cornerTeamBarca+1;
        displayCornerForTeamBarca(cornerTeamBarca);
    }

    /**
     * Displays the given score for Team Barca.
     */
    public void displayScoreForTeamBarca(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the penalties for Team Barca.
     */
    public void displayPenaltyForTeamBarca(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the corners for Team Barca.
     */
    public void displayCornerForTeamBarca(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(score));
    }



    public void resetAllScore(View v){
         scoreTeamReal=0;
         penaltyTeamReal=0;
         cornerTeamReal=0;
         scoreTeamBarca=0;
         penaltyTeamBarca=0;
         cornerTeamBarca=0;
        displayScoreForTeamReal(scoreTeamReal);
        displayPenaltyForTeamReal(penaltyTeamReal);
        displayCornerForTeamReal(cornerTeamReal);
        displayScoreForTeamBarca(scoreTeamBarca);
        displayPenaltyForTeamBarca(penaltyTeamBarca);
        displayCornerForTeamBarca(cornerTeamBarca);
    }
}
