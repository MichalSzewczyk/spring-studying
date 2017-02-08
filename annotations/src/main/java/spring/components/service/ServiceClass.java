package spring.components.service;

import org.springframework.stereotype.Service;
import spring.util.ComponentPattern;

/**
 * Created by Michał Szewczyk on 2017-02-08.
 *
 * @ Service annotated class is a Spring component from service layer.
 */
@Service
public class ServiceClass extends ComponentPattern {
    @Override
    public String toString() {
        return "Object of ServiceClass type.";
    }
}
