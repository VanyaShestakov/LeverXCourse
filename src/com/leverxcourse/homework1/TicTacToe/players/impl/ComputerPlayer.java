package com.leverxcourse.homework1.TicTacToe.players.impl;

import com.leverxcourse.homework1.TicTacToe.field.GameField;
import com.leverxcourse.homework1.TicTacToe.gamethings.Coord;
import com.leverxcourse.homework1.TicTacToe.field.impl.TicTacToeField;
import com.leverxcourse.homework1.TicTacToe.gamethings.Side;
import com.leverxcourse.homework1.TicTacToe.players.Player;

import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {

    private final Side side;
    private final String name;

    public ComputerPlayer(Side side, String name) {
        this.side = side;
        this.name = name;
    }

    @Override
    public void playRound(GameField field) {
        System.out.println("Now play " + this.name + " (" + side.getSymbol() + ")");
        List<Coord> emptyCells = field.getEmptyCells();
        Random random = new Random();
        int randomCell = random.nextInt(emptyCells.size());
        Coord coord = emptyCells.get(randomCell);
        field.addSymbol(coord.getX(), coord.getY(), side.getSymbol());
    }

    @Override
    public char getSideSymbol() {
        return side.getSymbol();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Side getSide() {
        return this.side;
    }
}
