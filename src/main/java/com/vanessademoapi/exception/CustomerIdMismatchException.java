package com.vanessademoapi.exception;

public class CustomerIdMismatchException extends RuntimeException {

    public CustomerIdMismatchException() {
        super();
    }

    public CustomerIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CustomerIdMismatchException(final String message) {
        super(message);
    }

    public CustomerIdMismatchException(final Throwable cause) {
        super(cause);
    }
}

