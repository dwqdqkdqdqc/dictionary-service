package ru.sitronics.tn.dictionaryservice.model;

import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nci_doc_spec_mark")
public class NciSpecMark extends Dictionary {
}
