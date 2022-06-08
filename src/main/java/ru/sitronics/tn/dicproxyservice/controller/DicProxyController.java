package ru.sitronics.tn.dicproxyservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dicproxyservice.dto.DocumentTypeStatusMapDto;
import ru.sitronics.tn.dicproxyservice.model.JsonMap;
import ru.sitronics.tn.dicproxyservice.service.DocumentTypeStatusMapService;
import ru.sitronics.tn.dicproxyservice.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static ru.sitronics.tn.dicproxyservice.util.Utils.toListOfJsonMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dic")
public class DicProxyController {
    private final DocumentTypeStatusMapService documentTypeStatusMapService;

    @GetMapping
    public ResponseEntity<?> getAllDic() {
        Map<String, Object> dics = new HashMap<>();
        dics.put("docType", DicDocType.response());
        dics.put("organisations", DicOrgs.response());
        dics.put("specMark", DicSpecMark.response());
        dics.put("status", DicStatus.response());
        dics.put("docTypeStatusMap", getAllDocumentTypeStatusMaps());
        return ResponseEntity.ok().header(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*").body(dics);
    }

    private List<JsonMap> getAllDocumentTypeStatusMaps() {
        List<DocumentTypeStatusMapDto> docTypeStatusMap = documentTypeStatusMapService.getAllDocumentTypeStatusMaps();
        return toListOfJsonMap(docTypeStatusMap);
    }
}
