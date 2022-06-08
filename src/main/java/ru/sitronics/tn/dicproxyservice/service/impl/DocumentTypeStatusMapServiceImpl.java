package ru.sitronics.tn.dicproxyservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sitronics.tn.dicproxyservice.dto.DocumentTypeStatusMapDto;
import ru.sitronics.tn.dicproxyservice.model.DocumentTypeStatusMap;
import ru.sitronics.tn.dicproxyservice.repository.DocumentTypeStatusMapRepository;
import ru.sitronics.tn.dicproxyservice.service.DocumentTypeStatusMapService;
import java.util.List;
import static ru.sitronics.tn.dicproxyservice.util.Utils.toDto;

@Service
@RequiredArgsConstructor
public class DocumentTypeStatusMapServiceImpl implements DocumentTypeStatusMapService {

    private final DocumentTypeStatusMapRepository repository;

    @Override
    public List<DocumentTypeStatusMapDto> getAllDocumentTypeStatusMaps() {
        List<DocumentTypeStatusMap> allDocs = repository.findAll();
        return toDto(allDocs);
    }

    @Override
    public List<DocumentTypeStatusMapDto> getDocumentTypeStatusMapByDocumentType(String documentType) {
        List<DocumentTypeStatusMap> doc = repository.findAllByDocumentTypeName(documentType);
        return toDto(doc);
    }
}