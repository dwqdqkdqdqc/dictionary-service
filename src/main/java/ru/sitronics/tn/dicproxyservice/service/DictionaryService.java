package ru.sitronics.tn.dicproxyservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ru.sitronics.tn.dicproxyservice.dto.DictionaryItemDto;
import ru.sitronics.tn.dicproxyservice.model.DictionaryItem;
import ru.sitronics.tn.dicproxyservice.repository.DictionaryRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DictionaryService {
    private final DictionaryRepository dictionaryRepository;

    public Map<String, List<DictionaryItemDto>> getAllDict() {
        Map<String, List<DictionaryItemDto>> dicts = new HashMap<>();
        List<DictionaryItem> list = dictionaryRepository.findAllByActiveTrueOrderByType();
        list.forEach(el -> {
            List<DictionaryItemDto> items = dicts.getOrDefault(el.getType(), new ArrayList<>());
            DictionaryItemDto item = new DictionaryItemDto();
            BeanUtils.copyProperties(el, item);
            items.add(item);
            dicts.put(el.getType(), items);
        });
        return dicts;
    }
}
