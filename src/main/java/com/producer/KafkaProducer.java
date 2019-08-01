package com.producer;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;
    @Value("${kafka.topic.order}")
    private String topicOrder;
 
    public void sendMessage(String str) {
        kafkaTemplate.send(topicOrder, str);
    }
}
