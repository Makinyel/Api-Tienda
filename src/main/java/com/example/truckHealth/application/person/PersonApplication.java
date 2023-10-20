package com.example.truckHealth.application.person;

import com.example.truckHealth.domain.model.Person;
import com.example.truckHealth.domain.service.person.PersonService;
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

  public Person findByName(String name) {
    return personService.findByName(name);
  }


  public Person findById(Long id) {
    return personService.findById(id);
  }

}
