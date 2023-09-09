package com.example.proyecto.infrastructure.api.controller;

import com.example.proyecto.application.person.PersonApplication;
import com.example.proyecto.domain.model.Person;
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

  private final PersonApplication personApplication;

  @PostMapping
  public ResponseEntity<Person> create(@RequestBody Person person) {
    return ResponseEntity.ok(personApplication.create(person));
  }

  @GetMapping
  public ResponseEntity<List<Person>> findAll() {
    return ResponseEntity.ok(personApplication.findAll());
  }
}
