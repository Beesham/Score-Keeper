package com.beesham.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScoreA = 0;
    private int mScoreB = 0;
    private int mGamesWonA = 0;
    private int mGamesWonB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_table_tennis_counter);

        displayForTeamA(mScoreA);
        displayGamesWonForTeamA(mGamesWonA);
        displayForTeamB(mScoreB);
        displayGamesWonForTeamB(mGamesWonB);
    }

    /*
    * Reset the score
    */
    public void resetScores(View v){
        mScoreA = 0;
        mScoreB = 0;

        displayForTeamA(mScoreA);
        displayForTeamB(mScoreB);
    }

    /*
    * Reset the scores and games won
    */
    public void resetAll(View v){
        mScoreA = 0;
        mScoreB = 0;
        mGamesWonA = 0;
        mGamesWonB = 0;

        displayForTeamA(mScoreA);
        displayGamesWonForTeamA(mGamesWonA);

        displayForTeamB(mScoreB);
        displayGamesWonForTeamB(mGamesWonB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given games won for Team A.
     */
    public void displayGamesWonForTeamA(int games) {
        TextView scoreView = (TextView) findViewById(R.id.games_wonA_value_textview);
        scoreView.setText(String.valueOf(games));
    }

    /*
     * adds a game if won
     */
    public void wonGameA(View view){
        mGamesWonA = mGamesWonA + 1;
        displayGamesWonForTeamA(mGamesWonA);
    }

    /*
     * adds 1 points
     */
    public void onePointsA(View view){
        mScoreA = mScoreA + 1;
        displayForTeamA(mScoreA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given games won for Team B.
     */
    public void displayGamesWonForTeamB(int games) {
        TextView scoreView = (TextView) findViewById(R.id.games_wonB_value_textview);
        scoreView.setText(String.valueOf(games));
    }

    /*
     * adds a game if won
     */
    public void wonGameB(View view){
        mGamesWonB = mGamesWonB + 1;
        displayGamesWonForTeamB(mGamesWonB);
    }

    /*
     * adds 1 points
     */
    public void onePointsB(View view){
        mScoreB = mScoreB + 1;
        displayForTeamB(mScoreB);
    }


}
