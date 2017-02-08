package spring.util;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Michał Szewczyk on 2017-02-08.
 *
 */
public abstract class ComponentPattern {
    @PostConstruct
    void reportCreation() {
        System.err.println(this.getClass().getSimpleName() + " created.");
    }

    @PreDestroy
    void announceDestruction() {
        System.err.println(this.getClass().getSimpleName() + "SpringMVCController is being destroyed.");
    }
}
