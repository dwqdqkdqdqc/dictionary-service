package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciPidNumber;
import ru.sitronics.tn.dictionaryservice.service.NciPidNumberService;

@RestController
@RequestMapping(ControllerConstants.PID_NUMBERS_PATH)
public class PidController extends AbstractDictionaryController<NciPidNumber, NciPidNumberService> {

    public PidController(NciPidNumberService service) {
        super(service);
    }
}
