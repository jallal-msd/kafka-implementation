package com.example.kafkaDemo2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

public class kafkaConsumer {

  @KafkaListener(topics = "KafkaCon", groupId = "kafka_id")

  public void consume(String msg) {
    System.out.println("message = " + msg);
  }
}
