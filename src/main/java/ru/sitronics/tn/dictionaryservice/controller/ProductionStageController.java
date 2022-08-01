package ru.sitronics.tn.dictionaryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sitronics.tn.dictionaryservice.constants.ControllerConstants;
import ru.sitronics.tn.dictionaryservice.controller.base.AbstractDictionaryController;
import ru.sitronics.tn.dictionaryservice.model.NciProductionStage;
import ru.sitronics.tn.dictionaryservice.service.NciProductionStageService;

@RestController
@RequestMapping(ControllerConstants.PRODUCTION_STAGES_PATH)
public class ProductionStageController
        extends AbstractDictionaryController<NciProductionStage, NciProductionStageService> {

    public ProductionStageController(NciProductionStageService service) {
        super(service);
    }
}
