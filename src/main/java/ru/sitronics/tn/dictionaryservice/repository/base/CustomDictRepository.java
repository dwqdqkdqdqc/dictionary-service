package ru.sitronics.tn.dictionaryservice.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.sitronics.tn.dictionaryservice.model.base.BaseEntityLongId;
@NoRepositoryBean
public interface CustomDictRepository <E extends BaseEntityLongId> extends JpaRepository<E, Long> {
}
