package spring.components;

import org.springframework.stereotype.Component;

/**
 * Created by Michał Szewczyk on 2017-02-08.
 *
 * @ Service annotated class is a generic Spring component - for any Spring-managed
 *  component.
 */
@Component("genericComponentWithSpecifiedQualifier")
public class GenericComponentClass {
    @Override
    public String toString() {
        return "Object of GenericComponentClass type.";
    }
}
