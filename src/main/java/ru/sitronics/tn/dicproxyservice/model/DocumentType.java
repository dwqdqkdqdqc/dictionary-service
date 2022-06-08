package ru.sitronics.tn.dicproxyservice.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity(name = "DocType")
@Table(name = "document_type")
public class DocumentType implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "name_rus")
    private String nameRus;
}