package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciDocStatus;
import ru.sitronics.tn.dictionaryservice.repository.NciDocStatusRepository;
import ru.sitronics.tn.dictionaryservice.service.NciDocStatusService;

@RestController
@RequestMapping(ControllerConstants.DOC_STATUSES_PATH)
public class DocStatusController extends AbstractDictionaryController<NciDocStatus, NciDocStatusService> {

    public DocStatusController(NciDocStatusService service) {
        super(service);
    }
}
