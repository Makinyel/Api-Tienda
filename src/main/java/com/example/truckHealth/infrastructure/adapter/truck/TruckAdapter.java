package com.example.truckHealth.infrastructure.adapter.truck;

import com.example.truckHealth.domain.model.Truck;
import com.example.truckHealth.domain.service.truck.TruckService;
import com.example.truckHealth.infrastructure.mapper.TruckDtoMapper;
import com.example.truckHealth.infrastructure.repository.truck.TruckRepository;
import com.example.truckHealth.shared.base.TruckWithPlacaException;
import java.util.List;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TruckAdapter implements TruckService {

  private final TruckRepository truckRepository;
  private final TruckDtoMapper truckMapper;

  @Override
  public Truck createTruck(Truck truck) {
    validatePlaca(truck.getPlaca());
    return truckMapper.toEntity(truckRepository.save(truckMapper.toDto(truck)));
  }

  @Override
  public Truck findById(Long id) {
    return truckRepository.findById(id).map(truckMapper::toEntity).orElse(null);
  }

  @Override
  public List<Truck> findAllTrucks() {
    return truckMapper.toEntity(truckRepository.findAll());
  }

  @Override
  public void editTruck(Truck truck) {
  /*truckRepository.editTruck(truck.getId(),
        truck.getGasOilStatus(),
        truck.getGpsStatus(),
        truck.getStatus());*/

  }

  @Override
  public Truck findByPlaca(String placa) {
    return truckRepository.findByPlaca(placa)
        .map(truckMapper::toEntity).orElse(null);
  }

  private void validatePlaca(String placa) {
    if (Objects.nonNull(placa)) {
      Truck truckresul = truckRepository.findByPlaca(placa)
          .map(truckMapper::toEntity).orElse(null);
      if (Objects.nonNull(truckresul)) {
        throw new TruckWithPlacaException(
            "YA HAY UN CAMION REGISTRADO CON ESTA PLACA " + truckresul.getPlaca());
      }
    }

  }
}

