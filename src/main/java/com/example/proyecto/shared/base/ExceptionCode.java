package com.example.proyecto.shared.base;

import lombok.Getter;

@Getter
public enum ExceptionCode {

  NOT_FOUND("1", "NOT_FOUND"),
  TRUCK_WITH_PLACA_IS_REGISTERED_ALREADY("2", "TRUCK_WITH_PLACA_IS_REGISTERED_ALREADY"),
  PERSON_WITH_ID_IS_REGISTERED_ALREADY("3", "PERSON_WITH_ID_IS_REGISTERED_ALREADY");
  private final String code;
  private final String type;


  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }

  public String getCode() {
    return code;
  }

  public String getType() {
    return type;
  }


}
