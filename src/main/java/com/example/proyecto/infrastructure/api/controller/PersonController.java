package com.example.proyecto.infrastructure.api.controller;

import com.example.proyecto.domain.model.Person;
import com.example.proyecto.domain.service.person.PersonService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
@AllArgsConstructor
public class PersonController {

  private final PersonService personService;

  @PostMapping
  public Person create(@RequestBody Person person) {
    return personService.createPerson(person);
  }

  @GetMapping
  public ResponseEntity<List<Person>> findAll() {
    return ResponseEntity.ok(personService.findAllPersons());
  }
}
