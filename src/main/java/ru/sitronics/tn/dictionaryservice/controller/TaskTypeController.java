package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciTaskType;
import ru.sitronics.tn.dictionaryservice.service.NciTaskTypeService;

@RestController
@RequestMapping(ControllerConstants.TASK_TYPE_PATH)
public class TaskTypeController extends AbstractDictionaryController<NciTaskType, NciTaskTypeService> {

    public TaskTypeController(NciTaskTypeService service) {
        super(service);
    }
}
