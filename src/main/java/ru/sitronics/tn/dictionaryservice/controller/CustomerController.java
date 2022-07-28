package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciCustomer;
import ru.sitronics.tn.dictionaryservice.service.NciCustomerService;

@RestController
@RequestMapping(ControllerConstants.CUSTOMERS_PATH)
public class CustomerController extends AbstractDictionaryController<NciCustomer, NciCustomerService> {

    public CustomerController(NciCustomerService service) {
        super(service);
    }
}
