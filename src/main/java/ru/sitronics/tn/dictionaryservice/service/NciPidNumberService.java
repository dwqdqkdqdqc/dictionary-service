package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciPidNumber;
import ru.sitronics.tn.dictionaryservice.repository.NciPidNumberRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciPidNumberService extends AbstractDictionaryService<NciPidNumber, NciPidNumberRepository> {

    public NciPidNumberService(NciPidNumberRepository repository) {
        super(repository);
    }
}
