package com.example.proyecto.service.product;

import com.example.proyecto.model.Category;
import com.example.proyecto.model.Product;
import com.example.proyecto.service.category.CategoryServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private CategoryServiceImpl categoryServiceImpl;

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

