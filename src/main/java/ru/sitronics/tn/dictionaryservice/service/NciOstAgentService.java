package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciOstAgent;
import ru.sitronics.tn.dictionaryservice.repository.NciOstAgentRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciOstAgentService extends AbstractDictionaryService<NciOstAgent, NciOstAgentRepository> {

    public NciOstAgentService(NciOstAgentRepository repository) {
        super(repository);
    }
}
