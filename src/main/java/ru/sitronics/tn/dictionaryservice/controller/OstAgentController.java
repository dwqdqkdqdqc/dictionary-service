package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciOstAgent;
import ru.sitronics.tn.dictionaryservice.service.NciOstAgentService;
import ru.sitronics.tn.dictionaryservice.service.NciOstService;

@RestController
@RequestMapping(ControllerConstants.OST_AGENTS_PATH)
public class OstAgentController extends AbstractDictionaryController<NciOstAgent, NciOstAgentService> {

    public OstAgentController(NciOstAgentService service) {
        super(service);
    }
}
