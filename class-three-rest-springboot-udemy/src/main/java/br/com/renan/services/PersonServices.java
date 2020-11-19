package br.com.renan.services;

import java.util.ArrayList;
import java.util.List;
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

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();

        for (int i = 0; i < 10; i++) {
            Person person = mockPerson(i);
            persons.add(person);

        }

        return persons;

    }

    private Person mockPerson(int i) {

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("person name" + i);
        person.setLastName("last name" + i);
        person.setAddress("some addres in Brazil" + i);
        person.setGender("male");
        return person;

    }

}
