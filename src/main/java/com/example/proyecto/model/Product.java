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

}
