package com.example.mihail.choosenumber;

public class Game {

    private float num1 = 0;
    private float num2 = 0;
    private float num3 = 0;
    private int random = 0;
    private int a = 1;
    private int b = 2;
    private int c = 3;

    private Player pl1 = new Player();
    private Player pl2 = new Player();
    private Player pl3 = new Player();

    void setNumber(float a, float b, float c) {
        num1 = a;
        num2 = b;
        num3 = c;
    }

    void startGame() {
        pl1.setNumber((int)num1);
        pl2.setNumber((int)num2);
        pl3.setNumber((int)num3);

        num1 = pl1.getNumber();
        num2 = pl2.getNumber();
        num3 = pl3.getNumber();
    }

    void RandomNumber() {
        random = (int) (Math.random() * 10);
    }

    Integer GetResult() {

        if (num1 == random) {
            return a;
        }

        if (num2 == random) {
            return b;
        }

        if (num3 == random) {
            return c;
        }
        return 0;
    }
}
