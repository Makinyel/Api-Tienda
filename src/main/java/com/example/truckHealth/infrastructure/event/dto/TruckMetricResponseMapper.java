package com.example.truckHealth.infrastructure.event.dto;

import com.example.truckHealth.domain.model.Metric;
import com.example.truckHealth.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface TruckMetricResponseMapper extends EntityToDto<Metric, TruckMetric> {
}
