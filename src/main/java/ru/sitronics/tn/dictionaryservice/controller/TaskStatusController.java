package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciTaskStatus;
import ru.sitronics.tn.dictionaryservice.service.NciTaskStatusService;

@RestController
@RequestMapping(ControllerConstants.TASK_STATUS_PATH)
public class TaskStatusController extends AbstractDictionaryController<NciTaskStatus, NciTaskStatusService> {
    public TaskStatusController(NciTaskStatusService service) {
        super(service);
    }
}
