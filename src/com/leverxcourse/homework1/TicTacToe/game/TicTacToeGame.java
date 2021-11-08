package com.leverxcourse.homework1.TicTacToe.game;

import com.leverxcourse.homework1.TicTacToe.field.GameField;
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
        boolean isEnd = false;
        while (true) {
            System.out.println(field);
            isEnd = playRound(firstPlayer);
            if (isEnd) {
                break;
            }
            System.out.println(field);
            isEnd = playRound(secondPlayer);
            if (isEnd) {
                break;
            }
        }
    }

    private boolean playRound(Player player) {
        player.playRound(field);
        if (field.hasWinner(player)) {
            System.out.println(player.getName() + " won!");
            System.out.println(field);
            return true;
        }
        if (!field.hasEmptyCells()) {
            System.out.println("Friendship won!");
            System.out.println(field);
            return true;
        }
        return false;
    }
}
