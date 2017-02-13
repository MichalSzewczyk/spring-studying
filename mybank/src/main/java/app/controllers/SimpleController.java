package app.controllers;

import app.model.DepositDetails;
import app.services.SimpleService;

/**
 * Created by Michał Szewczyk on 2017-02-10.
 *
 */
public class SimpleController {
    private SimpleService simpleService;

    public SimpleService getSimpleService() {
        return simpleService;
    }

    public void setSimpleService(SimpleService simpleService) {
        this.simpleService = simpleService;
    }
   public void sendData(DepositDetails depositDetails){
        simpleService.save(depositDetails);
    }
}
