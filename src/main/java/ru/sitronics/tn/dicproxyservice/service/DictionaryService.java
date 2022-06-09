package ru.sitronics.tn.dicproxyservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ru.sitronics.tn.dicproxyservice.dto.DictionaryItemDto;
import ru.sitronics.tn.dicproxyservice.model.DictionaryItem;
import ru.sitronics.tn.dicproxyservice.model.DocStatusMapItem;
import ru.sitronics.tn.dicproxyservice.repository.DictionaryRepository;
import ru.sitronics.tn.dicproxyservice.repository.DocStatusMapRepository;
import ru.sitronics.tn.dicproxyservice.util.ObjectUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DictionaryService {
    private final DictionaryRepository dictionaryRepository;
    private final DocStatusMapRepository statusMapRepository;

    public Map<String, Object> getAllDict() {
        Map<String, Object> dicts = new HashMap<>();
        List<DictionaryItem> dictItems = dictionaryRepository.findAllByActiveTrueOrderByTypeAscOrdAsc();
        dictItems.forEach(el -> {
            Map<String, String> items = ObjectUtils.castToAnything(dicts.getOrDefault(el.getType(), new HashMap<>()));
            items.put(el.getCode(), el.getFullValue());
            dicts.put(el.getType(), items);
        });
        dicts.put("statusMap", getStatusMap());
        return dicts;
    }

    public Map<String, List<DictionaryItemDto>> getAllDictExt() {
        Map<String, List<DictionaryItemDto>> dicts = new HashMap<>();
        List<DictionaryItem> list = dictionaryRepository.findAllByActiveTrueOrderByTypeAscOrdAsc();
        list.forEach(el -> {
            List<DictionaryItemDto> items = dicts.getOrDefault(el.getType(), new ArrayList<>());
            DictionaryItemDto item = new DictionaryItemDto();
            BeanUtils.copyProperties(el, item);
            if ("DOCUMENT_TYPE".equals(el.getType()))
                item.setStatusMap(getStatusMap(item.getCode()));
            items.add(item);
            dicts.put(el.getType(), items);
        });
        return dicts;
    }

    private Map<String, List<String>> getStatusMap() {
        List<DocStatusMapItem> statusMapItems = statusMapRepository.findAllByActiveTrueOrderByKeyAscOrdAsc();
        Map<String, List<String>> statuses = new HashMap<>();
        statusMapItems.forEach(el -> {
            List<String> items = statuses.getOrDefault(el.getKey(), new ArrayList<>());
            items.add(el.getValue());
            statuses.put(el.getKey(), items);
        });
        return statuses;
    }

    private List<String> getStatusMap(String docType) {
        List<DocStatusMapItem> statusMapItems = statusMapRepository.findByKeyAndActiveTrueOrderByOrdAsc(docType);
        List<String> statuses = new ArrayList<>();
        statusMapItems.forEach(el -> statuses.add(el.getValue()));
        return statuses.size() > 0 ? statuses : null;
    }
}
