package ru.sitronics.tn.dictionaryservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ru.sitronics.tn.dictionaryservice.dto.DictionaryItemDto;
import ru.sitronics.tn.dictionaryservice.model.DocTypeStatusMapItem;
import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;
import ru.sitronics.tn.dictionaryservice.repository.*;
import ru.sitronics.tn.dictionaryservice.repository.base.DictionaryRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DictionaryService {
    private final NciDocTypeRepository docTypeRepo;
    private final NciDocStatusRepository docStatusRepo;
    private final NciSpecMarkRepository specMarkRepo;
    private final NciTaskTypeRepository taskTypeRepo;
    private final NciTaskStatusRepository taskStatusRepo;
    private final NciOrgsRepository orgRepo;
    private final MapDocTypeStatusRepository statusMapRepository;

    public Map<String, Object> getAllDict() {
        Map<String, Object> dicts = new HashMap<>();
        dicts.put("docType", getDict(docTypeRepo));
        dicts.put("docStatus", getDict(docStatusRepo));
        dicts.put("specMark", getDict(specMarkRepo));
        dicts.put("taskType", getDict(taskTypeRepo));
        dicts.put("taskStatus", getDict(taskStatusRepo));
        dicts.put("organisations", getDictList(orgRepo));
        dicts.put("statusMap", getStatusMap());
        return dicts;
    }

    public Map<String, Object> getAllDictExt() {
        Map<String, Object> dicts = new HashMap<>();
        dicts.put("docType", getDictExt(docTypeRepo));
        dicts.put("docStatus", getDictExt(docStatusRepo));
        dicts.put("specMark", getDictExt(specMarkRepo));
        dicts.put("taskType", getDictExt(taskTypeRepo));
        dicts.put("taskStatus", getDictExt(taskStatusRepo));
        dicts.put("organisations", getDictList(orgRepo));
        return dicts;
    }

    private <T extends Dictionary> Map<String, String> getDict(DictionaryRepository<T> repo) {
        Map<String, String> dict = new HashMap<>();
        List<T> items = repo.findAllByActiveTrueOrderByOrdAsc();
        items.forEach(el -> dict.put(el.getCode(), el.getFullValue()));
        return dict;
    }

    private <T extends Dictionary> List<DictionaryItemDto> getDictExt(DictionaryRepository<T> repo) {
        List<DictionaryItemDto> list = new ArrayList<>();
        List<T> items = repo.findAllByActiveTrueOrderByOrdAsc();
        items.forEach(el -> {
            DictionaryItemDto item = new DictionaryItemDto();
            BeanUtils.copyProperties(el, item);
            if (repo instanceof NciDocTypeRepository)
                item.setStatusMap(getStatusMap(item.getCode()));
            list.add(item);
        });
        return list;
    }

    private <T extends Dictionary> List<String> getDictList(DictionaryRepository<T> repo) {
        List<String> list = new ArrayList<>();
        List<T> items = repo.findAllByActiveTrueOrderByOrdAsc();
        items.forEach(el -> list.add(el.getFullValue()));
        return list;
    }

    private Map<String, List<String>> getStatusMap() {
        List<DocTypeStatusMapItem> statusMapItems = statusMapRepository.findAllByActiveTrueOrderByKeyAscOrdAsc();
        Map<String, List<String>> statuses = new HashMap<>();
        statusMapItems.forEach(el -> {
            List<String> items = statuses.getOrDefault(el.getKey(), new ArrayList<>());
            items.add(el.getValue());
            statuses.put(el.getKey(), items);
        });
        return statuses;
    }

    private List<String> getStatusMap(String docType) {
        List<DocTypeStatusMapItem> statusMapItems = statusMapRepository.findByKeyAndActiveTrueOrderByOrdAsc(docType);
        List<String> statuses = new ArrayList<>();
        statusMapItems.forEach(el -> statuses.add(el.getValue()));
        return statuses.size() > 0 ? statuses : null;
    }
}
