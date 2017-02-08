package components.controller;

/**
 * Created by Michał Szewczyk on 2017-02-03.
 *
 */
import java.util.Map;

import components.model.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//TODO: implement authentication
@Controller
public class PersonController {

    private PersonService personService;

    PersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/allpersons")
    public String showPersonListPage(Map<String, Object> model) {
        System.out.println(getPersonService().fetchAllPersons());
        model.put("persons", getPersonService().fetchAllPersons());
        return "person_list";
    }

}