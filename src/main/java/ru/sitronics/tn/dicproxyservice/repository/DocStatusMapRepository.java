package ru.sitronics.tn.dicproxyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dicproxyservice.model.DocStatusMapItem;

import java.util.List;

@Repository
public interface DocStatusMapRepository extends JpaRepository<DocStatusMapItem, Long> {
    List<DocStatusMapItem> findAllByActiveTrueOrderByKeyAscOrdAsc();
    List<DocStatusMapItem> findByKeyAndActiveTrueOrderByOrdAsc(String key);
}
