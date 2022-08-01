package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciCounty;
import ru.sitronics.tn.dictionaryservice.repository.NciCountryRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciCountryService extends AbstractDictionaryService<NciCounty, NciCountryRepository> {

    public NciCountryService(NciCountryRepository repository) {
        super(repository);
    }
}
