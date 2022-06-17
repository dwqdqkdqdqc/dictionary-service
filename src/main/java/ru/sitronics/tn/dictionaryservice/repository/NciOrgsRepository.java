package ru.sitronics.tn.dictionaryservice.repository;

import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dictionaryservice.model.NciOrgs;
import ru.sitronics.tn.dictionaryservice.repository.base.DictionaryRepository;

@Repository
public interface NciOrgsRepository extends DictionaryRepository<NciOrgs> {
}
