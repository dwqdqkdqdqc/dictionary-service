package ru.sitronics.tn.dictionaryservice.model;

import lombok.Getter;
import lombok.ToString;
import org.hibernate.Hibernate;
import ru.sitronics.tn.dictionaryservice.model.base.BaseEntityLongId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@ToString(callSuper = true)
@Entity
@Table(name = "map_doc_type_status")
public class DocTypeStatusMapItem extends BaseEntityLongId {
    @Column(name = "doc_type")
    private String key;
    @Column(name = "status")
    private String value;
    private boolean active;
    private int ord;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DocTypeStatusMapItem that = (DocTypeStatusMapItem) o;
        return super.equals(o)
                && Objects.equals(key, that.getKey())
                && Objects.equals(value, that.getValue())
                && Objects.equals(active, that.isActive())
                && Objects.equals(ord, that.getOrd());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
