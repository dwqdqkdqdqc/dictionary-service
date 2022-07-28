package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciTypeTransport;
import ru.sitronics.tn.dictionaryservice.service.NciTypeTransportService;

@RestController
@RequestMapping(ControllerConstants.TYPE_TRANSPORT_PATH)
public class TypeTransportController
        extends AbstractDictionaryController<NciTypeTransport, NciTypeTransportService> {

    public TypeTransportController(NciTypeTransportService service) {
        super(service);
    }
}
