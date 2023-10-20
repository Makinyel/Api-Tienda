package com.example.truckHealth.infrastructure.mapper;

import com.example.truckHealth.domain.model.Person;
import com.example.truckHealth.infrastructure.repository.person.PersonDto;
import com.example.truckHealth.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface PersonDtoMapper extends EntityToDto<Person, PersonDto> {

}
