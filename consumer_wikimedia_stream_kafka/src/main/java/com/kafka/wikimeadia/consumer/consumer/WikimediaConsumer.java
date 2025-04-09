package com.kafka.wikimeadia.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

        // Text
    @KafkaListener(topics = "wikimeadia-stream", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(String.format("➡️Consuming the msg from 'demo-topic-1', msg: %s",msg));
        // Please feet free to do anything you want with the data
    }
}
