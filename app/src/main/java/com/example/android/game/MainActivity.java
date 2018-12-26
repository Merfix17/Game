package com.example.android.game;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Dialog myDialog;

    ImageView paper, rock, scissors, comp_res, user_res;
    TextView wins, loses, text_res;
    Button play_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new Dialog(this);
        myDialog.setContentView(R.layout.result);

        paper = findViewById(R.id.paper);
        rock = findViewById(R.id.rock);
        scissors = findViewById(R.id.scissors);

        comp_res = myDialog.findViewById(R.id.comp_res);
        user_res = myDialog.findViewById(R.id.user_res);
        text_res = myDialog.findViewById(R.id.text_res);


        wins = findViewById(R.id.wins);
        loses = findViewById(R.id.loses);

        play_again = myDialog.findViewById(R.id.play_again);


    }



    int wins_count = 0;
    int loses_count = 0;

    public void paper_case(View v) {

        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        user_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.paper));

        while (n > 0) {
            if (n == 1) {
                comp_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.paper));
                text_res.setText(getResources().getString(R.string.draw));
                break;
            }

            else if (n == 2) {
                comp_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.rock));
                text_res.setText(getResources().getString(R.string.you_win));
                wins_count++;
                wins.setText(Integer.toString(wins_count));
                break;
            }

            else if (n == 3) {
                comp_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.scissors));
                text_res.setText(getResources().getString(R.string.you_lose));
                loses_count++;
                loses.setText(Integer.toString(loses_count));
                break;
            }
        }


        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
    }


    public void rock_case(View v) {

        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        user_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.rock));

        while (n > 0) {
            if (n == 1) {
                comp_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.paper));
                text_res.setText(getResources().getString(R.string.you_lose));
                loses_count++;
                loses.setText(Integer.toString(loses_count));
                break;
            }

            else if (n == 2) {
                comp_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.rock));
                text_res.setText(getResources().getString(R.string.draw));
                break;
            }

            else if (n == 3) {
                comp_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.scissors));
                text_res.setText(getResources().getString(R.string.you_win));
                wins_count++;
                wins.setText(Integer.toString(wins_count));
                break;
            }
        }


        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
    }


    public void scissors_case(View v) {

        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        user_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.scissors));

        while (n > 0) {
            if (n == 1) {
                comp_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.paper));
                text_res.setText(getResources().getString(R.string.you_win));
                wins_count++;
                wins.setText(Integer.toString(wins_count));
                break;
            }

            else if (n == 2) {
                comp_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.rock));
                text_res.setText(getResources().getString(R.string.you_lose));
                loses_count++;
                loses.setText(Integer.toString(loses_count));
                break;
            }

            else if (n == 3) {
                comp_res.setBackgroundDrawable(getResources().getDrawable(R.drawable.scissors));
                text_res.setText(getResources().getString(R.string.draw));
                break;
            }
        }


        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
    }

}
