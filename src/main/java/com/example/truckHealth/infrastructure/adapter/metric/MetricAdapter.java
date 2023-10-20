package com.example.truckHealth.infrastructure.adapter.metric;

import com.example.truckHealth.domain.model.Metric;
import com.example.truckHealth.domain.service.metric.MetricService;
import com.example.truckHealth.infrastructure.mapper.MetricDtoMapper;
import com.example.truckHealth.infrastructure.repository.metric.MetricRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MetricAdapter implements MetricService {

  private final MetricRepository metricRepository;
  private final MetricDtoMapper metricMapper;

  @Override
  public void saveMetric(Metric metric) {
    metricRepository.save(metricMapper.toDto(metric));
  }
}
