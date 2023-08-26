package com.example.proyecto.service.category;

import com.example.proyecto.model.Category;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

  List<Category> categoryList = new ArrayList<>();

  @Override
  public List<Category> findAllCategories() {
    return categoryList;
  }

  @Override
  public Category createCategory(Category category) {
    categoryList.add(category);
    return category;
  }
}

