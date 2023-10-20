package com.example.truckHealth.shared.base;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException {


  public NotFoundException(String massage) {
    super(false, HttpStatus.NOT_FOUND, massage, ExceptionCode.NOT_FOUND);
  }
}
