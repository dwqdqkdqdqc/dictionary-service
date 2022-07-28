package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciProductionStage;
import ru.sitronics.tn.dictionaryservice.repository.NciProductionStageRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciProductionStageService
        extends AbstractDictionaryService<NciProductionStage, NciProductionStageRepository> {

    public NciProductionStageService(NciProductionStageRepository repository) {
        super(repository);
    }
}
