package br.com.renan.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import br.com.renan.model.Person;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Renan");
        person.setLastName("moura");
        person.setAddress("parajuru");
        person.setGender("masculino");

        return person;

    }

}
