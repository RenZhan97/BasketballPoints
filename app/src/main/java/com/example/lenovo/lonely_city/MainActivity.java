package com.example.lenovo.lonely_city;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int score_a = 0 ;
    int score_b = 0 ;

    public void displayForTeamA(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThereForTeamA(View v){
        score_a+=3;
        displayForTeamA(score_a);
    }

    public void addTwoForTeamA(View v){
        score_a+=2;
        displayForTeamA(score_a);
    }

    public void addOneForTeamA(View v){
        score_a+=1;
        displayForTeamA(score_a);
    }

    public void addThereForTeamB(View v){
        score_b+=3;
        displayForTeamB(score_b);
    }

    public void addTwoForTeamB(View v){
        score_b+=2;
        displayForTeamB(score_b);
    }

    public void addOneForTeamB(View v){
        score_b+=1;
        displayForTeamB(score_b);
    }

    public void resetScore(View v){
        score_a=0;
        score_b=0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }
}
