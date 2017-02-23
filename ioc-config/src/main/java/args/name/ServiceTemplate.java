package args.name;

/**
 * Created by Michał Szewczyk on 2017-02-23.
 */

import java.beans.ConstructorProperties;

/**
 * If we use the @ConstructorProperties annotation in base component class, we have to use it also in child component.
 */
public class ServiceTemplate {
    protected String arg1;
    protected String arg2;

    @ConstructorProperties({"arg2", "arg1"})
    public ServiceTemplate(String arg2, String arg1) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
}
