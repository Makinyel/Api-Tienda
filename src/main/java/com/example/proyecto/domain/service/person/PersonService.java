package com.example.proyecto.domain.service.person;


import com.example.proyecto.domain.model.Person;
import java.util.List;

public interface PersonService {

  Person createPerson(Person person);

  List<Person> findAllPersons();
}
