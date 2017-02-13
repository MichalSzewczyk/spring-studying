package app.services;

import app.dao.SimpleDAO;
import app.model.DepositDetails;

/**
 * Created by Michał Szewczyk on 2017-02-10.
 *
 */
public class SimpleService {
    private SimpleDAO simpleDAO;

    public SimpleDAO getSimpleDAO() {
        return simpleDAO;
    }

    public void setSimpleDAO(SimpleDAO simpleDAO) {
        this.simpleDAO = simpleDAO;
    }
    public void save(DepositDetails depositDetails){
        System.out.println("Performing some business logic operations in SimpleService.");
        simpleDAO.save(depositDetails);
    }
}
