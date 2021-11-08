package com.leverxcourse.homework1.TicTacToe.field;;

import com.leverxcourse.homework1.TicTacToe.gamethings.Coord;
import com.leverxcourse.homework1.TicTacToe.players.Player;

import java.util.List;

public interface GameField {

    List<Coord> getEmptyCells();

    boolean isEmptyCell(int i, int j);

    boolean hasEmptyCells();

    boolean hasWinner(Player player);

    void addSymbol(int i, int j, char symbol);
}
