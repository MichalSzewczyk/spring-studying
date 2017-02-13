package impl.service;

import interfaces.CarDAO;
import interfaces.CarService;

/**
 * Created by Michał Szewczyk on 2017-02-13.
 *
 */
public class CarBasicService implements CarService {
    private CarDAO carDAO;
    @Override
    public String performOperation() {
        return "Basic Service : " + carDAO.getId() + " " + carDAO.getName();
    }

    public void setCarDAO(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
}
