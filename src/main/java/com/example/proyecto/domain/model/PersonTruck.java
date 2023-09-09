package com.example.proyecto.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonTruck {

  private Long id;
  private Person person;
  private Truck truck;

}
