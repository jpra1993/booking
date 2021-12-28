package com.booking.certificacion.exceptions;

public class FailedQuestion extends AssertionError {
    public FailedQuestion(String constant, Throwable cause) {
        super(constant, cause);
    }
}
