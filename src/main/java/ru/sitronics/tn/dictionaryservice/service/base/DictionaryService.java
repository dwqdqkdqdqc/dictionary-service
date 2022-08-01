package ru.sitronics.tn.dictionaryservice.service.base;

import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;

import java.util.List;

public interface DictionaryService<E extends Dictionary> {
    List<E> get();
    List<E> getActive();
    E get(Long id);
    E save(E entity);
    E update(Long id, E entity);
    void deleteById(Long id);
}
