package com.example.proyecto.domain.service.category;


import com.example.proyecto.domain.model.Category;
import java.util.List;

public interface CategoryService {

  List<Category> findAllCategories();

  Category createCategory(Category category);
}
