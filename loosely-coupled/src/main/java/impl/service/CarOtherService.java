package impl.service;

import interfaces.CarDAO;
import interfaces.CarService;

/**
 * Created by Michał Szewczyk on 2017-02-13.
 *
 */
public class CarOtherService implements CarService {
    private CarDAO carDAO;
    @Override
    public String performOperation() {
        return "Other Service : " + carDAO.getId() + " " + carDAO.getName();
    }
}
