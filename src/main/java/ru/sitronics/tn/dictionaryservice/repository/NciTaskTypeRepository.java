package ru.sitronics.tn.dictionaryservice.repository;

import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dictionaryservice.model.NciTaskType;
import ru.sitronics.tn.dictionaryservice.repository.base.DictionaryRepository;

@Repository
public interface NciTaskTypeRepository extends DictionaryRepository<NciTaskType> {
}
