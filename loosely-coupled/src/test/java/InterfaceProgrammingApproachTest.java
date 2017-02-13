import impl.controller.CarBasicController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Michał Szewczyk on 2017-02-13.
 *
 */
public class InterfaceProgrammingApproachTest {
    @Test
    public void testImplementation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        CarBasicController basicController = (CarBasicController) context.getBean("basicController");
        System.out.println(basicController.work());
    }
}
