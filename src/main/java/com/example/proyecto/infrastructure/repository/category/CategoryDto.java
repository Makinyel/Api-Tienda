package com.example.proyecto.infrastructure.repository.category;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CategoryDto {

  @Id
  private Long id;
  private String name;
}
