import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.FilteredClass;

import static org.junit.Assert.assertTrue;

/**
 * Created by Michał Szewczyk on 2017-02-08.
 * Tests for annotation based Spring container configuration.
 */
public class SpringComponentsTest {
    @Test
    public void testSpringComponents() {
        try(ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("beans.xml")) {
            FilteredClass filteredClass = ((FilteredClass) configurableApplicationContext.getBean("filteredClass"));
            assertTrue(filteredClass != null);
            System.out.println(filteredClass);
        }
    }
}

