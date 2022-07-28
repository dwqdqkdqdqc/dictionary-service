package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciObject;
import ru.sitronics.tn.dictionaryservice.repository.NciObjectRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciObjectService extends AbstractDictionaryService<NciObject, NciObjectRepository> {

    public NciObjectService(NciObjectRepository repository) {
        super(repository);
    }
}
