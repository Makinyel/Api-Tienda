package com.example.proyecto.infrastructure.adapter.persontruck;

import com.example.proyecto.domain.model.Person;
import com.example.proyecto.domain.model.PersonTruck;
import com.example.proyecto.domain.model.Truck;
import com.example.proyecto.domain.service.person.PersonService;
import com.example.proyecto.domain.service.persontruck.PersonTruckService;
import com.example.proyecto.domain.service.truck.TruckService;
import com.example.proyecto.infrastructure.mapper.PersonTruckDtoMapper;
import com.example.proyecto.infrastructure.repository.persontruck.PersonTruckRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonTruckAdapter implements PersonTruckService {

  private final PersonTruckRepository personTruckRepository;
  private final PersonTruckDtoMapper personTruckDtoMapper;
  private final PersonService personService;
  private final TruckService truckService;

  @Override
  public PersonTruck create(PersonTruck personTruck) {

    Person person = personService.findById(personTruck.getPerson().getId());
    Truck truck = truckService.findById(personTruck.getTruck().getId());

    personTruck.setPerson(person);
    personTruck.setTruck(truck);

    return personTruckDtoMapper.toEntity(
        personTruckRepository.save(personTruckDtoMapper.toDto(personTruck)));
  }

  @Override
  public PersonTruck findById(Long id) {
    return personTruckRepository.findById(id).map(personTruckDtoMapper::toEntity).orElse(null);
  }

  @Override
  public List<PersonTruck> findAll() {
    return personTruckDtoMapper.toEntity(personTruckRepository.findAll());
  }
}
