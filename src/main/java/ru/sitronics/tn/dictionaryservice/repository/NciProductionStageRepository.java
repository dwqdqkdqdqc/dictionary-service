package ru.sitronics.tn.dictionaryservice.repository;

import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dictionaryservice.model.NciCustomer;
import ru.sitronics.tn.dictionaryservice.model.NciProductionStage;
import ru.sitronics.tn.dictionaryservice.repository.base.DictionaryRepository;

@Repository
public interface NciProductionStageRepository extends DictionaryRepository<NciProductionStage> {
}
