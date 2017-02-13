package impl.dao;

import interfaces.CarDAO;

/**
 * Created by Michał Szewczyk on 2017-02-13.
 *
 */
public class CarHibernateDAO implements CarDAO {
    @Override
    public String getName() {
        return "name from Hibernate";
    }

    @Override
    public String getId() {
        return "id from Hibernate";
    }
}
