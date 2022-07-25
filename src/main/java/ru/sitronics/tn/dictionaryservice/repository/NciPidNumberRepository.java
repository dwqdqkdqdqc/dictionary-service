package ru.sitronics.tn.dictionaryservice.repository;

import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dictionaryservice.model.NciPidNumber;
import ru.sitronics.tn.dictionaryservice.repository.base.DictionaryRepository;

@Repository
public interface NciPidNumberRepository extends DictionaryRepository<NciPidNumber> {
}
