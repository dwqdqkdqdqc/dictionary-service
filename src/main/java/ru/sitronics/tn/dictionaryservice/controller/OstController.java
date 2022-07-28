package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciOst;
import ru.sitronics.tn.dictionaryservice.service.NciOstService;

@RestController
@RequestMapping(ControllerConstants.OST_PATH)
public class OstController extends AbstractDictionaryController<NciOst, NciOstService> {

    public OstController(NciOstService service) {
        super(service);
    }
}
