package ru.sitronics.tn.dictionaryservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "nci_production_stage")
public class NciProductionStage extends Dictionary {
    @Column(name = "mtr_group")
    private String mtrGroup;
    @Column(name = "mtr_type")
    private String mtrType;
}
