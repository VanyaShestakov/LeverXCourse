package com.leverxcourse.homework1.TicTacToe.players;

import com.leverxcourse.homework1.TicTacToe.gamethings.GameField;

public interface Player {

    public void playRound(GameField field);

    public char getSideSymbol();

    public String getName();
}
