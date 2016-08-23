package com.example.scb.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusthree (View view)
    {
        scoreTeamA= scoreTeamA +3;
        displayscore(scoreTeamA);

    }

    public void plustwo (View view)
    {
        scoreTeamA= scoreTeamA +2;
        displayscore(scoreTeamA);

    }

    public void plusone (View view)
    {
        scoreTeamA= scoreTeamA +1;
        displayscore(scoreTeamA);

    }
    public void plusthreeB (View view)
    {
        scoreTeamB= scoreTeamB +3;
        displayscoreB(scoreTeamB);

    }

    public void plustwoB (View view)
    {
        scoreTeamB= scoreTeamB +2;
        displayscoreB(scoreTeamB);

    }

    public void plusoneB (View view)
    {
        scoreTeamB= scoreTeamB +1;
        displayscoreB(scoreTeamB);

    }



    public void displayscore (int s)
    {
        TextView view= (TextView) findViewById(R.id.score_team_a);
        view.setText(String.valueOf(s));

    }



    public void displayscoreB (int s)
    {
        TextView view= (TextView) findViewById(R.id.score_team_b);
        view.setText(String.valueOf(s));

    }


    public void resetoption(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayscoreB(scoreTeamB);
        displayscore(scoreTeamA);
    }


}
