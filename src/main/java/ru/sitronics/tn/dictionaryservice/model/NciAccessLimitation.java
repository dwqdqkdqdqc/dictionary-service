package ru.sitronics.tn.dictionaryservice.model;

import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nci_access_limitation")
public class NciAccessLimitation extends Dictionary {
}
