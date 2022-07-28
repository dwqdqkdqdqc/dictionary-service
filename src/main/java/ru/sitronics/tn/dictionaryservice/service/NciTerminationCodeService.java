package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciTerminationCode;
import ru.sitronics.tn.dictionaryservice.repository.NciTerminationCodeRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciTerminationCodeService
        extends AbstractDictionaryService<NciTerminationCode, NciTerminationCodeRepository> {

    public NciTerminationCodeService(NciTerminationCodeRepository repository) {
        super(repository);
    }
}
