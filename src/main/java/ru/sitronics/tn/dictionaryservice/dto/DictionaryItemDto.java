package ru.sitronics.tn.dictionaryservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class DictionaryItemDto {
    private String code;
    private String shortValue;
    private String fullValue;
    private List<String> statusMap;
}
