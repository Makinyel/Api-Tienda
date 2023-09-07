package com.example.proyecto.infrastructure.mapper;

import com.example.proyecto.domain.model.Truck;
import com.example.proyecto.infrastructure.repository.truck.TruckDto;
import com.example.proyecto.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface TruckDtoMapper extends EntityToDto<Truck, TruckDto> {

}
