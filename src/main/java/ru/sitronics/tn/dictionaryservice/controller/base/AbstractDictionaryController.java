package ru.sitronics.tn.dictionaryservice.controller.base;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;
import ru.sitronics.tn.dictionaryservice.service.base.DictionaryService;

import java.util.List;

@RequiredArgsConstructor
public class AbstractDictionaryController<E extends Dictionary, S extends DictionaryService<E>> implements DictionaryController<E> {
    private final S service;

    @Override
    public ResponseEntity<List<E>> get() {
        return ResponseEntity.ok(service.get());
    }

    @Override
    public ResponseEntity<List<E>> getActive() {
        return ResponseEntity.ok(service.getActive());
    }

    @Override
    public ResponseEntity<E> get(Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @Override
    public ResponseEntity<E> save(E entity) {
        return ResponseEntity.ok(service.save(entity));
    }

    @Override
    public ResponseEntity<E> update(Long id, E entity) {
        return ResponseEntity.ok(service.update(id, entity));
    }

    @Override
    public ResponseEntity<E> delete(Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
