package com.example.truckHealth.application.metric;

import com.example.truckHealth.application.person.PersonApplication;
import com.example.truckHealth.application.truck.TruckApplication;
import com.example.truckHealth.domain.model.Metric;
import com.example.truckHealth.domain.model.Person;
import com.example.truckHealth.domain.model.Truck;
import com.example.truckHealth.domain.service.metric.MetricService;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class MetricApplication {

  private final TruckApplication truckApplication;
  private final PersonApplication personApplication;
  private final MetricService metricService;


  public static Map<String, Thread> mapThereads = new HashMap<>();

  public void processMetric(Metric metric) {
    String placa = metric.getPlaca();

    if (mapThereads.containsKey(placa)) {
      Thread existingThread = mapThereads.get(placa);
      processMetricInThread(existingThread, metric);
    } else {
      Thread hilo = new Thread(() -> {
        processMetricInThread(Thread.currentThread(), metric);
      });
      mapThereads.put(placa, hilo);
      hilo.start();
    }
  }

  private void processMetricInThread(Thread thread, Metric metric) {
    log.info("Processing metric in thread: " + thread.getName());

    Truck truck = truckApplication.findByPlaca(metric.getPlaca());
    Person person = personApplication.findByName(metric.getDriver());
    metric.setTruck(truck);
    metric.setPerson(person);

    metricService.saveMetric(metric);
  }
}
