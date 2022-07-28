package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciAccessLimitation;
import ru.sitronics.tn.dictionaryservice.service.NciAccessLimitationService;

@RestController
@RequestMapping(ControllerConstants.ACCESS_LIMITATIONS_PATH)
public class AccessLimitationController
        extends AbstractDictionaryController<NciAccessLimitation, NciAccessLimitationService> {

    public AccessLimitationController(NciAccessLimitationService service) {
        super(service);
    }
}
