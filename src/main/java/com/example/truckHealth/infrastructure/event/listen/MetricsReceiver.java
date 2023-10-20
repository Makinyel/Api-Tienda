package com.example.truckHealth.infrastructure.event.listen;

import com.example.truckHealth.application.metric.MetricApplication;
import com.example.truckHealth.domain.model.Metric;
import com.example.truckHealth.infrastructure.event.dto.TruckMetric;
import com.example.truckHealth.infrastructure.event.dto.TruckMetricResponseMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class MetricsReceiver {

  private final MetricApplication metricApplication;
  private final TruckMetricResponseMapper truckMetricResponseMapper;
  private final ObjectMapper objectMapper;

  @RabbitListener(queues = "metrics")
  public void receiveMessage(String message) throws JsonProcessingException {
    log.info("Received message:  [{}]", message);
    TruckMetric truckMetric = objectMapper.readValue(message, TruckMetric.class);
    log.info("Received message for truck placa: [{}]", truckMetric.getPlaca());
    Metric metric = truckMetricResponseMapper.toEntity(truckMetric);
    metricApplication.processMetric(metric);
  }
}