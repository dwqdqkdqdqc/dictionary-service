package ru.sitronics.tn.dicproxyservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity(name = "Map")
@Table(
        name = "document_type_status_map",
        uniqueConstraints = @UniqueConstraint(
                name = "UNQ_TYPE_STATUS",
                columnNames = {"document_type_id", "status_id"}
        )
)
public class DocumentTypeStatusMap {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private DocumentType documentType;

    @ManyToOne
    private DocumentStatus status;

    @Column(name = "status_order")
    @NotNull
    private int statusOrder;
}