package ioc.multipleservices.wrong;

/**
 * Created by Michał Szewczyk on 2017-02-02.
 *
 */
public class CarController {
    private EngineController engineController;
    private ElectricityService electricityService;
    private SafetyService safetyService;

    public CarController() {
        this.engineController = new EngineController();
        this.electricityService = new ElectricityService();
        this.safetyService = new SafetyService();
    }

    public boolean run() {
        return engineController.runEngine() && electricityService.powerOnElectricity() && safetyService.prepareSafetyFeatures();
    }
}
