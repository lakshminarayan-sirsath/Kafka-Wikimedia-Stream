package com.kafka.wikimeadia.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // create constructor of final var or element
@Slf4j
public class WikimediaProducer {

    // here producer key and volume are string type, in case of json format will change
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg){
//        log.info(String.format("➡️Sending message to topic(name: demo-topic-1, msg: %s)", msg));
        kafkaTemplate.send("wikimeadia-stream", msg);
    }

}
