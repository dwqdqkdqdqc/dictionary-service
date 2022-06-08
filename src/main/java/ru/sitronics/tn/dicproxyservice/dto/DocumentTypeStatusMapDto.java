package ru.sitronics.tn.dicproxyservice.dto;

import lombok.Data;
import ru.sitronics.tn.dicproxyservice.model.DocumentStatus;
import ru.sitronics.tn.dicproxyservice.model.DocumentType;

@Data
public class DocumentTypeStatusMapDto {
    private long id;
    private DocumentType documentType;
    private DocumentStatus status;
    private int statusOrder;
}