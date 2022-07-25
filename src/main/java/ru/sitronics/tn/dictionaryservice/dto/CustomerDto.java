package ru.sitronics.tn.dictionaryservice.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private String code;
    private String shortValue;
    private String fullValue;
    private String inn;
    private String kpp;
    private String okpo;
    private String okdp;
    private String ogrn;
    private String okved;
    private String okato;
    private String oktmo;
    private String phone;
    private String fax;
    private String email;
    private String address;
    private String customerType;
}
