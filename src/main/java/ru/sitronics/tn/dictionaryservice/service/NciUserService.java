package ru.sitronics.tn.dictionaryservice.service;

import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.model.NciUser;
import ru.sitronics.tn.dictionaryservice.repository.NciUserRepository;
import ru.sitronics.tn.dictionaryservice.service.base.CustomAbstractDictService;

@Service
public class NciUserService extends CustomAbstractDictService<NciUser, NciUserRepository> {

    public NciUserService(NciUserRepository repository) {
        super(repository);
    }
}
