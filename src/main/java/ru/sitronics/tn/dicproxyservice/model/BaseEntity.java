package ru.sitronics.tn.dicproxyservice.model;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Getter
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue
    protected Long id;
    protected int ord;
    @CreationTimestamp
    protected Instant createDate;
    @UpdateTimestamp
    protected Instant modifyDate;
}
