package ru.sitronics.tn.dictionaryservice.model;

import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nci_type_of_transport")
public class NciTypeOfTransport extends Dictionary {
}
