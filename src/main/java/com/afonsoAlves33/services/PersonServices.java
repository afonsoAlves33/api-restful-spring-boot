package com.afonsoAlves33.services;

import com.afonsoAlves33.models.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;


// This annotation combined to @Autowired on the controller class will make this class be auto-instanced in runtime execution
@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findByID(String id){
        logger.info("Finding one person!");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Afonso");
        person.setLastName("Alves");
        person.setAddress("Campinas, São Paulo");
        person.setGender("Macho Alfa");
        return person;
    }
}
