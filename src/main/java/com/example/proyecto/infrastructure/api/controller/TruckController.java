package com.example.proyecto.infrastructure.api.controller;

import com.example.proyecto.domain.model.Truck;
import com.example.proyecto.domain.service.truck.TruckService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trucks")
@AllArgsConstructor
public class TruckController {

  private final TruckService truckService;

  @PostMapping
  public Truck create(@RequestBody Truck truck) {
    return truckService.createTruck(truck);
  }

  @GetMapping
  public ResponseEntity<List<Truck>> findAll() {
    return ResponseEntity.ok(truckService.findAllTrucks());
  }
}
