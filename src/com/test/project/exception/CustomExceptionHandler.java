package com.test.project.exception;

public class CustomExceptionHandler extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final String errorMessage;
    private final Object data;

    public CustomExceptionHandler(String errorMessage) {
        super();
        this.errorMessage = errorMessage;
        this.data = null;
    }
}
