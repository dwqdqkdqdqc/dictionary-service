package ru.sitronics.tn.dictionaryservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "nci_customer")
public class NciCustomer extends Dictionary {
    private int internalGUID;
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
    private String adress;
    private String customerType;
}
