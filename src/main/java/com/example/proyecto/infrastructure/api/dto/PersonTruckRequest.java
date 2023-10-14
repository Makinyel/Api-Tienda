package com.example.proyecto.infrastructure.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonTruckRequest {

  private Long personId;
  private Long truckId;
}
