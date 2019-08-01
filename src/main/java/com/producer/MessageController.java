package com.producer;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
	@Resource
    private KafkaProducer kafkaProducer;
 
    @RequestMapping("/create")
    public Long create() {
    	kafkaProducer.sendMessage("123=======>123");
    	return System.currentTimeMillis();
    }
}
