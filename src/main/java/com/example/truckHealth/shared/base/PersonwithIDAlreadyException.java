package com.example.truckHealth.shared.base;

import org.springframework.http.HttpStatus;

public class PersonwithIDAlreadyException extends BaseException {


  public PersonwithIDAlreadyException(String massage) {
    super(false, HttpStatus.CONFLICT, massage,
        ExceptionCode.PERSON_WITH_ID_IS_REGISTERED_ALREADY);
  }
}
