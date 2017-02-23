package inheritance.concrete;

/**
 * Created by Michał Szewczyk on 2017-02-21.
 */
public class TemplateService implements Service{
    private MessagingService[] services;
    @Override
    public String method() {
        return "works!";
    }

    public TemplateService(MessagingService... services) {
        this.services = services;
    }
}
