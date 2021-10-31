package com.leverxcourse.homework1.TicTacToe;

import com.leverxcourse.homework1.TicTacToe.Game.TicTacToeGame;
import com.leverxcourse.homework1.TicTacToe.GameModes.FriendMode;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        FriendMode friendMode = new FriendMode();
        TicTacToeGame.startGame(friendMode);
    }

}
