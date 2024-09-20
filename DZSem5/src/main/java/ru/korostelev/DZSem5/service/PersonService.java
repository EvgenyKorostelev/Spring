package ru.korostelev.DZSem5.service;

import org.springframework.stereotype.Service;
import ru.korostelev.DZSem5.entity.Person;

import java.util.List;
import java.util.Optional;

@Service
public interface PersonService {

    Person addPerson(Person person);

    Optional<Person> findPersonById(Integer id);

    List<Person> findAllPersons();

    Person updatePersonById(Integer id, Person person);

    void deletePersonById(Integer id);
}
