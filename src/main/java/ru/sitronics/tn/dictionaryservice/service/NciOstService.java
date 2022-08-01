package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciOst;
import ru.sitronics.tn.dictionaryservice.repository.NciOstRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciOstService extends AbstractDictionaryService<NciOst, NciOstRepository> {

    public NciOstService(NciOstRepository repository) {
        super(repository);
    }
}
