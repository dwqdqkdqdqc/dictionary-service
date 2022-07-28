package ru.sitronics.tn.dictionaryservice.controller.base;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ru.sitronics.tn.dictionaryservice.model.base.BaseEntityLongId;
import ru.sitronics.tn.dictionaryservice.service.base.CustomDictService;

import java.util.List;

@RequiredArgsConstructor
public class CustomAbstractDictController
        <E extends BaseEntityLongId, S extends CustomDictService<E>> implements CustomDictController<E> {
    private final S service;

    @Override
    public ResponseEntity<List<E>> get() {
        return ResponseEntity.ok(service.get());
    }
    @Override
    public ResponseEntity<E> get(Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @Override
    public ResponseEntity<E> save(E entity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
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