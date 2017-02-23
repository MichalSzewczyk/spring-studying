package inheritance.concrete;

/**
 * Created by Michał Szewczyk on 2017-02-21.
 */
public class SampleService extends TemplateService{
    private String name;

    public SampleService(String name, MessagingService... services) {
        super(services);
        this.name = name;
    }
}
