package com.example.proyecto.infrastructure.mapper;

import com.example.proyecto.domain.model.PersonTruck;
import com.example.proyecto.infrastructure.repository.persontruck.PersonTruckDto;
import com.example.proyecto.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    PersonTruckDtoMapper.class,
    TruckDtoMapper.class
})
public interface PersonTruckDtoMapper extends EntityToDto<PersonTruck, PersonTruckDto> {

}
