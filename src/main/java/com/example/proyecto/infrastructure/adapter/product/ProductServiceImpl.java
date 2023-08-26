package com.example.proyecto.infrastructure.adapter.product;

import com.example.proyecto.domain.model.Category;
import com.example.proyecto.domain.model.Product;
import com.example.proyecto.domain.service.product.ProductService;
import com.example.proyecto.infrastructure.adapter.category.CategoryServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  private final CategoryServiceImpl categoryServiceImpl;

  @Autowired
  public ProductServiceImpl(CategoryServiceImpl categoryServiceImpl) {
    this.categoryServiceImpl = categoryServiceImpl;
  }

  List<Product> productList = new ArrayList<>();

  @Override
  public Product createProducts(Product product) {
    List<Category> categoryList = categoryServiceImpl.findAllCategories();
    product.setCategoryList(categoryList);
    productList.add(product);
    return product;
  }

  @Override
  public List<Product> findAllProducts() {
    return productList;
  }
}

