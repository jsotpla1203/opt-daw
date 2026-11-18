package com.actividad3.actividad3.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class OperacionIncorrectaException extends ResponseStatusException {
    public OperacionIncorrectaException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
