package com.example.truckHealth.infrastructure.mapper;

import com.example.truckHealth.domain.model.PersonTruck;
import com.example.truckHealth.infrastructure.repository.persontruck.PersonTruckDto;
import com.example.truckHealth.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    PersonTruckDtoMapper.class,
    TruckDtoMapper.class
})
public interface PersonTruckDtoMapper extends EntityToDto<PersonTruck, PersonTruckDto> {

}
