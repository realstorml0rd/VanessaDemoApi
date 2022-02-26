package com.vanessademoapi.exception;

public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException() {
        super();
    }

    public CustomerNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CustomerNotFoundException(final String message) {
        super(message);
    }

    public CustomerNotFoundException(final Throwable cause) {
        super(cause);
    }

}
