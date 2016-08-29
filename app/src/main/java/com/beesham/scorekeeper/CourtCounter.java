package com.beesham.scorekeeper;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Beesham on 27-08-16.
 */
public class CourtCounter {

    private int mScoreA = 0;
    private int mScoreB = 0;
    private static View mView;

    public CourtCounter (View view){
        mView = view;
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

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) mView.findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * adds 3 points
     */
    public void threePointsA(View view){
        mScoreA = mScoreA + 3;
        displayForTeamA(mScoreA);
    }

    /*
     * adds 2 points
     */
    public void twoPointsA(View view){
        mScoreA = mScoreA + 2;
        displayForTeamA(mScoreA);
    }

    /*
     * adds 1 points
     */
    public void onePointsA(View view){
        mScoreA = mScoreA + 1;
        displayForTeamA(mScoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) mView.findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * adds 3 points
     */
    public void threePointsB(View view){
        mScoreB = mScoreB + 3;
        displayForTeamB(mScoreB);
    }

    /*
     * adds 2 points
     */
    public void twoPointsB(View view){
        mScoreB = mScoreB + 2;
        displayForTeamB(mScoreB);
    }

    /*
     * adds 1 points
     */
    public void onePointsB(View view){
        mScoreB = mScoreB + 1;
        displayForTeamB(mScoreB);
    }
}
