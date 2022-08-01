package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciCounty;
import ru.sitronics.tn.dictionaryservice.service.NciCountryService;

@RestController
@RequestMapping(ControllerConstants.COUNTRIES_PATH)
public class CountryController extends AbstractDictionaryController<NciCounty, NciCountryService> {

    public CountryController(NciCountryService service) {
        super(service);
    }
}
