package dao;

/**
 * Created by Michał Szewczyk on 2017-02-14.
 */
public class HibernateDAO implements AbstractDAO {
    @Override
    public String method() {
        return "works in hibernate";
    }
}
