package com.example.truckHealth.infrastructure.mapper;

import com.example.truckHealth.domain.model.Metric;
import com.example.truckHealth.infrastructure.repository.metric.MetricDto;
import com.example.truckHealth.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface MetricDtoMapper extends EntityToDto<Metric, MetricDto> {

}
