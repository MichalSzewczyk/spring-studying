package transactions;

import dao.CarDAO;
import management.DatabaseManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Michał Szewczyk on 2017-02-03.
 * Transactional - is an annotation used to mark whole class or method. For classes and methods marked with this annotation
 *      Spring will perform automation management features. By using Transactional annotation we receive possibility to run
 *      transactions in declarative way, instead of programmatic. Declarative means, that the only thing, which is important
 *      for us, is business logic of transaction. Spring will take care of transaction management. All we have to do is to
 *      provide transaction advice (using AOP) via XML configuration in spring context.
 */
public class TransactionalAnnotationSample {
    private CarDAO carDAO;
    private DatabaseManagement databaseManagement = new DatabaseManagement();

    public void setCarDAO(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    void prepareDatabase(){
        databaseManagement.setupDerbyDatabase();
    }
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    void sampleTransaction() throws Exception {
        System.out.println("Transaction results:");
        carDAO.listCars().forEach(System.out::println);
    }
}
