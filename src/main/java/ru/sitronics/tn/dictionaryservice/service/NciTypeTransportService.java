package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciTypeTransport;
import ru.sitronics.tn.dictionaryservice.repository.NciTypeTransportRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciTypeTransportService
        extends AbstractDictionaryService<NciTypeTransport, NciTypeTransportRepository> {

    public NciTypeTransportService(NciTypeTransportRepository repository) {
        super(repository);
    }
}
