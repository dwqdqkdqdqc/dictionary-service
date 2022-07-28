package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciUnits;
import ru.sitronics.tn.dictionaryservice.repository.NciUnitsRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;
@Service
public class NciUnitsService extends AbstractDictionaryService<NciUnits, NciUnitsRepository> {

    public NciUnitsService(NciUnitsRepository repository) {
        super(repository);
    }
}
