package com.leverxcourse.homework1.TicTacToe;

import com.leverxcourse.homework1.TicTacToe.field.GameField;
import com.leverxcourse.homework1.TicTacToe.field.impl.TicTacToeField;
import com.leverxcourse.homework1.TicTacToe.game.TicTacToeGame;
import com.leverxcourse.homework1.TicTacToe.players.impl.ComputerPlayer;
import com.leverxcourse.homework1.TicTacToe.players.Player;
import com.leverxcourse.homework1.TicTacToe.players.impl.RealPlayer;
import com.leverxcourse.homework1.TicTacToe.gamethings.Side;

import java.util.Scanner;

public class GameRunner {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("TIC TAC TOE GAME");
        int choice = chooseGameMode();
        Player firstPlayer;
        Player secondPlayer;
        boolean isSameSides;
        if (choice == 1) {
            do {
                System.out.println("Enter info of first player:");
                firstPlayer = configurePlayer();
                System.out.println("Enter info of second player:");
                secondPlayer = configurePlayer();
                isSameSides = firstPlayer.getSide() == secondPlayer.getSide();
                if (isSameSides) {
                    System.out.println("Choose different sides!");
                }
            } while (isSameSides);
        } else {
            firstPlayer = configurePlayer();
            Side computerSide = firstPlayer.getSide() == Side.ZERO ? Side.CROSS : Side.ZERO;
            secondPlayer = new ComputerPlayer(computerSide, "Computer");
        }
        GameField field = new TicTacToeField();
        TicTacToeGame game = new TicTacToeGame(firstPlayer, secondPlayer, field);
        game.startGame();
    }

    private static int chooseGameMode() {
        System.out.println("""
                Choose the game mode:
                1. Friends mode
                2. Computer mode
                """);
        return inputNum();
    }

    private static Side chooseSide() {
        System.out.println("""
                Choose the side for player:
                1. CROSS (X)
                2. ZERO (0)
                """);
        int choice = inputNum();
        return choice == 1 ? Side.CROSS : Side.ZERO;
    }

    private static Player configurePlayer() {
        System.out.println("Enter the player name:");
        String name = inputName();
        Side side = chooseSide();
        return new RealPlayer(side, name);
    }

    private static String inputName() {
        boolean isIncorrect;
        String name;
        do {
            isIncorrect = false;
            name = sc.nextLine();
            if (name.matches("^\\s*$")) {
                System.out.println("Enter the name!");
                isIncorrect = true;
            }
        } while (isIncorrect);
        return name;
    }

    private static int inputNum() {
        boolean isIncorrect;
        int num = 0;
        do {
            isIncorrect = false;
            String line = sc.nextLine();
            if (line.matches("^1$|^2$")) {
                num = Integer.parseInt(line);
            } else {
                System.out.println("Enter 1 or 2!");
                isIncorrect = true;
            }
        } while (isIncorrect);
        return num;
    }






}
