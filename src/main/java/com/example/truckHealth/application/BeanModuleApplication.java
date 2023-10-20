package com.example.truckHealth.application;

import com.example.truckHealth.application.metric.MetricApplication;
import com.example.truckHealth.application.person.PersonApplication;
import com.example.truckHealth.application.persontruck.PersonTruckApplication;
import com.example.truckHealth.application.truck.TruckApplication;
import com.example.truckHealth.domain.service.metric.MetricService;
import com.example.truckHealth.domain.service.person.PersonService;
import com.example.truckHealth.domain.service.persontruck.PersonTruckService;
import com.example.truckHealth.domain.service.truck.TruckService;
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

  @Bean
  public MetricApplication metricApplication(
      TruckApplication truckApplication,
      PersonApplication personApplication,
      MetricService metricService) {
    return new MetricApplication(truckApplication, personApplication, metricService);
  }
}


