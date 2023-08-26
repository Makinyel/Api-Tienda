package com.example.proyecto.domain.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

  private Long id;
  private String name;
  private Float price;
  private String sku;
  private List<Category> categoryList;

}
