package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciObject;
import ru.sitronics.tn.dictionaryservice.service.NciObjectService;

@RestController
@RequestMapping(ControllerConstants.OBJECTS_PATH)
public class ObjectController extends AbstractDictionaryController<NciObject, NciObjectService> {

    public ObjectController(NciObjectService service) {
        super(service);
    }
}
