package com.leverxcourse.homework1.TicTacToe.gamethings;

public enum Side {
    CROSS('X'), ZERO('0');

    private char symbol;

    Side(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
