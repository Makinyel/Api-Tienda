package com.example.truckHealth.infrastructure.api.controller;

import com.example.truckHealth.application.persontruck.PersonTruckApplication;
import com.example.truckHealth.domain.model.PersonTruck;
import com.example.truckHealth.infrastructure.api.dto.PersonTruckRequest;
import com.example.truckHealth.infrastructure.api.mapper.PersonTruckRequestMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person-truck")
@AllArgsConstructor
public class PersonTruckController {

  private PersonTruckApplication personTruckApplication;

  private PersonTruckRequestMapper personTruckRequestMapper;

  @PostMapping
  public ResponseEntity<PersonTruck> create(@RequestBody PersonTruckRequest personTruckRequest) {
    return ResponseEntity.ok(
        personTruckApplication.create(personTruckRequestMapper.toEntity(personTruckRequest)));
  }

}
