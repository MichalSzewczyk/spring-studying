import combining.BankingService;
import combining.EmailMessageSender;
import constructor.Car;
import msg.MessagingClass;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import other.Dao;
import service.SampleService;

/**
 * Created by Michał Szewczyk on 2017-02-14.
 */
public class ApplicationContextTests {
    @Test
    public void testFactoryMethod(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SampleService service = (SampleService) context.getBean("service");
        Assert.assertTrue(service.work().startsWith("works in"));
        System.out.println(service.work());
    }
    @Test
    public void testConfiguringObject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessagingClass msg = (MessagingClass) context.getBean("messagingClass");
        Assert.assertEquals(msg.getId(),7);
    }
    @Test
    public void testCreatingAdvancedBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dao hibernateDao = (Dao) context.getBean("hibernateOtherDao");
        System.out.println(hibernateDao.method());
    }
    @Test
    public void testConstructorBasedConfig(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car);
    }
    @Test
    public void testMixedConfig(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BankingService service = (BankingService) context.getBean("bankingService");
        System.out.println(service);
    }
}
