package com.example.proyecto.controller;

import com.example.proyecto.model.Category;
import com.example.proyecto.service.category.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

  @Autowired
  private CategoryService categoryService;

  @GetMapping
  public ResponseEntity<List<Category>> findAll() {
    return ResponseEntity.ok(categoryService.findAllCategories());
  }

  @PostMapping
  public Category create(@RequestBody Category category) {
    return categoryService.createCategory(category);
  }

}
