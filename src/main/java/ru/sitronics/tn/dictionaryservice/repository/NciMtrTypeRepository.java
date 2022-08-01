package ru.sitronics.tn.dictionaryservice.repository;

import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dictionaryservice.model.NciMtrType;
import ru.sitronics.tn.dictionaryservice.model.NciObject;
import ru.sitronics.tn.dictionaryservice.repository.base.DictionaryRepository;

@Repository
public interface NciMtrTypeRepository extends DictionaryRepository<NciMtrType> {
}
