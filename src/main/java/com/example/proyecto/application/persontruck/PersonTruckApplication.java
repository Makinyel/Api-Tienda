package com.example.proyecto.application.persontruck;

import com.example.proyecto.application.person.PersonApplication;
import com.example.proyecto.application.truck.TruckApplication;
import com.example.proyecto.domain.model.Person;
import com.example.proyecto.domain.model.PersonTruck;
import com.example.proyecto.domain.model.Truck;
import com.example.proyecto.domain.service.persontruck.PersonTruckService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonTruckApplication {

  private final PersonTruckService personTruckService;
  private final PersonApplication personApplication;
  private final TruckApplication truckApplication;

  public PersonTruck create(PersonTruck personTruck) {

    Person person = personApplication.findById(personTruck.getPerson().getId());
    Truck truck = truckApplication.findById(personTruck.getTruck().getId());

    personTruck.setPerson(person);
    personTruck.setTruck(truck);
    return personTruckService.create(personTruck);
  }
}
