package com.example.proyecto.model;

import java.util.List;
import lombok.Data;

@Data
public class Product {

  private Long id;
  private String name;
  private Float price;
  private String sku;
  private List<Category> categoryList;

  public Product(Long id, String name, Float price, String sku, List<Category> categoryList) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.sku = sku;
    this.categoryList = categoryList;
  }
}
