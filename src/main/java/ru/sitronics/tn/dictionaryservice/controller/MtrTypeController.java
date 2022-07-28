package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciMtrType;
import ru.sitronics.tn.dictionaryservice.service.NciMtrTypeService;

@RestController
@RequestMapping(ControllerConstants.MTR_TYPES_PATH)
public class MtrTypeController extends AbstractDictionaryController<NciMtrType, NciMtrTypeService> {

    public MtrTypeController(NciMtrTypeService service) {
        super(service);
    }
}
