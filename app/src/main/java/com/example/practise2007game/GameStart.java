package com.example.practise2007game;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameStart extends AppCompatActivity {

    Random random = new Random();


    int[] array1 = {0, 0, 0};
    int[] array2 = {0, 0, 0};
    int[] array3 = {0, 0, 0};


    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton9;

    TextView txtScore, txtResult;

    Map<Integer, ImageButton> hashmap = new HashMap<>();

    int scoreBot;
    int scorePlayer;

    ArrayList<Integer> numbers = new ArrayList(9);
    int number;
    boolean endGame;
    boolean playerWin;
    String result;


    ArrayList<ImageButton> arrayListButtons = new ArrayList<>(9);
    void init(){

        scoreBot = 0;
        scorePlayer = 0;
        endGame = false;
        playerWin = false;

        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }
        imageButton1 = findViewById(R.id.imgBtn1);
        imageButton2 = findViewById(R.id.imgBtn2);
        imageButton3 = findViewById(R.id.imgBtn3);
        imageButton4 = findViewById(R.id.imgBtn4);
        imageButton5 = findViewById(R.id.imgBtn5);
        imageButton6 = findViewById(R.id.imgBtn6);
        imageButton7 = findViewById(R.id.imgBtn7);
        imageButton8 = findViewById(R.id.imgBtn8);
        imageButton9 = findViewById(R.id.imgBtn9);
        txtResult = findViewById(R.id.txtResult);
        txtScore = findViewById(R.id.txtScore);


        hashmap.put(1, imageButton1);
        hashmap.put(2, imageButton2);
        hashmap.put(3, imageButton3);
        hashmap.put(4, imageButton4);
        hashmap.put(5, imageButton5);
        hashmap.put(6, imageButton6);
        hashmap.put(7, imageButton7);
        hashmap.put(8, imageButton8);
        hashmap.put(9, imageButton9);

        arrayListButtons.add(imageButton1);
        arrayListButtons.add(imageButton2);
        arrayListButtons.add(imageButton3);
        arrayListButtons.add(imageButton4);
        arrayListButtons.add(imageButton5);
        arrayListButtons.add(imageButton6);
        arrayListButtons.add(imageButton7);
        arrayListButtons.add(imageButton8);
        arrayListButtons.add(imageButton9);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);
        init();

        txtResult.setText( "You: " + scorePlayer + " Opponent: " + scoreBot);





        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton1.setImageResource(R.drawable.cross);
                imageButton1.setClickable(false);
                hashmap.remove(1);
                numbers.remove(numbers.indexOf(1));
                array1[0] = 1;
                checkGameOver(array1, array2, array3);
                if (!endGame) {
                    machineTurn(hashmap);
                }
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton2.setImageResource(R.drawable.cross);
                imageButton2.setClickable(false);
                hashmap.remove(2);
                numbers.remove(numbers.indexOf(2));
                array1[1] = 1;
                checkGameOver(array1, array2, array3);
                if (!endGame) {
                    machineTurn(hashmap);
                }
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton3.setImageResource(R.drawable.cross);
                imageButton3.setClickable(false);
                hashmap.remove(3);
                numbers.remove(numbers.indexOf(3));
                array1[2] = 1;
                checkGameOver(array1, array2, array3);
                if (!endGame) {
                    machineTurn(hashmap);
                }
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton4.setImageResource(R.drawable.cross);
                imageButton4.setClickable(false);
                hashmap.remove(4);
                numbers.remove(numbers.indexOf(4));
                array2[0] = 1;
                checkGameOver(array1, array2, array3);
                if (!endGame) {
                    machineTurn(hashmap);
                }
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton5.setImageResource(R.drawable.cross);
                imageButton5.setClickable(false);
                hashmap.remove(5);
                numbers.remove(numbers.indexOf(5));
                array2[1] = 1;
                checkGameOver(array1, array2, array3);
                if (!endGame) {
                    machineTurn(hashmap);
                }
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton6.setImageResource(R.drawable.cross);
                imageButton6.setClickable(false);
                hashmap.remove(6);
                numbers.remove(numbers.indexOf(6));
                array2[2] = 1;
                checkGameOver(array1, array2, array3);
                if (endGame == false) {
                    machineTurn(hashmap);
                }
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton7.setImageResource(R.drawable.cross);
                imageButton7.setClickable(false);
                hashmap.remove(7);
                numbers.remove(numbers.indexOf(7));
                array3[0] = 1;
                checkGameOver(array1, array2, array3);
                if (!endGame) {
                    machineTurn(hashmap);
                }
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton8.setImageResource(R.drawable.cross);
                imageButton8.setClickable(false);
                hashmap.remove(8);
                numbers.remove(numbers.indexOf(8));
                array3[1] = 1;
                checkGameOver(array1, array2, array3);
                if (!endGame) {
                    machineTurn(hashmap);
                }
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton9.setImageResource(R.drawable.cross);
                imageButton9.setClickable(false);
                hashmap.remove(9);
                numbers.remove(numbers.indexOf(9));
                array3[2] = 1;
                checkGameOver(array1, array2, array3);
                if (!endGame) {
                    machineTurn(hashmap);
                }
            }
        });

    }

    public void checkGameOver(int[] array1, int[] array2, int[] array3) {
        AlertDialog.Builder builderWin = new AlertDialog.Builder(GameStart.this);
        AlertDialog.Builder builderLose = new AlertDialog.Builder(GameStart.this);
        AlertDialog.Builder builderDraw = new AlertDialog.Builder(GameStart.this);
        AlertDialog alertDialog;


        builderWin.setMessage("Congratulations! You Win!" + " \n" +
                "Wanna try again?")
                .setCancelable(false)
                .setPositiveButton("Try again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        restartGame();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                System.exit(0);
            }
        });
        builderLose.setMessage("Game over! You Lose!" + " \n" +
                "Wanna try again?")
                .setCancelable(false)
                .setPositiveButton("Try again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        restartGame();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                System.exit(0);
            }
        });


        builderDraw .setMessage("Draw!" + " \n" +
                "Wanna try again?")
                .setCancelable(false)
                .setPositiveButton("Try again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        restartGame();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                System.exit(0);
            }
        });

        if (array1[0] == 1 && array1[1] == 1 && array1[2] == 1 ||
                array2[0] == 1 && array2[1] == 1 && array2[2] == 1 ||
                array3[0] == 1 && array3[1] == 1 && array3[2] == 1 ||
                array1[0] == 1 && array2[1] == 1 && array3[2] == 1 ||
                array1[2] == 1 && array2[1] == 1 && array3[0] == 1 ||
                array1[0] == 1 && array2[0] == 1 && array3[0] == 1 ||
                array1[1] == 1 && array2[1] == 1 && array3[1] == 1 ||
                array1[2] == 1 && array2[2] == 1 && array3[2] == 1) {

            result = "Win";
            endGame = true;
            scorePlayer++;
            playerWin = true;
            alertDialog = builderWin.create();
            alertDialog.show();


        }

        if (array1[0] == 2 && array1[1] == 2 && array1[2] == 2 ||
                array2[0] == 2 && array2[1] == 2 && array2[2] == 2 ||
                array3[0] == 2 && array3[1] == 2 && array3[2] == 2 ||
                array1[0] == 2 && array2[1] == 2 && array3[2] == 2 ||
                array1[2] == 2 && array2[1] == 2 && array3[0] == 2 ||
                array1[0] == 2 && array2[0] == 2 && array3[0] == 2 ||
                array1[1] == 2 && array2[1] == 2 && array3[1] == 2 ||
                array1[2] == 2 && array2[2] == 2 && array3[2] == 2) {
            scoreBot++;
            result = "Lose";
            alertDialog = builderLose.create();
            alertDialog.show();
        }

        if (numbers.size() == 0) {
             alertDialog = builderDraw.create();
            alertDialog.show();

        }


    }

    public void restartGame() {
        imageButton1.setImageResource(R.drawable.ic_launcher_background);
        imageButton2.setImageResource(R.drawable.ic_launcher_background);
        imageButton3.setImageResource(R.drawable.ic_launcher_background);
        imageButton4.setImageResource(R.drawable.ic_launcher_background);
        imageButton5.setImageResource(R.drawable.ic_launcher_background);
        imageButton6.setImageResource(R.drawable.ic_launcher_background);
        imageButton7.setImageResource(R.drawable.ic_launcher_background);
        imageButton8.setImageResource(R.drawable.ic_launcher_background);
        imageButton9.setImageResource(R.drawable.ic_launcher_background);


        imageButton1.setClickable(true);
        imageButton2.setClickable(true);
        imageButton3.setClickable(true);
        imageButton4.setClickable(true);
        imageButton5.setClickable(true);
        imageButton6.setClickable(true);
        imageButton7.setClickable(true);
        imageButton8.setClickable(true);
        imageButton9.setClickable(true);

        array1 = new int[]{0, 0, 0};
        array2 = new int[]{0, 0, 0};
        array3 = new int[]{0, 0, 0};


        numbers.clear();

        hashmap.clear();

        hashmap.put(1, imageButton1);
        hashmap.put(2, imageButton2);
        hashmap.put(3, imageButton3);
        hashmap.put(4, imageButton4);
        hashmap.put(5, imageButton5);
        hashmap.put(6, imageButton6);
        hashmap.put(7, imageButton7);
        hashmap.put(8, imageButton8);
        hashmap.put(9, imageButton9);

        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }

        txtResult.setText( "You: " + scorePlayer + " Opponent: " + scoreBot);

        endGame = false;
    }

    public Integer checkMachineTurnForWin(int[] array1, int[] array2, int[] array3) {
        if ((array1[1] == 2 && array1[2] == 2 && numbers.contains(1) || array2[0] == 2 && array3[0] == 2 && numbers.contains(1) || array2[1] == 2 && array3[2] == 2 && numbers.contains(1))) {
            number = 1;
        } else if ((array1[0] == 2 && array1[2] == 2 && numbers.contains(2) || array2[1] == 2 && array3[1] == 2 && numbers.contains(2))) {
            number = 2;
        } else if ((array1[0] == 2 && array1[1] == 2 && numbers.contains(3) || array2[1] == 2 && array3[0] == 2 && numbers.contains(3) || array2[2] == 2 && array3[2] == 2 && numbers.contains(3))) {
            number = 3;
        } else if ((array2[1] == 2 && array2[2] == 2 && numbers.contains(4) || array1[0] == 2 && array3[0] == 2 && numbers.contains(4))) {
            number = 4;
        } else if ((array2[0] == 2 && array2[2] == 2 && numbers.contains(5) || array1[2] == 2 && array3[0] == 2 && numbers.contains(5) || array1[1] == 2 && array3[1] == 2 && numbers.contains(5) || array1[0] == 2 && array3[2] == 2 && numbers.contains(5))) {
            number = 5;
        } else if ((array2[0] == 2 && array2[1] == 2 && numbers.contains(6) || array1[2] == 2 && array3[2] == 2 && numbers.contains(6))) {
            number = 6;
        } else if ((array3[1] == 2 && array3[2] == 2 && numbers.contains(7) || array1[0] == 2 && array2[0] == 2 && numbers.contains(7) || array1[2] == 2 && array2[1] == 1 && numbers.contains(7))) {
            number = 7;
        } else if ((array3[0] == 2 && array3[2] == 2 && numbers.contains(8) || array1[1] == 2 && array2[1] == 2 && numbers.contains(8))) {
            number = 8;
        } else if ((array3[0] == 2 && array3[1] == 2 && numbers.contains(9) || array1[0] == 2 && array2[1] == 2 && numbers.contains(9) || array1[2] == 2 && array2[2] == 2 && numbers.contains(9))) {
            number = 9;
        }

        //no way to win and if opponent already has 2 elements

        else if ((array1[1] == 1 && array1[2] == 1 && numbers.contains(1) || array2[0] == 1 && array3[0] == 1 && numbers.contains(1) || array2[1] == 1 && array3[2] == 1 && numbers.contains(1))) {
            number = 1;
        } else if ((array1[0] == 1 && array1[2] == 1 && numbers.contains(2) || array2[1] == 1 && array3[1] == 1 && numbers.contains(2))) {
            number = 2;
        } else if ((array1[0] == 1 && array1[1] == 1 && numbers.contains(3) || array2[1] == 1 && array3[0] == 1 && numbers.contains(3) || array2[2] == 1 && array3[2] == 1 && numbers.contains(3))) {
            number = 3;
        } else if ((array2[1] == 1 && array2[2] == 1 && numbers.contains(4) || array1[0] == 1 && array3[0] == 1 && numbers.contains(4))) {
            number = 4;
        } else if ((array2[0] == 1 && array2[2] == 1 && numbers.contains(5) || array1[2] == 1 && array3[0] == 1 && numbers.contains(5) || array1[1] == 1 && array3[1] == 1 && numbers.contains(5) || array1[0] == 1 && array3[2] == 1 && numbers.contains(5))) {
            number = 5;
        } else if ((array2[0] == 1 && array2[1] == 1 && numbers.contains(6) || array1[2] == 1 && array3[2] == 1 && numbers.contains(6))) {
            number = 6;
        } else if ((array3[1] == 1 && array3[2] == 1 && numbers.contains(7) || array1[0] == 1 && array2[0] == 1 && numbers.contains(7) || array1[2] == 1 && array2[1] == 1 && numbers.contains(7))) {
            number = 7;
        } else if ((array3[0] == 1 && array3[2] == 1 && numbers.contains(8) || array1[1] == 1 && array2[1] == 1 && numbers.contains(8))) {
            number = 8;
        } else if ((array3[0] == 1 && array1[1] == 1 && numbers.contains(9) || array1[0] == 1 && array2[1] == 1 && numbers.contains(9) || array1[2] == 1 && array2[2] == 1 && numbers.contains(9))) {
            number = 9;
        } else {
            number = numbers.get(random.nextInt(numbers.size() - 1));
        }
        return number;
    }

    public void machineTurn(Map<Integer, ImageButton> hashmap) {
        if (hashmap.size() > 0) {
            number = checkMachineTurnForWin(array1, array2, array3);
            ImageButton imageButton;
            numbers.remove(numbers.indexOf(number));
            imageButton = hashmap.get(number);
            imageButton.setImageResource(R.drawable.zero);
            hashmap.remove(number);
            imageButton.setClickable(false);
            switch (number) {
                case 1:
                    array1[0] = 2;
                    break;
                case 2:
                    array1[1] = 2;
                    break;
                case 3:
                    array1[2] = 2;
                    break;
                case 4:
                    array2[0] = 2;
                    break;
                case 5:
                    array2[1] = 2;
                    break;
                case 6:
                    array2[2] = 2;
                    break;
                case 7:
                    array3[0] = 2;
                    break;
                case 8:
                    array3[1] = 2;
                    break;
                case 9:
                    array3[2] = 2;
                    break;

            }
            checkGameOver(array1, array2, array3);

        }
    }
}
