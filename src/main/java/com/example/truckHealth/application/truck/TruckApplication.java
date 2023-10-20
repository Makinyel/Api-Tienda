package com.example.truckHealth.application.truck;

import com.example.truckHealth.domain.model.Truck;
import com.example.truckHealth.domain.service.truck.TruckService;
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

  public Truck findById(Long id) {
    return truckService.findById(id);
  }

  public void editTruck(Truck truck) {
    truckService.editTruck(truck);
  }

  public Truck findByPlaca(String placa) {
    return truckService.findByPlaca(placa);
  }

}
