package ru.sitronics.tn.dicproxyservice.model;

import lombok.Data;
import java.util.Map;

@Data
public class Response {
    private Map<String, Object> dic;
    public Response(Map<String, Object> dic) {
        this.dic = dic;
    }
}