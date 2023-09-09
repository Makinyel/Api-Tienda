package com.example.proyecto.domain.service.persontruck;

import com.example.proyecto.domain.model.PersonTruck;
import java.util.List;

public interface PersonTruckService {

  PersonTruck create(PersonTruck personTruck);

  PersonTruck findById(Long id);

  List<PersonTruck> findAll();


}
