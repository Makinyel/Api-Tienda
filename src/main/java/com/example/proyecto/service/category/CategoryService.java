package com.example.proyecto.service.category;


import com.example.proyecto.model.Category;
import java.util.List;

public interface CategoryService {

  List<Category> findAllCategories();

  Category createCategory(Category category);
}
