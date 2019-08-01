package com.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "${kafka.topic.order}", containerFactory = "kafkaListenerContainerFactory")
    public void consume(@Payload String message) {
       System.err.println("recv==>" + message);
    }
}
