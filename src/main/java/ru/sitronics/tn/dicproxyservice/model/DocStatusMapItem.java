package ru.sitronics.tn.dicproxyservice.model;

import lombok.Getter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@ToString
@Entity
@Table(name = "doc_status_map")
public class DocStatusMapItem extends BaseEntity {
    @Column(name = "doc_type")
    private String key;
    @Column(name = "status_type")
    private String value;
    private boolean active;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DocStatusMapItem that = (DocStatusMapItem) o;
        return id != null && Objects.equals(id, that.id)
                && Objects.equals(key, that.key)
                && Objects.equals(value, that.value)
                && Objects.equals(active, that.active)
                && Objects.equals(ord, that.ord);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
