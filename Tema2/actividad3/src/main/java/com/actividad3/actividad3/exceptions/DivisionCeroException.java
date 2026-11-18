package com.actividad3.actividad3.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class DivisionCeroException extends ResponseStatusException {
    public DivisionCeroException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
