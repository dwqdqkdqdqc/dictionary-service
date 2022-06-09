package ru.sitronics.tn.dicproxyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dicproxyservice.model.DictionaryItem;

import java.util.List;

@Repository
public interface DictionaryRepository extends JpaRepository<DictionaryItem, Long> {
    List<DictionaryItem> findAllByActiveTrueOrderByType();
    List<DictionaryItem> findAllByActiveTrueOrderByOrd();
    List<DictionaryItem> findAllByTypeAndActiveTrueOrderByOrd(String type);
//    DictionaryItem findAllByTypeAndCodeAndActiveTrueOrderByOrd(String type, String code);
}
