package other;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 */
public class DaoFactory {
    public Dao getDao(String daoType){
        switch(daoType){
            case "hibernate":
                return new HibernateDao();
            case "jpa":
                return new JpaDao();
            default:
                throw new IllegalArgumentException("Wrong dao type.");
        }
    }
}
