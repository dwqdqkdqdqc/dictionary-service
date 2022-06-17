package ru.sitronics.tn.dictionaryservice.repository;

import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dictionaryservice.model.NciDocType;
import ru.sitronics.tn.dictionaryservice.repository.base.DictionaryRepository;

@Repository
public interface NciDocTypeRepository extends DictionaryRepository<NciDocType> {
}
