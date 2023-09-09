package com.example.proyecto.domain.service.truck;


import com.example.proyecto.domain.model.Truck;
import java.util.List;

public interface TruckService {

  Truck createTruck(Truck truck);

  Truck findById(Long id);

  List<Truck> findAllTrucks();
}
