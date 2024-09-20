package ru.korostelev.DZSem5.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.korostelev.DZSem5.controller.payload.NewPersonPayload;
import ru.korostelev.DZSem5.controller.payload.UpdatePersonPayload;
import ru.korostelev.DZSem5.entity.Person;
import ru.korostelev.DZSem5.service.PersonService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public Person create(NewPersonPayload payload){
        return personService.addPerson(new Person(null, payload.name(), payload.age()));
    }

    @GetMapping("/{id}")
    public Person findPersonById(@PathVariable Integer id){
        return personService.findPersonById(id).get();
    }

    @GetMapping("/list")
    public List<Person> findAllPersons(){
        return personService.findAllPersons();
    }

    @PostMapping("/{id}")
    public Person updatePersonById(@PathVariable Integer id, UpdatePersonPayload payload)
}
