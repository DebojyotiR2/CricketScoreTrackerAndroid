package com.example.android.cricketscorecounter;

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

    int runs = 0;
    int balls = 0;
    int wickets = 0;
    int oversA = 0;
    int oversB = 0;


    String history0 = "X";
    String history1 = "X";
    String history2 = "X";
    String history3 = "X";
    String history4 = "X";
    String history5 = "X";
    String history6 = "X";
    String last_played = "X";



    public void single(View view) {
        runs = runs + 1;
        balls = balls + 1;
        last_played = "1";
        display();

    }

    public void four(View view){
        runs = runs + 4;
        balls = balls + 1;
        last_played = "4";
        display();
    }

    public void six(View view) {
        runs = runs + 6;
        balls = balls + 1;
        last_played = "6";
        display();
    }

    public void noBall(View view){
        runs = runs + 1;
        last_played = "NB";
        display();

    }

    public void wideBall(View view){
        runs = runs + 1;
        last_played = "WD";
        display();
    }

    public void dotBall(View view){
        balls = balls + 1;
        last_played = "0";
        display();
    }

    public void reset(View view){
        runs = 0;
        balls = 0;
        wickets = 0;
        oversA = 0;
        oversB = 0;
        history1 = "X";
        history2 = "X";
        history3 = "X";
        history4 = "X";
        history5 = "X";
        history6 = "X";
        last_played = "X";

        display();
    }

    public void wicket(View view){
        wickets = wickets + 1;
        balls = balls + 1;
        last_played = "WT";
        display();
    }

    public void display() {
        TextView runTextView = (TextView) findViewById(R.id.runs);
        runTextView.setText("" + runs + "/" + wickets);

        oversA = balls / 6;
        oversB = balls % 6;
        TextView oversTextView = (TextView) findViewById(R.id.overs);
        oversTextView.setText("" + oversA + "." + oversB);

        history0 = history1;
        history1 = history2;
        history2 = history3;
        history3 = history4;
        history4 = history5;
        history5 = history6;
        history6 = last_played;
        String history = history1 + "  |  " + history2 + "  |  " + history3 + "  |  " + history4 + "  |  " + history5 + "  |  " +  history6;
        TextView historyTextView = (TextView) findViewById(R.id.history);
        historyTextView.setText("" + history);
    }

}