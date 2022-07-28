package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciUnits;
import ru.sitronics.tn.dictionaryservice.repository.NciUnitsRepository;
import ru.sitronics.tn.dictionaryservice.service.NciUnitsService;

@RestController
@RequestMapping(ControllerConstants.UNITS_PATH)
public class UnitsController extends AbstractDictionaryController<NciUnits, NciUnitsService> {

    public UnitsController(NciUnitsService service) {
        super(service);
    }
}
