package ru.sitronics.tn.dictionaryservice.service.base;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import ru.sitronics.tn.dictionaryservice.exception.CustomAppException;
import ru.sitronics.tn.dictionaryservice.model.base.BaseEntityLongId;
import ru.sitronics.tn.dictionaryservice.repository.base.CustomDictRepository;
import ru.sitronics.tn.dictionaryservice.util.ObjectUtils;

import java.util.List;

@RequiredArgsConstructor
public class CustomAbstractDictService
        <E extends BaseEntityLongId, R extends CustomDictRepository<E>> implements CustomDictService<E> {

    protected final R repository;

    @Override
    public List<E> get() {
        return repository.findAll();
    }

    @Override
    public E get(Long id) {
        return repository.findById(id).orElseThrow(() -> new CustomAppException(HttpStatus.NOT_FOUND, "Wrong ID"));
    }

    @Override
    public E save(E entity) {
        return repository.save(entity);
    }

    @Override
    public E update(Long id, E entity) {
        return save(ObjectUtils.partialUpdate(get(id), entity));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
