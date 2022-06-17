package ru.sitronics.tn.dictionaryservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.service.DictionaryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dict")
public class DictionaryController {
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
