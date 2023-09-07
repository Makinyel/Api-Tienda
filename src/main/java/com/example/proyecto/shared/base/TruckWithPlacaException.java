package com.example.proyecto.shared.base;

import org.springframework.http.HttpStatus;

public class TruckWithPlacaException extends BaseException {


  public TruckWithPlacaException(String massage) {
    super(false, HttpStatus.CONFLICT, massage,
        ExceptionCode.TRUCK_WITH_PLACA_IS_REGISTERED_ALREADY);
  }
}
