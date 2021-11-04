package com.leverxcourse.homework1.TicTacToe.players.impl;

import com.leverxcourse.homework1.TicTacToe.exceptions.CellIsTakenException;
import com.leverxcourse.homework1.TicTacToe.exceptions.SymbolPositionOutOfBoundsException;
import com.leverxcourse.homework1.TicTacToe.field.GameField;
import com.leverxcourse.homework1.TicTacToe.field.impl.TicTacToeField;
import com.leverxcourse.homework1.TicTacToe.gamethings.Side;
import com.leverxcourse.homework1.TicTacToe.players.Player;

import java.util.Scanner;

public class RealPlayer implements Player {

    private final Side side;
    private final String name;
    private final Scanner scanner = new Scanner(System.in);

    public RealPlayer(Side side, String name) {
        this.side = side;
        this.name = name;
    }

    @Override
    public char getSideSymbol() {
        return side.getSymbol();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Side getSide() {
        return this.side;
    }

    @Override
    public void playRound(GameField field) {
        System.out.println("Now play " + this.name + " (" + side.getSymbol() + ")");
        boolean isIncorrect;
        do {
            isIncorrect = false;
            System.out.println("Enter x:");
            int x = scanner.nextInt();
            System.out.println("Enter y:");
            int y = scanner.nextInt();
            try {
                field.addSymbol(x, y, side.getSymbol());
            } catch (SymbolPositionOutOfBoundsException | CellIsTakenException e) {
                System.out.println(e.getMessage());
                System.out.println("Repeat enter!");
                isIncorrect = true;
            }
        } while (isIncorrect);
    }
}
