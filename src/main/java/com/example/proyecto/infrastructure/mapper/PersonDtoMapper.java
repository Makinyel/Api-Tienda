package com.example.proyecto.infrastructure.mapper;

import com.example.proyecto.domain.model.Person;
import com.example.proyecto.infrastructure.repository.person.PersonDto;
import com.example.proyecto.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface PersonDtoMapper extends EntityToDto<Person, PersonDto> {

}
