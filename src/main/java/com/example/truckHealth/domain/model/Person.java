package com.example.truckHealth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

  private Long id;
  private String name;
  private String lastName;
  private String numberId;

}
