package ru.sitronics.tn.dicproxyservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dicproxyservice.model.Dictionary;
import ru.sitronics.tn.dicproxyservice.service.DictionaryService;
import ru.sitronics.tn.dicproxyservice.util.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dict")
public class DictProxyController {
    private final DictionaryService dictionaryService;

    @GetMapping
    public ResponseEntity<?> getAllDic() {
        Map<String, Object> dics = new HashMap<>();
        dics.put("docType", DicDocType.response());
        dics.put("organisations", DicOrgs.response());
        dics.put("specMark", DicSpecMark.response());
        dics.put("status", DicStatus.response());
        return ResponseEntity.ok(dics);
    }

    @GetMapping("/v2")
    public ResponseEntity<?> getAllDic2() {
        return ResponseEntity.ok(dictionaryService.getAllDict());
    }
}
