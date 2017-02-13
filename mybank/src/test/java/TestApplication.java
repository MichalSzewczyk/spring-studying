import app.controllers.SimpleController;
import app.model.DepositDetails;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Michał Szewczyk on 2017-02-10.
 *
 */
public class TestApplication {
    @Test
    public void testApplication(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("WEB-INF/beans.xml");
        SimpleController simpleController = (SimpleController) applicationContext.getBean("simpleController");
        DepositDetails depositDetails = new DepositDetails();
        depositDetails.setUserID("Foo");
        depositDetails.setAmount(10);
        simpleController.sendData(depositDetails);


    }



}
