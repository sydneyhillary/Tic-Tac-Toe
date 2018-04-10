package com.simax.tictactoe;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ActionBar;
import org.w3c.dom.Text;

/**
 * Created by admin on 3/22/2018.
 */

public class MultiPlayerActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button restart;

    TextView playerX, player0;
    TextView player1score;
    TextView player2score;
    TextView playerturn;


    int turn;

    int score1 = 0;
    int score2 = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi_player_activity);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green)));


        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        restart = (Button) findViewById(R.id.restart);

        turn = 1;

        player1score = (TextView) findViewById(R.id.player1Score);
        player2score = (TextView) findViewById(R.id.player2Score);




        playerX = (TextView) findViewById(R.id.player1tv);
        player0 = (TextView) findViewById(R.id.player2tv);
        playerturn = (TextView) findViewById(R.id.playerturn) ;


        Intent in1 = getIntent();
        String player1 = in1.getExtras().getString("player1");
        playerX.setText(player1);

        Intent in2 = getIntent();
        String player2 = in2.getExtras().getString("player2");
        player0.setText(player2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b1.setEnabled(true);
                b1.setText("");
                b2.setEnabled(true);
                b2.setText("");
                b3.setEnabled(true);
                b3.setText("");
                b4.setEnabled(true);
                b4.setText("");
                b5.setEnabled(true);
                b5.setText("");
                b6.setEnabled(true);
                b6.setText("");
                b7.setEnabled(true);
                b7.setText("");
                b8.setEnabled(true);
                b8.setText("");
                b9.setEnabled(true);
                b9.setText("");


            }
        });
    }

    public void endGame() {



        player1score = (TextView) findViewById(R.id.player1Score);
        player2score = (TextView) findViewById(R.id.player2Score);

        String a, b, c, d, e, f, g, h, i;
        boolean end = false;


        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);

        }if (g.equals("X") && e.equals("X") && c.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }

        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (g.equals("O") && e.equals("O") && c.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);

        }if((a.equals("X") || (a.equals("O"))) && (b.equals("X") || (b.equals("O"))) && (c.equals("X") || (c.equals("O"))) && (d.equals("X") || (d.equals("O")))
                && (e.equals("X") || (e.equals("O"))) && (f.equals("X") || (f.equals("O"))) && (g.equals("X") || (g.equals("O"))) && (h.equals("X") || (h.equals("O")))
                && (i.equals("X") || (i.equals("O")))) {

            Toast.makeText(this,
                    "Its a draw players, restart game", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }



    }
    private void display1(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.player1Score);
        displayInteger.setText("" + number);
    }
    private void display2(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.player2Score);
        displayInteger.setText("" + number);
    }

}