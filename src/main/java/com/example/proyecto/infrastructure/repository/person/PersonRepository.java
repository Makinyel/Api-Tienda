package com.example.proyecto.infrastructure.repository.person;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonDto, Long> {

  Optional<PersonDto> findByNumberId(String numberId);
}
