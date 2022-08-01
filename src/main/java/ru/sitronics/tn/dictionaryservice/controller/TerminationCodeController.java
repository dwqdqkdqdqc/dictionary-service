package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciTerminationCode;
import ru.sitronics.tn.dictionaryservice.service.NciTerminationCodeService;

@RestController
@RequestMapping(ControllerConstants.TERMINATION_CODES_PATH)
public class TerminationCodeController
        extends AbstractDictionaryController<NciTerminationCode, NciTerminationCodeService> {

    public TerminationCodeController(NciTerminationCodeService service) {
        super(service);
    }
}
