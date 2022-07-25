package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciTaskStatus;
import ru.sitronics.tn.dictionaryservice.repository.*;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionatyService;

@Service
public class NciTaskStatusService extends AbstractDictionatyService<NciTaskStatus, NciTaskStatusRepository> {
    public NciTaskStatusService(NciTaskStatusRepository repository) {
        super(repository);
    }
}
