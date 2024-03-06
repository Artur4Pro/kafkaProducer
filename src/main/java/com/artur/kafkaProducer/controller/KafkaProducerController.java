package com.artur.kafkaProducer.controller;

import com.artur.kafkaProducer.model.MessageEntity;
import com.artur.kafkaProducer.service.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

    private final KafkaProducer kafkaProducer;

    public KafkaProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/sendMessage")
    public ResponseEntity<String> kafkaMessage(@RequestBody MessageEntity messageEntity){
        kafkaProducer.sendMessage(messageEntity);
        return ResponseEntity.ok("Success");
    }
}
