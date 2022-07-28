package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciDocType;
import ru.sitronics.tn.dictionaryservice.repository.NciDocTypeRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciDocTypeService extends AbstractDictionaryService<NciDocType, NciDocTypeRepository> {

    public NciDocTypeService(NciDocTypeRepository repository) {
        super(repository);
    }
}
