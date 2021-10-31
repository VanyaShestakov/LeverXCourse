package com.leverxcourse.homework1.TicTacToe.Game;

import com.leverxcourse.homework1.TicTacToe.Exceptions.CellIsTakenException;
import com.leverxcourse.homework1.TicTacToe.Exceptions.SymbolPositionOutOfBoundsException;

import java.util.ArrayList;
import java.util.List;

public class GameField {

    private static final byte FIELD_SIZE = 3;
    private static final char EMPTY = '_';

    private char[][] field;

    public GameField() {
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

    public boolean hasWinner(char symbol) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            if (field[i][0] == symbol && field[i][1] == symbol && field[i][2] == symbol) {
                return true;
            }
            if (field[0][i] == symbol && field[1][i] == symbol && field[2][i] == symbol) {
                return true;
            }
        }
        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) {
            return true;
        }
        if (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol) {
            return true;
        }
        return false;
    }

    public void addSymbol(int i, int j, char symbol) {
        checkRange(i, j);
        checkCell(i, j);
        field[i][j] = symbol;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
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

    private void checkRange(int x, int y) {
        if (x > FIELD_SIZE - 1 || x < 0 || y > FIELD_SIZE - 1 || y < 0) {
            throw new SymbolPositionOutOfBoundsException("The coordinate (" + x + ";" + y + ") is out of bounds of the game field");
        }
    }

}
