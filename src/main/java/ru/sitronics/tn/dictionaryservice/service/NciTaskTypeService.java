package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciTaskType;
import ru.sitronics.tn.dictionaryservice.repository.NciTaskTypeRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciTaskTypeService extends AbstractDictionaryService<NciTaskType, NciTaskTypeRepository> {

    public NciTaskTypeService(NciTaskTypeRepository repository) {
        super(repository);
    }
}
