package com.example.truckHealth.infrastructure.repository.persontruck;

import com.example.truckHealth.infrastructure.repository.person.PersonDto;
import com.example.truckHealth.infrastructure.repository.truck.TruckDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PERSON_TRUCK")
public class PersonTruckDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "person_id", referencedColumnName = "id")
  private PersonDto person;
  @ManyToOne
  @JoinColumn(name = "trcuk_id", referencedColumnName = "id")
  private TruckDto truck;

}
