package com.example.truckHealth.domain.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Metric {

  private Long id;
  private String placa;
  private String driver;
  private Truck truck;
  private String event;
  private Person person;
  private String emittedBy;
  private LocalDateTime eventDataTime;
}
