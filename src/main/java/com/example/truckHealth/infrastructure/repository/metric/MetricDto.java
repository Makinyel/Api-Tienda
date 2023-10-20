package com.example.truckHealth.infrastructure.repository.metric;

import com.example.truckHealth.infrastructure.repository.person.PersonDto;
import com.example.truckHealth.infrastructure.repository.truck.TruckDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "METRIC")
public class MetricDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String event;
  @ManyToOne
  @JoinColumn(name = "person_id", referencedColumnName = "id")
  private PersonDto person;
  @ManyToOne
  @JoinColumn(name = "trcuk_id", referencedColumnName = "id")
  private TruckDto truck;
  private String placa;
  private String driver;
  @Column(name = "emitted_By")
  private String emittedBy;
  @Column(name = "event_data_time")
  private LocalDateTime eventDataTime;

}
