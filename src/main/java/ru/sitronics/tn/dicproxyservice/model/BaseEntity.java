package ru.sitronics.tn.dicproxyservice.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

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
