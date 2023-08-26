package com.example.proyecto.domain.service.product;


import com.example.proyecto.domain.model.Product;
import java.util.List;

public interface ProductService {

  Product createProducts(Product product);

  List<Product> findAllProducts();
}
