import args.debug.ServiceInterface;
import args.different.SampleController;
import args.matching.MainController;
import args.name.NameBasedService;
import combining.BankingService;
import constructor.Car;
import factory.Controller;
import inheritance.nonconcrete.BiggerBankController;
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
    public void nameBasedBeanFactoryMethod(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceInterface serviceInterface = (ServiceInterface) context.getBean("firstServiceWorks");
        Assert.assertEquals("works!", serviceInterface.method());
    }
    @Test
    public void nameBasedBeanConstructorConfigWithInheritance(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        args.name.BankingService nameBasedService = (args.name.BankingService) context.getBean("otherBankingService");
        Assert.assertEquals("value1", nameBasedService.getArg1());
        Assert.assertEquals("value2", nameBasedService.getArg2());
        Assert.assertEquals("value3", nameBasedService.getArg3());
    }
    @Test
    public void nameBasedBeanConstructorConfig(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        NameBasedService nameBasedService = (NameBasedService) context.getBean("nameBasedService");
        Assert.assertEquals("value1", nameBasedService.getArg1());
        Assert.assertEquals("value2", nameBasedService.getArg2());
        Assert.assertEquals("value3", nameBasedService.getArg3());
    }

    @Test
    public void matchingArgumentsBasedOnRelatedTypes(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MainController sampleController = (MainController) context.getBean("mController");
    }
    @Test
    public void automaticArgumentsDetection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        args.detection.SampleController sampleController = (args.detection.SampleController) context.getBean("sampleController");
        Assert.assertTrue(sampleController.getFirstService() != null && sampleController.getSecondService() != null);
    }

    @Test
    public void testDifferentArguments() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SampleController otherController = (SampleController) context.getBean("sController");
        Assert.assertTrue(otherController.isProperlyCreated(10));
    }

    @Test
    public void testFactoryMethodInheritance() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Controller otherController = (Controller) context.getBean("otherController");
        Assert.assertEquals("OtherController", otherController.method());
    }

    @Test
    public void beanNonAbstractParentInheritance() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        inheritance.concrete.SampleService sampleService = (inheritance.concrete.SampleService) context.getBean("sampleService");
        Assert.assertEquals(sampleService.method(), "works!");
    }

    @Test
    public void beanInheritance() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BiggerBankController biggerBankController = (BiggerBankController) context.getBean("biggerBankController");
        Assert.assertEquals(String.valueOf(biggerBankController), "works!");
    }

    @Test
    public void testFactoryMethod() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SampleService service = (SampleService) context.getBean("service");
        Assert.assertTrue(service.work().startsWith("works in"));
        System.out.println(service.work());
    }

    @Test
    public void testConfiguringObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessagingClass msg = (MessagingClass) context.getBean("messagingClass");
        Assert.assertEquals(msg.getId(), 7);
    }

    @Test
    public void testCreatingAdvancedBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dao hibernateDao = (Dao) context.getBean("hibernateOtherDao");
        System.out.println(hibernateDao.method());
    }

    @Test
    public void testConstructorBasedConfig() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car);
    }

    @Test
    public void testMixedConfig() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BankingService service = (BankingService) context.getBean("bankingService");
        System.out.println(service);
    }
}
