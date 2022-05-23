package ru.sitronics.tn.dicproxyservice.exception.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Data
public class ErrorMessage {
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private final Date timestamp = new Date();
    private final int status;
    private final String error;
    private final String message;
    private final String path;
    private String description;
}
