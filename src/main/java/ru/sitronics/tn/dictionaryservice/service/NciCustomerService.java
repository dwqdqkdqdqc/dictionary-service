package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciCustomer;
import ru.sitronics.tn.dictionaryservice.repository.NciCustomerRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciCustomerService extends AbstractDictionaryService<NciCustomer, NciCustomerRepository> {

    public NciCustomerService(NciCustomerRepository repository) {
        super(repository);
    }
}
