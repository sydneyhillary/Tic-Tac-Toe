package com.simax.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by admin on 3/22/2018.
 */

public class NavigationActivity extends AppCompatActivity {

    Button btnMulP;
    Button btnSing;
    EditText ex1, ex2, singleEx;
    RadioButton sn3, sn5, mp3, mp5, x, o;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate);


        btnSing = (Button) findViewById(R.id.singlePlayer);
        btnMulP = (Button) findViewById(R.id.bTwoP);
        ex1 = (EditText) findViewById(R.id.player1ex);
        ex2 = (EditText) findViewById(R.id.player2ex);
        singleEx = (EditText) findViewById(R.id.singEx);
        sn3 = (RadioButton) findViewById(R.id.sn3);
        sn5 = (RadioButton) findViewById(R.id.sn5);
        mp3 = (RadioButton) findViewById(R.id.mp3);
        mp5 = (RadioButton) findViewById(R.id.mp5);
        x = (RadioButton) findViewById(R.id.X);
        o = (RadioButton) findViewById(R.id.O);





        btnMulP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean multi3;

                multi3 = mp3.isChecked();
                if (multi3){
                    Intent intent = new Intent(NavigationActivity.this, MultiPlayerActivity.class);
                    intent.putExtra("player1", ex1.getText().toString());
                    intent.putExtra("player2", ex2.getText().toString());
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(NavigationActivity.this, Multi_by_5_Activity.class);
                    intent.putExtra("player1", ex1.getText().toString());
                    intent.putExtra("player2", ex2.getText().toString());
                    startActivity(intent);
                }

            }
        });

        btnSing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean single3;
                Boolean single5;
                Boolean setX;
                setX = x.isChecked();
                single3 = sn3.isChecked();
                single5 = sn5.isChecked();
                if (single3){
                    if (setX){
                        Intent intent = new Intent(NavigationActivity.this, SinglePlayerActivity.class);
                        intent.putExtra("singleP", singleEx.getText().toString());
                        startActivity(intent);

                    }else {
                        Intent intent = new Intent(NavigationActivity.this, SinglePlayerO.class);
                        intent.putExtra("singleP", singleEx.getText().toString());
                        startActivity(intent);
                    }

                }else if(single5){
                    if (setX){
                        Intent intent = new Intent(NavigationActivity.this, Single_by_5Activity.class);
                        intent.putExtra("singleP", singleEx.getText().toString());
                        startActivity(intent);
                    }else{
                        Intent intent = new Intent(NavigationActivity.this, SinglePlayer_by5_O.class);
                        intent.putExtra("singleP", singleEx.getText().toString());
                        startActivity(intent);
                    }

                }

            }
        });
    }
}
