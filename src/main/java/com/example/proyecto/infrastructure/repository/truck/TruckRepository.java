package com.example.proyecto.infrastructure.repository.truck;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<TruckDto, Long> {

  Optional<TruckDto> findByPlaca(String placa);

}
