package ru.sitronics.tn.dictionaryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dictionaryservice.model.DocTypeStatusMapItem;

import java.util.List;

@Repository
public interface MapDocTypeStatusRepository extends JpaRepository<DocTypeStatusMapItem, Long> {
    List<DocTypeStatusMapItem> findAllByActiveTrueOrderByKeyAscOrdAsc();
    List<DocTypeStatusMapItem> findByKeyAndActiveTrueOrderByOrdAsc(String key);
}
