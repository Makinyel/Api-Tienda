package com.example.proyecto.application.truck;

import com.example.proyecto.domain.model.Person;
import com.example.proyecto.domain.model.Truck;
import com.example.proyecto.domain.service.truck.TruckService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TruckApplication {

  private final TruckService truckService;

  public Truck create(Truck truck) {
    return truckService.createTruck(truck);
  }

  public List<Truck> findAll() {
    return truckService.findAllTrucks();
  }

}
