package com.leverxcourse.homework1.TicTacToe.field.impl;

import com.leverxcourse.homework1.TicTacToe.exceptions.CellIsTakenException;
import com.leverxcourse.homework1.TicTacToe.exceptions.SymbolPositionOutOfBoundsException;
import com.leverxcourse.homework1.TicTacToe.field.GameField;
import com.leverxcourse.homework1.TicTacToe.gamethings.Coord;
import com.leverxcourse.homework1.TicTacToe.players.Player;
import java.util.ArrayList;
import java.util.List;

public class TicTacToeField implements GameField {

    private static final byte FIELD_SIZE = 3;
    private static final char EMPTY = '_';

    private final char[][] field;

    public TicTacToeField() {
        this.field = new char[FIELD_SIZE][FIELD_SIZE];
        initField();
    }

    public List<Coord> getEmptyCells() {
        List<Coord> coords = new ArrayList<>();
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field[i][j] == EMPTY) {
                    coords.add(new Coord(i, j));
                }
            }
        }
        return coords;
    }

    public boolean isEmptyCell(int i, int j) {
        checkRange(i, j);
        return field[i][j] == EMPTY;
    }

    public boolean hasEmptyCells() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field[i][j] == EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasWinner(Player player) {
        char symbol = player.getSideSymbol();
        for (int i = 0; i < FIELD_SIZE; i++) {
            if (field[i][0] == symbol && field[i][1] == symbol && field[i][2] == symbol) {
                return true;
            }
            if (field[0][i] == symbol && field[1][i] == symbol && field[2][i] == symbol) {
                return true;
            }
        }
        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol ) {
            return true;
        }
        if (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol) {
            return true;
        }
        return false;
    }

    public void addSymbol(int i, int j, char symbol) {
        checkSymbol(symbol);
        checkRange(i, j);
        checkCell(i, j);
        field[i][j] = symbol;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FIELD:\n");
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                stringBuilder.append(field[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private void initField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
    }

    private void checkCell(int i, int j) {
        if (field[i][j] != '_') {
            throw new CellIsTakenException("This cell is taken");
        }
    }

    private void checkSymbol(char symbol) {
        if (symbol != 'X' && symbol != '0') {
            throw new IllegalArgumentException("Illegal argument 'symbol'=" + symbol);
        }
    }

    private void checkRange(int x, int y) {
        if (x > FIELD_SIZE - 1 || x < 0 || y > FIELD_SIZE - 1 || y < 0) {
            throw new SymbolPositionOutOfBoundsException("The coordinate (" + x + ";" + y + ") is out of bounds of the game field");
        }
    }
}
