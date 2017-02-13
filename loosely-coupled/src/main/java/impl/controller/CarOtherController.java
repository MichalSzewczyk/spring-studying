package impl.controller;

import impl.service.CarOtherService;
import interfaces.CarController;

/**
 * Created by Michał Szewczyk on 2017-02-13.
 *
 */
public class CarOtherController  implements CarController {
    private CarOtherService otherService;
    @Override
    public String work() {
        return "other controller: " + otherService.performOperation();
    }
}