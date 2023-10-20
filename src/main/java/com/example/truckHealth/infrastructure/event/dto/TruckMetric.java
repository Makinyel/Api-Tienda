package com.example.truckHealth.infrastructure.event.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TruckMetric {

  private String placa;
  private String event;
  private String driver;
}
