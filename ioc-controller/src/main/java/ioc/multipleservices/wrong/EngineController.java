package ioc.multipleservices.wrong;

/**
 * Created by Michał Szewczyk on 2017-02-02.
 *
 */
class EngineController {
    private FuelPompService fuelPompService;
    private OilPompService oilPompService;
    private EngineService engineService;

    EngineController() {
        this.fuelPompService = new FuelPompService();
        this.oilPompService = new OilPompService();
        this.engineService = new EngineService();
    }

    boolean runEngine() {
        return fuelPompService.runFuelPomp() && oilPompService.runOilPompService() && engineService.runEngine();
    }
}
