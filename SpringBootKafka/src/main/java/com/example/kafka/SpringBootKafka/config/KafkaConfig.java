package com.example.kafka.SpringBootKafka.config;

import com.example.kafka.SpringBootKafka.constant.*;
import org.apache.kafka.clients.admin.*;
import org.springframework.context.annotation.*;
import org.springframework.kafka.config.*;

@Configuration
public class KafkaConfig {
// Topic name is created and name is "cab-location"
    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(AppConstant.CAB_LOCATION)
                .build();
    }
}
