package ru.korostelev.DZSem5.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.korostelev.DZSem5.entity.Person;
import ru.korostelev.DZSem5.repository.PersonRepository;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
public class PersonServiceImp implements PersonService{

    private final PersonRepository personRepository;

    @Override
    public Person addPerson(Person person){
        return personRepository.save(person);
    }

    @Override
    public Optional<Person> findPersonById(Integer id){
        return personRepository.findById(id);
    }

    @Override
    public List<Person> findAllPersons(){
        return personRepository.findAll();
    }

    @Override
    public Person updatePersonById(Integer id, Person person){
        Optional<Person> oldPerson = findPersonById(id);
        if(oldPerson.isPresent()){
        Person updatedPerson = oldPerson.get();
        updatedPerson.setName(person.getName());
        updatedPerson.setAge(person.getAge());
        return personRepository.save(updatedPerson);
        } else{
            return null;
        }
    }

    @Override
    public void deletePersonById(Integer id){
        personRepository.deleteById(id);
    }
}
