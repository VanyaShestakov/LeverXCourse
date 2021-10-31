package com.leverxcourse.homework1.TicTacToe.GameModes;

import com.leverxcourse.homework1.TicTacToe.Exceptions.CellIsTakenException;
import com.leverxcourse.homework1.TicTacToe.Exceptions.SymbolPositionOutOfBoundsException;
import com.leverxcourse.homework1.TicTacToe.Game.GameField;

import java.util.Scanner;

public class FriendMode implements GameMode{

    private GameField field;
    private final Scanner scanner;
    private final static char CROSS = 'X';
    private final static char ZERO = '0';



    public FriendMode() {
        field = new GameField();
        scanner = new Scanner(System.in);
    }

    @Override
    public void playGame() {
        char currSymbol = CROSS;
        while (field.hasEmptyCells()) {
            System.out.println("\nFIELD:");
            System.out.println(field);
            playRound(currSymbol);
            if (field.hasWinner(currSymbol)) {
                System.out.println(currSymbol + " is win!");
                System.out.println(field);
                break;
            }
            currSymbol = currSymbol == CROSS ? ZERO : CROSS;
        }
    }

    private void playRound(char symbol) {
        System.out.println("Now play " + symbol);
        boolean isIncorrect;
        do {
            isIncorrect = false;
            System.out.println("Enter x:");
            int x = scanner.nextInt();
            System.out.println("Enter y:");
            int y = scanner.nextInt();
            try {
                field.addSymbol(x, y, symbol);
            } catch (SymbolPositionOutOfBoundsException | CellIsTakenException e) {
                System.out.println(e.getMessage());
                System.out.println("Repeat enter!");
                isIncorrect = true;
            }
        } while (isIncorrect);
    }

}