package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciDocStatus;
import ru.sitronics.tn.dictionaryservice.repository.NciDocStatusRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciDocStatusService extends AbstractDictionaryService<NciDocStatus, NciDocStatusRepository> {

    public NciDocStatusService(NciDocStatusRepository repository) {
        super(repository);
    }
}
