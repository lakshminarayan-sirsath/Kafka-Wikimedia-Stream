package com.kafka.wikimeadia.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class WikimediaTopicConfig {

    @Bean
    public NewTopic wikimediaStreamTopic () {
        return TopicBuilder
                .name("wikimeadia-stream")
//                .partitions()
//                .replicas()
                .build();
    }
}
