package com.leverxcourse.homework1.TicTacToe;

import com.leverxcourse.homework1.TicTacToe.game.TicTacToeGame;
import com.leverxcourse.homework1.TicTacToe.players.ComputerPlayer;
import com.leverxcourse.homework1.TicTacToe.players.Player;
import com.leverxcourse.homework1.TicTacToe.players.RealPlayer;
import com.leverxcourse.homework1.TicTacToe.gamethings.Side;

public class GameRunner {
    public static void main(String[] args) {
        Player firstPlayer = new RealPlayer(Side.CROSS, "Ivan");
        Player secondPlayer = new RealPlayer(Side.ZERO, "Sasha");
        Player computer = new ComputerPlayer(Side.ZERO, "Computer");
        TicTacToeGame game = new TicTacToeGame(firstPlayer, computer);
        game.startGame();
    }



}
