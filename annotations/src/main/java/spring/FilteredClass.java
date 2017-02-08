package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.components.GenericComponentClass;
import spring.components.controller.SpringMVCController;
import spring.components.repository.RepositoryClass;
import spring.components.service.ServiceClass;
import spring.util.ComponentPattern;

/**
 * Created by Michał Szewczyk on 2017-02-08.
 * This class is detected as a Spring component via filtering.
 * It also presents possible ways of autowiring components.
 */

public class FilteredClass extends ComponentPattern {
    //autowired via reflection
    @Autowired
    private SpringMVCController springMVCController;
    //autowired via setter
    private RepositoryClass repositoryClass;
    //autowired via conttructor
    private ServiceClass serviceClass;
    //autowired via reflection using specified qualifier
    @Qualifier("genericComponentWithSpecifiedQualifier")
    @Autowired
    private GenericComponentClass genericComponentClass;

    @Autowired
    FilteredClass(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @Autowired
    public void setRepositoryClass(RepositoryClass repositoryClass) {
        this.repositoryClass = repositoryClass;
    }

    public String toString() {
        return "SpringMVCController: " + springMVCController
                + "\nRepositoryClass: " + repositoryClass
                + "\nServiceClass: " + serviceClass
                + "\nGenericComponentClass: " + genericComponentClass;
    }
}
