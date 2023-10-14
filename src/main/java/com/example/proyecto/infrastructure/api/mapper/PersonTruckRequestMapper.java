package com.example.proyecto.infrastructure.api.mapper;

import com.example.proyecto.domain.model.PersonTruck;
import com.example.proyecto.infrastructure.api.dto.PersonTruckRequest;
import com.example.proyecto.infrastructure.mapper.PersonDtoMapper;
import com.example.proyecto.infrastructure.mapper.TruckDtoMapper;
import com.example.proyecto.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING,
    uses = {
        PersonDtoMapper.class,
        TruckDtoMapper.class
    }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PersonTruckRequestMapper extends EntityToDto<PersonTruck, PersonTruckRequest> {

  @Mapping(source = "personId", target = "person.id")
  @Mapping(source = "truckId", target = "truck.id")
  PersonTruck toEntity(PersonTruckRequest personTruckRequest);
}
