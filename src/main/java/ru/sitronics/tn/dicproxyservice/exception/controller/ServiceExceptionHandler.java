package ru.sitronics.tn.dicproxyservice.exception.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.sitronics.tn.dicproxyservice.exception.error.AppException;
import ru.sitronics.tn.dicproxyservice.exception.model.ErrorMessage;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class ServiceExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(AppException.class)
    public ResponseEntity<?> appException(AppException e, WebRequest request) {
        log.error("Service Exception", e);
        HttpStatus status = e.getStatus();
        ErrorMessage error = new ErrorMessage(status.value(), status.getReasonPhrase(),e.getMsg(),
            request.getDescription(false).substring(4));
        if (log.isDebugEnabled())
            error.setDescription(e.getLocalizedMessage());
        return ResponseEntity.status(status).contentType(MediaType.APPLICATION_JSON).body(error);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> appException(Exception e, WebRequest request) {
        log.error("Service Exception", e);
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        ErrorMessage error = new ErrorMessage(status.value(), status.getReasonPhrase(), getFirstCauseMsg(e), request.getDescription(false).substring(4));
        if (log.isDebugEnabled())
            error.setDescription(e.getLocalizedMessage());
        return ResponseEntity.status(status).contentType(MediaType.APPLICATION_JSON).body(error);
    }

    private String getFirstCauseMsg(Exception e) {
        String cause = e.getLocalizedMessage();
        return cause = cause.substring(cause.lastIndexOf(": ") + 2);
    }
}
