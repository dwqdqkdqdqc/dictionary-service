package ru.sitronics.tn.dictionaryservice.repository;

import org.springframework.stereotype.Repository;
import ru.sitronics.tn.dictionaryservice.model.NciUser;
import ru.sitronics.tn.dictionaryservice.repository.base.CustomDictRepository;

@Repository
public interface NciUserRepository extends CustomDictRepository<NciUser> {
}
