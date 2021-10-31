package com.leverxcourse.homework1.TicTacToe.GameModes;

import com.leverxcourse.homework1.TicTacToe.Exceptions.CellIsTakenException;
import com.leverxcourse.homework1.TicTacToe.Exceptions.SymbolPositionOutOfBoundsException;
import com.leverxcourse.homework1.TicTacToe.Game.GameField;

import java.util.Random;
import java.util.Scanner;

public class ComputerMode implements GameMode {

    private GameField field;
    private final Scanner scanner;
    private final static char CROSS = 'X';
    private final static char ZERO = '0';



    public ComputerMode() {
        field = new GameField();
        scanner = new Scanner(System.in);
    }

    @Override
    public void playGame() {
        char currSymbol = CROSS;
        while (field.hasEmptyCells()) {
            System.out.println("\nFIELD:");
            System.out.println(field);
            playPlayerRound(currSymbol);
            if (field.hasWinner(currSymbol)) {
                System.out.println(currSymbol + " is win!");
                System.out.println(field);
                break;
            }
            currSymbol = currSymbol == CROSS ? ZERO : CROSS;
        }
    }

    private void playPlayerRound(char symbol) {
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

    private void playComputerRound(char symbol) {
        int i = 0;
        int j = 0;
        Random random = new Random();
        do {
            i = random.nextInt(3);
            j = random.nextInt(3);
        } while (!field.isEmptyCell(i, j));
        field.addSymbol(i, j);
    }
}
