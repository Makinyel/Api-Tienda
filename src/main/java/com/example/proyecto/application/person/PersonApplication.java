package com.example.proyecto.application.person;

import com.example.proyecto.domain.model.Person;
import com.example.proyecto.domain.service.person.PersonService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonApplication {

  private final PersonService personService;

  public Person create(Person person) {
    return personService.createPerson(person);
  }

  public List<Person> findAll() {
    return personService.findAllPersons();
  }

}
