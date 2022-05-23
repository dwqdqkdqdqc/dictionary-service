package ru.sitronics.tn.dicproxyservice.exception.error;

import org.springframework.http.HttpStatus;

public class InternalException extends AppException {
    public InternalException(String message) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    public InternalException(String message, Throwable cause) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, message, cause);
    }
}
