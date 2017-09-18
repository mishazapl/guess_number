package com.example.mihail.choosenumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Game Game = new Game();

    EditText player1, player2, player3;

    Button startGame;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = (EditText) findViewById(R.id.player1);
        player2 = (EditText) findViewById(R.id.player2);
        player3 = (EditText) findViewById(R.id.player3);

        textView = (TextView) findViewById(R.id.textView);

        startGame.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float result = 0;

        if (TextUtils.isEmpty(player1.getText().toString())
                || TextUtils.isEmpty(player2.getText().toString())
                || TextUtils.isEmpty(player3.getText().toString())) {
            textView.setText("Каждый игрок должен выбрать число!");
            return;
        }

        num1 = Integer.parseInt(player1.getText().toString());
        num2 = Integer.parseInt(player2.getText().toString());
        num3 = Integer.parseInt(player3.getText().toString());

        Game.setNumber(num1, num2, num3);
        Game.startGame();
        Game.RandomNumber();
        result = (int) Game.GetResult();
        textView.setText("Первый отгадавший число: " + result);
    }
}
