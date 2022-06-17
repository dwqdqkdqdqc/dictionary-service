package ru.sitronics.tn.dictionaryservice.model;

import lombok.ToString;
import org.hibernate.Hibernate;
import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;

import javax.persistence.Entity;
import javax.persistence.Table;

@ToString(callSuper = true)
@Entity
@Table(name = "nci_organisations")
public class NciOrgs extends Dictionary {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
