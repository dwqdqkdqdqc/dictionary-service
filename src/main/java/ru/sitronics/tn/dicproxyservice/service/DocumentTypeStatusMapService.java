package ru.sitronics.tn.dicproxyservice.service;

import ru.sitronics.tn.dicproxyservice.dto.DocumentTypeStatusMapDto;
import java.util.List;

public interface DocumentTypeStatusMapService {
    List<DocumentTypeStatusMapDto> getAllDocumentTypeStatusMaps();
    List<DocumentTypeStatusMapDto> getDocumentTypeStatusMapByDocumentType(String documentType);
}