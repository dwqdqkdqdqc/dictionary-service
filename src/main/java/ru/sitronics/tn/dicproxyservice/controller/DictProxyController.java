package ru.sitronics.tn.dicproxyservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dicproxyservice.service.DictionaryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dict")
public class DictProxyController {
    private final DictionaryService dictionaryService;

    @GetMapping
    public ResponseEntity<?> getAllDict() {
        return ResponseEntity.ok(dictionaryService.getAllDict());
    }

    @GetMapping("/ext")
    public ResponseEntity<?> getAllDictExt() {
        return ResponseEntity.ok(dictionaryService.getAllDictExt());
    }
}
