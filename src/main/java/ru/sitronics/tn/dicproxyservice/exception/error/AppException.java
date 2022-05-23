package ru.sitronics.tn.dicproxyservice.exception.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class AppException extends RuntimeException {
    private final HttpStatus status;
    private final String msg;

    public AppException(HttpStatus status, String message) {
        this.status = status;
        this.msg = message;
    }

    public AppException(HttpStatus status, String message, Throwable cause) {
        super(cause);
        this.status = status;
        this.msg = message;
    }
}
