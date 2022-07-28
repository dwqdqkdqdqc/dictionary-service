package ru.sitronics.tn.dictionaryservice.service.base;

import ru.sitronics.tn.dictionaryservice.model.base.BaseEntityLongId;
import ru.sitronics.tn.dictionaryservice.repository.base.CustomDictRepository;

import java.util.List;

public interface CustomDictService<E extends BaseEntityLongId> {

    List<E> get();

    E get(Long id);

    E save(E entity);

    E update(Long id, E entity);

    void deleteById(Long id);
}
