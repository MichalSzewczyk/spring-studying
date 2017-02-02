package ioc.multiple_services_fixed;

/**
 * Created by Michał Szewczyk on 2017-02-02.
 */
public class CarController {
    private EngineController engineController;
    private ElectricityService electricityService;
    private SafetyService safetyService;

    public CarController(EngineController engineController, ElectricityService electricityService, SafetyService safetyService) {
        this.engineController = engineController;
        this.electricityService = electricityService;
        this.safetyService = safetyService;
    }

    public CarController() {

    }

    public boolean run() {
        return engineController.runEngine() && electricityService.powerOnElectricity() && safetyService.prepareSafetyFeatures();
    }
}
