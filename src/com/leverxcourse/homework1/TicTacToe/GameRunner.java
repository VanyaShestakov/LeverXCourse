package com.leverxcourse.homework1.TicTacToe;

import java.util.Scanner;

public class GameRunner {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    private void playWithFriend() {
        int x;
        int y;
        while (true) {
            GameField field = new GameField();

            System.out.println("GAME FIELD\n" + field);

            System.out.println("CROSS MOVE");
            System.out.println("Enter x:");
            x = scanner.nextInt();
            System.out.println("Enter y:");
            y = scanner.nextInt();
            field.addCross(x, y);

            System.out.println("GAME FIELD\n" + field);

            if (field.hasWinner('X')) {
                System.out.println("X is WIN!");
            }

            System.out.println("ZERO MOVE");
            System.out.println("Enter x:");
            x = scanner.nextInt();
            System.out.println("Enter y:");
            y = scanner.nextInt();
            field.addZero(x, y);

            System.out.println("GAME FIELD\n" + field);

            if (field.hasWinner('0')) {
                System.out.println("0 is WIN!");
            }

        }

    }
}
