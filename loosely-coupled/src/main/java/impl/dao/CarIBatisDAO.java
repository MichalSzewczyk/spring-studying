package impl.dao;

import interfaces.CarDAO;


/**
 * Created by Michał Szewczyk on 2017-02-13.
 *
 */
public class CarIBatisDAO implements CarDAO {
    @Override
    public String getName() {
        return "name from IBatis";
    }

    @Override
    public String getId() {
        return "id from IBatis";
    }
}