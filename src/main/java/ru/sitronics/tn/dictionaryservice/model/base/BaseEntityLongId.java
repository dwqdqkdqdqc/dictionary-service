package ru.sitronics.tn.dictionaryservice.model.base;

import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Getter
@ToString(callSuper = true)
@MappedSuperclass
public abstract class BaseEntityLongId extends BaseLongId {
    @CreationTimestamp
    protected Instant createdAt;
    @UpdateTimestamp
    protected Instant modifiedAt;

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this);
    }
}
