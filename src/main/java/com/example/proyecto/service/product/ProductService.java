package com.example.proyecto.service.product;


import com.example.proyecto.model.Product;
import java.util.List;

public interface ProductService {

  Product createProducts(Product product);

  List<Product> findAllProducts();
}
