package com.example.proyecto.infrastructure.adapter.category;

import com.example.proyecto.infrastructure.mapper.CategoryDtoMapper;
import com.example.proyecto.domain.model.Category;
import com.example.proyecto.domain.service.category.CategoryService;
import com.example.proyecto.infrastructure.repository.category.CategoryRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository categoryRepository;
  private final CategoryDtoMapper categoryDtoMapper;

  @Override
  public List<Category> findAllCategories() {
    return categoryDtoMapper.toEntity(categoryRepository.findAll());
  }

  @Override
  public Category createCategory(Category category) {
    return categoryDtoMapper.toEntity(categoryRepository.save(categoryDtoMapper.toDto(category)));
  }
}

