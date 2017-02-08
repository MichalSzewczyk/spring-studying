package spring.components.repository;

import org.springframework.stereotype.Repository;
import spring.util.ComponentPattern;

/**
 * Created by Michał Szewczyk on 2017-02-08.
 *
 * @ Repository annotated class is a class from persistence layer.
 *      It is used for DAO objects.
 */
@Repository
public class RepositoryClass extends ComponentPattern {
    @Override
    public String toString() {
        return "Object of RepositoryClass type.";
    }
}
