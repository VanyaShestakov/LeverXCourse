package com.leverxcourse.homework1.TicTacToe.game;

import com.leverxcourse.homework1.TicTacToe.field.GameField;
import com.leverxcourse.homework1.TicTacToe.field.impl.TicTacToeField;
import com.leverxcourse.homework1.TicTacToe.players.Player;

public class TicTacToeGame {

    private final GameField field;
    private final Player firstPlayer;
    private final Player secondPlayer;

    public TicTacToeGame(Player firstPlayer, Player secondPlayer, GameField field) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.field = field;
    }

    public void startGame() {
        while (true) {
            System.out.println(field);
            firstPlayer.playRound(field);
            if (field.isWinner(firstPlayer)) {
                System.out.println(firstPlayer.getName() + " won!");
                System.out.println(field);
                break;
            }
            if (!field.hasEmptyCells()) {
                System.out.println("Friendship won!");
                System.out.println(field);
                break;
            }
            System.out.println(field);
            secondPlayer.playRound(field);
            if (field.isWinner(secondPlayer)) {
                System.out.println(secondPlayer.getName() + " won!");
                System.out.println(field);
                break;
            }
            if (!field.hasEmptyCells()) {
                System.out.println("Friendship won!");
                System.out.println(field);
                break;
            }
        }
    }
}
