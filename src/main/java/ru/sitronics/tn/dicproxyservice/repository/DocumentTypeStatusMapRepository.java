package ru.sitronics.tn.dicproxyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dicproxyservice.model.DocumentTypeStatusMap;
import java.util.List;

@Repository
public interface DocumentTypeStatusMapRepository extends JpaRepository<DocumentTypeStatusMap, Long> {
    List<DocumentTypeStatusMap> findAllByDocumentTypeName(String documentType);
}