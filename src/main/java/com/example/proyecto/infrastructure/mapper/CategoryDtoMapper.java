package com.example.proyecto.infrastructure.mapper;

import com.example.proyecto.domain.model.Category;
import com.example.proyecto.infrastructure.repository.category.CategoryDto;
import com.example.proyecto.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CategoryDtoMapper extends EntityToDto<Category, CategoryDto> {

}
