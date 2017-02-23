import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Michał Szewczyk on 2017-02-16.
 */
public class BeansTests {
    /**
     * It's easy to make a mistake in bean definitions in applicationContext, and information about mistake will be available
     * only after creating bean instead when application is starting.
     */
    @Test(expected = UnsatisfiedDependencyException.class)
    public void testErrorWithUsingLazyInit(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService testService = (TestService) context.getBean("testService");
    }

    /**
     * Application will run properly with broken bean declaration, the exception would  be thrown only in case of using broken bean
     */
    @Test()
    public void testBrokenBeanWithLazyInit(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Assert.assertTrue(true);
    }
    /**
     * Singleton's meaning in case of design pattern, is that only one instance of class is available in program. In case of
     * Spring's singleton definition, it means, that only one instance of COMPONENT is available per one Spring Container.
     * There can be many components of same class.
     */
    @Test
    public void testSingletonPerComponentNotPerClass(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Assert.assertNotSame(context.getBean("sampleSingleton"), context.getBean("secondSampleSingleton"));
    }
    /**
     * Component of scope "singleton" is singleton only in one Spring Container. In case of more spring containers, number of
     * component instances is equals to number of spring containers. There is one component per one Spring Container.
     */
    @Test
    public void testSingletonInManySpringContainers(){
        ApplicationContext contextFirst = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext contextSecond = new ClassPathXmlApplicationContext("applicationContext.xml");
        Assert.assertNotSame(contextFirst.getBean("sampleSingleton"), contextSecond.getBean("sampleSingleton"));
    }
    @Test
    public void testBeanScopes(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SampleComponent component1 = (SampleComponent) context.getBean("sampleSingleton");
        SampleComponent component2 = (SampleComponent) context.getBean("samplePrototype");
        SampleComponent component3 = (SampleComponent) context.getBean("samplePrototype");
        SampleComponent component4 = (SampleComponent) context.getBean("sampleSingleton");
        SampleComponent component5 = (SampleComponent) context.getBean("samplePrototype");
        SampleComponent component6 = (SampleComponent) context.getBean("samplePrototype");
        SampleComponent component7 = (SampleComponent) context.getBean("sampleSingleton");
        //guess how many instances ware created..?


























        Assert.assertEquals(SampleComponent.getInstanceCounter(), 5);
    }

}
