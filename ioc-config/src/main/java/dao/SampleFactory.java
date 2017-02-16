package dao;

/**
 * Created by Michał Szewczyk on 2017-02-14.
 */
public class SampleFactory {
    private SampleFactory(){}

    public static AbstractDAO getInstance(DaoValues value){
        switch(value) {
            case DERBY:
                return new DerbyDAO();
            case HIBERNATE:
                return new HibernateDAO();
            default:
                throw new RuntimeException("Not supported DAO type.");
        }
    }
}
