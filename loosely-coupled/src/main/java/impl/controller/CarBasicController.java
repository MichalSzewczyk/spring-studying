package impl.controller;

import impl.service.CarBasicService;
import interfaces.CarController;

/**
 * Created by Michał Szewczyk on 2017-02-13.
 *
 */
public class CarBasicController implements CarController{
    private CarBasicService basicService;
    @Override
    public String work() {
        return "basic controller: " + basicService.performOperation();
    }

    public void setBasicService(CarBasicService basicService) {
        this.basicService = basicService;
    }
}
