package spring.components.controller;

import org.springframework.stereotype.Controller;
import spring.util.ComponentPattern;

/**
 * Created by Michał Szewczyk on 2017-02-08.
 *
 * @ Controller annotated class is a Spring MVC controller - used as a stereotype
 *      for presentation layer components.
 */
@Controller
public class SpringMVCController extends ComponentPattern {
    @Override
    public String toString() {
        return "Object of SpringMVCController type.";
    }
}
