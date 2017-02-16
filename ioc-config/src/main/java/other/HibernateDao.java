package other;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 */
public class HibernateDao implements Dao {
    private DaoAdditionalInfo daoAdditionalInfo;
    @Override
    public String method() {
        return "connected using Hibernate"+(daoAdditionalInfo==null?"": String.valueOf(daoAdditionalInfo));
    }

    public void setDaoAdditionalInfo(DaoAdditionalInfo daoAdditionalInfo) {
        this.daoAdditionalInfo = daoAdditionalInfo;
    }
}
