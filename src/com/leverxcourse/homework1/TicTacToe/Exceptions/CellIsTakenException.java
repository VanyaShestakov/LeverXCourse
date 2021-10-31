package com.leverxcourse.homework1.TicTacToe.Exceptions;

public class CellIsTakenException extends RuntimeException{
    public CellIsTakenException() {
        super();
    }

    public CellIsTakenException(String message) {
        super(message);
    }

    public CellIsTakenException(String message, Throwable cause) {
        super(message, cause);
    }

    public CellIsTakenException(Throwable cause) {
        super(cause);
    }

    protected CellIsTakenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
