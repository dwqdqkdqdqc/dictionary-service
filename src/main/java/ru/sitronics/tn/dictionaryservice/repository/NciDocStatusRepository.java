package ru.sitronics.tn.dictionaryservice.repository;

import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dictionaryservice.model.NciDocStatus;
import ru.sitronics.tn.dictionaryservice.repository.base.DictionaryRepository;

@Repository
public interface NciDocStatusRepository extends DictionaryRepository<NciDocStatus> {
}
