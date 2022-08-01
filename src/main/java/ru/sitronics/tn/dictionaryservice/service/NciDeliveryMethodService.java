package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciDeliveryMethod;
import ru.sitronics.tn.dictionaryservice.repository.NciDeliveryMethodRepository;
import ru.sitronics.tn.dictionaryservice.service.base.AbstractDictionaryService;

@Service
public class NciDeliveryMethodService
        extends AbstractDictionaryService<NciDeliveryMethod, NciDeliveryMethodRepository> {

    public NciDeliveryMethodService(NciDeliveryMethodRepository repository) {
        super(repository);
    }
}
