package com.leverxcourse.homework1.TicTacToe.game;

import com.leverxcourse.homework1.TicTacToe.gamethings.GameField;
import com.leverxcourse.homework1.TicTacToe.players.Player;

public class TicTacToeGame {

    private final GameField field;
    private final Player firstPlayer;
    private final Player secondPlayer;

    public TicTacToeGame(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.field = new GameField();
    }

    public void startGame() {
        while (true) {
            System.out.println(field);
            firstPlayer.playRound(field);
            if (field.hasWinner(firstPlayer.getSideSymbol())) {
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
            if (field.hasWinner(secondPlayer.getSideSymbol())) {
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
