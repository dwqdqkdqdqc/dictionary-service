package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.controller.base.CustomAbstractDictController;
import ru.sitronics.tn.dictionaryservice.model.NciUser;
import ru.sitronics.tn.dictionaryservice.service.NciUserService;
import ru.sitronics.tn.dictionaryservice.service.base.CustomAbstractDictService;

@RestController
@RequestMapping(ControllerConstants.NCI_USER_PATH)
public class UserController extends CustomAbstractDictController<NciUser, NciUserService> {

    public UserController(NciUserService service) {
        super(service);
    }
}
