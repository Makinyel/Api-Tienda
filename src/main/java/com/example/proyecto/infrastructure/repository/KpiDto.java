package com.example.proyecto.infrastructure.repository;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "KPI")
public class KpiDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  @Column(name = "name_kpi")
  private String nameKpi;
  @Column(name = "initial_value")
  private String initialValue;
  @Column(name = "objective_value")
  private String objectiveValue;
  @Column(name = "minimum_value")
  private String minimumValue;
  @Column(name = "maximum_value")
  private String maximumValue;
  @OneToOne
  @JoinColumn(name = "key_result_id")
  private KeyResultDto keyResult;
}
