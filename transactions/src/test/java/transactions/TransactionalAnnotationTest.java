package transactions;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Michał Szewczyk on 2017-02-03.
 *
 */
public class TransactionalAnnotationTest {
    private static ApplicationContext ctx;

    @Before
    public void createContext() {

        ctx = new ClassPathXmlApplicationContext("META-INF/beans.xml");
    }

    @Test
    public void testTransactionalAnnotation() throws Exception {
        TransactionalAnnotationSample transactionalAnnotationSample = TransactionalAnnotationSample.class.cast(ctx.getBean("sampleTransaction"));
        transactionalAnnotationSample.prepareDatabase();
        transactionalAnnotationSample.sampleTransaction();
    }
}
