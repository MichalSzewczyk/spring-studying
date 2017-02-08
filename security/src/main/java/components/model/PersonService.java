package components.model;

/**
 * Created by Michał Szewczyk on 2017-02-03.
 *
 */
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private List<Person> persons = new ArrayList<>();

    public PersonService() {
        persons.add(new Person("Adam", 10));
        persons.add(new Person("Albert", 20));
        persons.add(new Person("Abdullah", 30));
    }

    public List<Person> fetchAllPersons(){
        return persons;
    }
}
