package ru.sitronics.tn.dicproxyservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dicproxyservice.dto.DocumentTypeStatusMapDto;
import ru.sitronics.tn.dicproxyservice.model.JsonMap;
import ru.sitronics.tn.dicproxyservice.model.Response;
import ru.sitronics.tn.dicproxyservice.service.DocumentTypeStatusMapService;
import java.util.List;
import java.util.Map;
import static ru.sitronics.tn.dicproxyservice.util.Utils.toListOfJsonMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dic/doctype-status-map")
public class DocumentTypeStatusMapController {

    private final DocumentTypeStatusMapService documentTypeStatusMapService;

    @GetMapping
    public ResponseEntity<?> getAllDocumentTypeStatusMaps() {

        List<DocumentTypeStatusMapDto> docTypeStatusMap = documentTypeStatusMapService.getAllDocumentTypeStatusMaps();

        List<JsonMap> list = toListOfJsonMap(docTypeStatusMap);
        Response response = new Response(Map.of("docTypeStatusMap", list));
        return ResponseEntity.ok().header(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*").body(response.getDic());
    }

    @GetMapping("/{type}")
    public ResponseEntity<?> getDocumentTypeStatusMapByDocumentType(@PathVariable(value = "type") String documentType) {

        List<DocumentTypeStatusMapDto> docTypeStatusMap = documentTypeStatusMapService.getDocumentTypeStatusMapByDocumentType(documentType);

        List<JsonMap> list = toListOfJsonMap(docTypeStatusMap);
        Response response = new Response(Map.of("docTypeStatusMap", /*jsonMap*/list));
        return ResponseEntity.ok().header(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*").body(response.getDic());
    }
}
