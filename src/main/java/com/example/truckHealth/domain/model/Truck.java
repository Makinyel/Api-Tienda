package com.example.truckHealth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Truck {

  private Long id;
  private String placa;
  private String gpsStatus;
  private Float gasOilStatus;
  private String status;
}
