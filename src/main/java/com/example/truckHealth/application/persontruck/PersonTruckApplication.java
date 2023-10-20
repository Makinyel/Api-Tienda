package com.example.truckHealth.application.persontruck;

import com.example.truckHealth.application.person.PersonApplication;
import com.example.truckHealth.application.truck.TruckApplication;
import com.example.truckHealth.domain.model.Person;
import com.example.truckHealth.domain.model.PersonTruck;
import com.example.truckHealth.domain.model.Truck;
import com.example.truckHealth.domain.service.persontruck.PersonTruckService;
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
