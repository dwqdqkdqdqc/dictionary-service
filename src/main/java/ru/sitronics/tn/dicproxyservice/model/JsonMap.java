package ru.sitronics.tn.dicproxyservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonMap {
    private String type;
    private Map<Integer, String> status = new HashMap<>();
}