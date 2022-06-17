package ru.sitronics.tn.dictionaryservice.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;

import java.util.List;

@NoRepositoryBean
public interface DictionaryRepository<E extends Dictionary> extends JpaRepository<E, Long> {
    List<E> findAllByActiveTrueOrderByOrdAsc();
}
