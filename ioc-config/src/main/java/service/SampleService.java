package service;

import dao.AbstractDAO;

/**
 * Created by Michał Szewczyk on 2017-02-14.
 */
public class SampleService {
    AbstractDAO dao;
    public String work(){
        return dao.method();
    }

    public void setDao(AbstractDAO dao) {
        this.dao = dao;
    }
}
