package com.example.proyecto.infrastructure.repository;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "KEY_RESULT")
public class KeyResultDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "title")
  private String title;
  @Column(name = "description")
  private String description;
  @OneToOne(mappedBy = "keyResult", cascade = CascadeType.ALL)
  private KpiDto kpi;
  @Column(name = "initial_date")
  private LocalDate initialDate;
  @Column(name = "end_date")
  private LocalDate endDate;
  @Column(name = "deleted")
  private Boolean deleted;
  @Column(name = "created_date")
  private LocalDateTime createdDate;
  @Column(name = "created_at")
  private String createdAt;
  @Column(name = "updated_date")
  private LocalDateTime updatedDate;
  @Column(name = "updated_at")
  private String updatedAt;
}
