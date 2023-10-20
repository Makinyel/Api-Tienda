package com.example.truckHealth.infrastructure.adapter.persontruck;

import com.example.truckHealth.domain.model.PersonTruck;
import com.example.truckHealth.domain.service.persontruck.PersonTruckService;
import com.example.truckHealth.infrastructure.mapper.PersonTruckDtoMapper;
import com.example.truckHealth.infrastructure.repository.persontruck.PersonTruckRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonTruckAdapter implements PersonTruckService {

  private final PersonTruckRepository personTruckRepository;
  private final PersonTruckDtoMapper personTruckDtoMapper;


  @Override
  public PersonTruck create(PersonTruck personTruck) {
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
