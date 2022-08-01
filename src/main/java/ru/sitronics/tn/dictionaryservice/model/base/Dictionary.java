package ru.sitronics.tn.dictionaryservice.model.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.MappedSuperclass;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@MappedSuperclass
public abstract class Dictionary extends BaseEntityLongId {
    protected String code;
    protected String shortValue;
    protected String fullValue;
    protected boolean active;
    protected int ord;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Dictionary item = (Dictionary) o;
        return super.equals(o) && Objects.equals(code, item.getCode())
                && Objects.equals(shortValue, item.getShortValue())
                && Objects.equals(fullValue, item.getFullValue())
                && Objects.equals(active, item.isActive())
                && Objects.equals(ord, item.getOrd());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
