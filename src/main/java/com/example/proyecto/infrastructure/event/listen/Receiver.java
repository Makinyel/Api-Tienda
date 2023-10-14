package com.example.proyecto.infrastructure.event.listen;

import com.example.proyecto.application.truck.TruckApplication;
import com.example.proyecto.domain.model.Truck;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
@Slf4j
public class Receiver {

  private final ObjectMapper objectMapper;
  private final TruckApplication truckApplication;

  public static String RECEIVE_METHOD_NAME = "receiveMessage";

  public void receiveMessage(byte[] message) throws JsonProcessingException {
    String mesajeconvertido = new String(message, StandardCharsets.UTF_8);
    Truck carro = objectMapper.readValue(mesajeconvertido, Truck.class);
    log.info("Receiving message: [{}]",
        objectMapper.writeValueAsString(truckApplication.findById(
            Long.valueOf(carro.getPlaca()))));
  }
}
