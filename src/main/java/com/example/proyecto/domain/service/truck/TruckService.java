package com.example.proyecto.domain.service.truck;


import com.example.proyecto.domain.model.Truck;
import java.util.List;

public interface TruckService {

  Truck createTruck(Truck truck);
  List<Truck> findAllTrucks();
}
