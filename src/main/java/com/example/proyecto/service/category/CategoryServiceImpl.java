package com.example.proyecto.service.category;

import com.example.proyecto.model.Category;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

  List<Category> categoryList = new ArrayList<>();

  @Override
  public List<Category> findAllCategories() {
    Category category = new Category(1L, "Alimentos");
    Category category1 = new Category(2L, "Electrodomesticos");
    Category category2 = new Category(3L, "Deporte");
    return Arrays.asList(category, category1, category2);
  }
}

