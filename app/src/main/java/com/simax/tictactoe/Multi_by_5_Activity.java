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

public class Multi_by_5_Activity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;
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
        setContentView(R.layout.multiplayer_5_activity);

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
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);
        b18 = (Button) findViewById(R.id.b18);
        b19 = (Button) findViewById(R.id.b19);
        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);
        b24 = (Button) findViewById(R.id.b24);
        b25 = (Button) findViewById(R.id.b25);

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
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b10.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b10.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b10.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b11.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b11.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b11.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b12.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b12.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b12.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b13.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b13.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b13.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b14.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b14.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b14.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b15.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b15.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b15.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b16.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b16.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b16.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b17.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b17.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b17.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b18.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b18.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b18.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b19.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b19.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b19.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b20.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b20.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b20.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b21.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b21.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b21.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b22.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b22.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b22.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");

                    }
                }
                endGame();

            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b23.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b23.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b23.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b24.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b24.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b24.setText("O");
                        playerturn.setText(playerX.getText().toString() + "'s turn");
                    }
                }
                endGame();

            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b25.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b25.setText("X");
                        playerturn.setText(player0.getText().toString() + "'s turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b25.setText("O");
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
                b10.setEnabled(true);
                b10.setText("");
                b11.setEnabled(true);
                b11.setText("");
                b12.setEnabled(true);
                b12.setText("");
                b13.setEnabled(true);
                b13.setText("");
                b14.setEnabled(true);
                b14.setText("");
                b15.setEnabled(true);
                b15.setText("");
                b16.setEnabled(true);
                b16.setText("");
                b17.setEnabled(true);
                b17.setText("");
                b18.setEnabled(true);
                b18.setText("");
                b19.setEnabled(true);
                b19.setText("");
                b20.setEnabled(true);
                b20.setText("");
                b21.setEnabled(true);
                b21.setText("");
                b22.setEnabled(true);
                b22.setText("");
                b23.setEnabled(true);
                b23.setText("");
                b24.setEnabled(true);
                b24.setText("");
                b25.setEnabled(true);
                b25.setText("");
            }
        });
    }

    public void endGame() {



        player1score = (TextView) findViewById(R.id.player1Score);
        player2score = (TextView) findViewById(R.id.player2Score);

        String a, b, c, d, e, f, g, h, i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
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
        j = b10.getText().toString();

        k = b11.getText().toString();
        l = b12.getText().toString();
        m = b13.getText().toString();
        n = b14.getText().toString();
        o = b15.getText().toString();

        p = b16.getText().toString();
        q = b17.getText().toString();
        r = b18.getText().toString();
        s = b19.getText().toString();
        t = b20.getText().toString();

        u = b21.getText().toString();
        v = b22.getText().toString();
        w = b23.getText().toString();
        x = b24.getText().toString();
        y = b25.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X") && d.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (b.equals("X") && c.equals("X") && d.equals("X") && e.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }

        if (f.equals("X") && g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (g.equals("X") && h.equals("X") && i.equals("X") && j.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);

        }
        if (k.equals("X") && l.equals("X") && m.equals("X") && n.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (l.equals("X") && m.equals("X") && n.equals("X") && o.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }

        if (p.equals("X") && q.equals("X") && r.equals("X") && s.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (q.equals("X") && r.equals("X") && s.equals("X") && t.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (u.equals("X") && v.equals("X") && w.equals("X") && x.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (v.equals("X") && w.equals("X") && x.equals("X") && y.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }

        if (a.equals("X") && f.equals("X") && k.equals("X") && p.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (f.equals("X") && k.equals("X") && p.equals("X") && u.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (b.equals("X") && g.equals("X") && l.equals("X") && q.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (g.equals("X") && l.equals("X") && q.equals("X") && v.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);

        }
        if (c.equals("X") && h.equals("X") && m.equals("X") && r.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (h.equals("X") && m.equals("X") && r.equals("X") && w.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (d.equals("X") && i.equals("X") && n.equals("X") && s.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (i.equals("X") && n.equals("X") && s.equals("X") && x.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }

        if (e.equals("X") && j.equals("X") && o.equals("X") && t.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (j.equals("X") && o.equals("X") && t.equals("X") && y.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }

        if (f.equals("X") && l.equals("X") && r.equals("X") && x.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }

        if (a.equals("X") && g.equals("X") && m.equals("X") && s.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (g.equals("X") && m.equals("X") && s.equals("X") && y.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (b.equals("X") && h.equals("X") && n.equals("X") && t.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (p.equals("X") && l.equals("X") && h.equals("X") && d.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (u.equals("X") && q.equals("X") && m.equals("X") && i.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (q.equals("X") && m.equals("X") && i.equals("X") && e.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }
        if (v.equals("X") && r.equals("X") && n.equals("X") && j.equals("X")) {
            Toast.makeText(this, playerX.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score1 = score1 + 1;
            display1(score1);
        }

        //check if playerO wins

        if (a.equals("O") && b.equals("O") && c.equals("O") && d.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (b.equals("O") && c.equals("O") && d.equals("O") && e.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }

        if (f.equals("O") && g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (g.equals("O") && h.equals("O") && i.equals("O") && j.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);

        }
        if (k.equals("O") && l.equals("O") && m.equals("O") && n.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (l.equals("O") && m.equals("O") && n.equals("O") && o.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }

        if (p.equals("O") && q.equals("O") && r.equals("O") && s.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (q.equals("O") && r.equals("O") && s.equals("O") && t.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (u.equals("O") && v.equals("O") && w.equals("O") && x.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (v.equals("O") && w.equals("O") && x.equals("O") && y.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }

        if (a.equals("O") && f.equals("O") && k.equals("O") && p.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (f.equals("O") && k.equals("O") && p.equals("O") && u.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (b.equals("O") && g.equals("O") && l.equals("O") && q.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (g.equals("O") && l.equals("O") && q.equals("O") && v.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);

        }
        if (c.equals("O") && h.equals("O") && m.equals("O") && r.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (h.equals("O") && m.equals("O") && r.equals("O") && w.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (d.equals("O") && i.equals("O") && n.equals("O") && s.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (i.equals("O") && n.equals("O") && s.equals("O") && x.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }

        if (e.equals("O") && j.equals("O") && o.equals("O") && t.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (j.equals("O") && o.equals("O") && t.equals("O") && y.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }

        if (f.equals("O") && l.equals("O") && r.equals("O") && x.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }

        if (a.equals("O") && g.equals("O") && m.equals("O") && s.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (g.equals("O") && m.equals("O") && s.equals("O") && y.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (b.equals("O") && h.equals("O") && n.equals("O") && t.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (p.equals("O") && l.equals("O") && h.equals("O") && d.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (u.equals("O") && q.equals("O") && m.equals("O") && i.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (q.equals("O") && m.equals("O") && i.equals("O") && e.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if (v.equals("O") && r.equals("O") && n.equals("O") && j.equals("O")) {
            Toast.makeText(this, player0.getText().toString() + " is the Winner", Toast.LENGTH_LONG).show();
            end = true;
            score2 = score2 + 1;
            display2(score2);
        }
        if ((a.equals("X") || (a.equals("O"))) && (b.equals("X") || (b.equals("O"))) && (c.equals("X") || (c.equals("O"))) && (d.equals("X") || (d.equals("O")))
                && (e.equals("X") || (e.equals("O"))) && (f.equals("X") || (f.equals("O"))) && (g.equals("X") || (g.equals("O"))) && (h.equals("X") || (h.equals("O")))
                && (i.equals("X") || (i.equals("O"))) && (j.equals("X") || (j.equals("O"))) && (k.equals("X") || (k.equals("O"))) && (l.equals("X") || (l.equals("O"))) && (d.equals("X") || (d.equals("O")))
                && (e.equals("X") || (e.equals("O"))) && (f.equals("X") || (f.equals("O"))) && (g.equals("X") || (g.equals("O"))) && (h.equals("X") || (h.equals("O")))
                && (m.equals("X") || (m.equals("O"))) && (n.equals("X") || (n.equals("O"))) && (o.equals("X") || (o.equals("O"))) && (p.equals("X") || (p.equals("O"))) && (d.equals("X") || (d.equals("O")))
                && (q.equals("X") || (q.equals("O"))) && (q.equals("X") || (q.equals("O"))) && (s.equals("X") || (s.equals("O"))) && (t.equals("X") || (t.equals("O")))
                && (u.equals("X") || (u.equals("O")))  && (v.equals("X") || (v.equals("O"))) && (w.equals("X") || (w.equals("O"))) && (x.equals("X") || (x.equals("O"))) && (t.equals("X") || (t.equals("O")))
                && (y.equals("X") || (y.equals("O")))) {

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
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);
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