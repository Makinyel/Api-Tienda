package com.example.proyecto.infrastructure.repository.persontruck;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonTruckRepository extends JpaRepository<PersonTruckDto, Long> {

}
