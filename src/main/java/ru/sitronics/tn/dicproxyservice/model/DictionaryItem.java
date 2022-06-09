package ru.sitronics.tn.dicproxyservice.model;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Objects;

@ToString
@Entity
@Table(name = "dictionary", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "type", "code"
        }, name = "uc_type_code")
})
public class DictionaryItem extends Dictionary {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DictionaryItem item = (DictionaryItem) o;
        return id != null && Objects.equals(id, item.id)
                && Objects.equals(type, item.type)
                && Objects.equals(code, item.code)
                && Objects.equals(shortValue, item.shortValue)
                && Objects.equals(fullValue, item.fullValue)
                && Objects.equals(active, item.active)
                && Objects.equals(ord, item.ord);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
