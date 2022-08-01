package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciDocType;
import ru.sitronics.tn.dictionaryservice.service.NciDocTypeService;

@RestController
@RequestMapping(ControllerConstants.DOC_TYPES_PATH)
public class DocTypeController extends AbstractDictionaryController<NciDocType, NciDocTypeService> {

    public DocTypeController(NciDocTypeService service) {
        super(service);
    }
}
