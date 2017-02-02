package ioc;

import ioc.multiple_services_fixed.CarController;
import ioc.mybank_fixed.FixedDepositController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

/**
 * Created by Michał Szewczyk on 2017-02-02.
 */
public class IoCTests {
    ApplicationContext ctx;
    @Before
    public void createContext(){
        ctx = new ClassPathXmlApplicationContext("META-INF/beans.xml");
    }
    @Test
    public void testMyBank(){
        FixedDepositController myController = FixedDepositController.class.cast(ctx.getBean("myController"));
        assertTrue(myController.submit());
    }
    @Test
    public void testCar(){
        CarController carController = CarController.class.cast(ctx.getBean("carController"));
        assertTrue(carController.run());
    }
}
