package com.leverxcourse.homework1.TicTacToe.exceptions;

public class SymbolPositionOutOfBoundsException extends RuntimeException {
    public SymbolPositionOutOfBoundsException() {
        super();
    }

    public SymbolPositionOutOfBoundsException(String message) {
        super(message);
    }

    public SymbolPositionOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public SymbolPositionOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    protected SymbolPositionOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
