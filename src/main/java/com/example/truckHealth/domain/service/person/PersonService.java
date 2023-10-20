package com.example.truckHealth.domain.service.person;


import com.example.truckHealth.domain.model.Person;
import java.util.List;

public interface PersonService {

  Person createPerson(Person person);

  Person findById(Long id);

  List<Person> findAllPersons();
  Person findByName(String name);
}
