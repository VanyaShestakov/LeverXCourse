package com.leverxcourse.homework1.TicTacToe.players;

import com.leverxcourse.homework1.TicTacToe.field.GameField;
import com.leverxcourse.homework1.TicTacToe.field.impl.TicTacToeField;
import com.leverxcourse.homework1.TicTacToe.gamethings.Side;

public interface Player {

    public void playRound(GameField field);

    public char getSideSymbol();

    public String getName();

    public Side getSide();
}
