package other;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 */
public class JpaDao implements Dao{
    @Override
    public String method() {
        return "connected using JPA";
    }

    @Override
    public void setDaoAdditionalInfo(DaoAdditionalInfo daoAdditionalInfo) {
        throw new UnsupportedOperationException();
    }
}
