package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciAccessLimitation;
import ru.sitronics.tn.dictionaryservice.repository.NciAccessLimitationRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciAccessLimitationService
        extends AbstractDictionaryService<NciAccessLimitation, NciAccessLimitationRepository> {

    public NciAccessLimitationService(NciAccessLimitationRepository repository) {
        super(repository);
    }
}
