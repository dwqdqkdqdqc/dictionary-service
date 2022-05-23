package ru.sitronics.tn.dicproxyservice.exception.error;

import org.springframework.http.HttpStatus;

public class NotFoundException extends AppException {
    public NotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
    public NotFoundException(String message, Throwable cause) {
        super(HttpStatus.NOT_FOUND, message, cause);
    }
}
