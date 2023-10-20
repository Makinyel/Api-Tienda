package com.example.truckHealth.infrastructure.repository.person;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonDto, Long> {

  Optional<PersonDto> findByNumberId(String numberId);

  @Query("SELECT p FROM PersonDto  p WHERE p.name = ?1")
  Optional<PersonDto> findByName(String name);
}
