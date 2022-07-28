package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciMtrType;
import ru.sitronics.tn.dictionaryservice.repository.NciMtrTypeRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciMtrTypeService extends AbstractDictionaryService<NciMtrType, NciMtrTypeRepository> {

    public NciMtrTypeService(NciMtrTypeRepository repository) {
        super(repository);
    }
}
