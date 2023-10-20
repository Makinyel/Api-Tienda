package com.example.truckHealth.infrastructure.mapper;

import com.example.truckHealth.domain.model.Truck;
import com.example.truckHealth.infrastructure.repository.truck.TruckDto;
import com.example.truckHealth.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface TruckDtoMapper extends EntityToDto<Truck, TruckDto> {

}
