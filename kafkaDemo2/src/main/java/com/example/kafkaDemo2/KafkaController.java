package com.example.kafkaDemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * KafkaController
 */
@RestController
public class KafkaController {

  @Autowired
  KafkaTemplate<String, String> kafkaTemplate;
  private static final String TOPIC = "testTopic";

  @GetMapping("/api/{msg}")
  public String publishMessage(@PathVariable("msg") final String msg) {

    kafkaTemplate.send(TOPIC, msg);
    return "published Successfuly";
  }
}
