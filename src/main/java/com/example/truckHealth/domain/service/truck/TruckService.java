package com.example.truckHealth.domain.service.truck;


import com.example.truckHealth.domain.model.Truck;
import java.util.List;

public interface TruckService {

  Truck createTruck(Truck truck);

  Truck findById(Long id);

  List<Truck> findAllTrucks();

  void editTruck(Truck truck);

  Truck findByPlaca(String placa);
}
