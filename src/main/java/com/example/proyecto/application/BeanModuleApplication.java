package com.example.proyecto.application;

import com.example.proyecto.application.person.PersonApplication;
import com.example.proyecto.application.persontruck.PersonTruckApplication;
import com.example.proyecto.application.truck.TruckApplication;
import com.example.proyecto.domain.service.person.PersonService;
import com.example.proyecto.domain.service.persontruck.PersonTruckService;
import com.example.proyecto.domain.service.truck.TruckService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {

  @Bean
  public PersonApplication personApplication(PersonService personService) {
    return new PersonApplication(personService);
  }

  @Bean
  public TruckApplication truckApplication(TruckService truckService) {
    return new TruckApplication(truckService);
  }

  @Bean
  public PersonTruckApplication personTruckApplication(
      PersonTruckService personTruckService, PersonApplication personApplication,
      TruckApplication truckApplication) {
    return new PersonTruckApplication(personTruckService, personApplication, truckApplication);
  }
}


