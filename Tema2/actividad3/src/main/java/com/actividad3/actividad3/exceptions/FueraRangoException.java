package com.actividad3.actividad3.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class FueraRangoException extends ResponseStatusException {
    public FueraRangoException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
