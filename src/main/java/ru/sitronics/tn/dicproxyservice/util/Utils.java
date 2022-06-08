package ru.sitronics.tn.dicproxyservice.util;

import org.springframework.beans.BeanUtils;
import ru.sitronics.tn.dicproxyservice.dto.DocumentTypeStatusMapDto;
import ru.sitronics.tn.dicproxyservice.model.DocumentTypeStatusMap;
import ru.sitronics.tn.dicproxyservice.model.JsonMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Utils {

    public static List<DocumentTypeStatusMapDto> toDto(List<DocumentTypeStatusMap> docs) {
        return docs
                .stream()
                .map(docType -> {
                    DocumentTypeStatusMapDto dto = new DocumentTypeStatusMapDto();
                    BeanUtils.copyProperties(docType, dto);
                    return dto;
                })
                .toList();
    }

    /**
     * Из листа DTO получаем лист json-объектов так, чтобы поле type не дублировалось.
     * @param docTypeStatusMap лист DTO.
     * @return лист json-объектов.
     */
    public static List<JsonMap> toListOfJsonMap(List<DocumentTypeStatusMapDto> docTypeStatusMap) {
        List<JsonMap> list = new ArrayList<>();

        for (DocumentTypeStatusMapDto dto : docTypeStatusMap) {
            String type = dto.getDocumentType().getName();
            String status = dto.getStatus().getName();
            int order = dto.getStatusOrder();

            if (!list.isEmpty() && list.get(list.size() - 1).getType().equals(type)) {
                JsonMap j = list.get(list.size() - 1);
                j.getStatus().put(order, status);
            } else {
                list.add(new JsonMap(type, new HashMap<>() {{put(order, status);}}));
            }
        }
        return list;
    }
}