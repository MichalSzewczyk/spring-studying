package ioc.multiple_services_fixed;

/**
 * Created by Michał Szewczyk on 2017-02-02.
 */
public class EngineController {
    private FuelPompService fuelPompService;
    private OilPompService oilPompService;
    private EngineService engineService;

    public EngineController(FuelPompService fuelPompService, OilPompService oilPompService, EngineService engineService) {
        this.fuelPompService = fuelPompService;
        this.oilPompService = oilPompService;
        this.engineService = engineService;
    }

    EngineController() {

    }

    boolean runEngine() {
        return fuelPompService.runFuelPomp() && oilPompService.runOilPompService() && engineService.runEngine();
    }
}
