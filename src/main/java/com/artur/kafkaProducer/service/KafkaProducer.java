package com.artur.kafkaProducer.service;


import com.artur.kafkaProducer.model.MessageEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private final KafkaTemplate<String, MessageEntity> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, MessageEntity> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(MessageEntity messageEntity){
        kafkaTemplate.send("topicTest", messageEntity);
    }


}
