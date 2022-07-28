package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciDeliveryMethod;
import ru.sitronics.tn.dictionaryservice.service.NciDeliveryMethodService;

@RestController
@RequestMapping(ControllerConstants.DELIVERY_METHODS_PATH)
public class DeliveryMethodController
        extends AbstractDictionaryController<NciDeliveryMethod, NciDeliveryMethodService> {

    public DeliveryMethodController(NciDeliveryMethodService service) {
        super(service);
    }
}
