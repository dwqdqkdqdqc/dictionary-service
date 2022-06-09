package ru.sitronics.tn.dicproxyservice.model;

import lombok.Getter;

import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass
public abstract class Dictionary extends BaseEntity {
    protected String type;
    protected String code;
    protected String shortValue;
    protected String fullValue;
    protected boolean active;
}
