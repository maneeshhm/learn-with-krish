package com.maneesh.allocationservice.kafka;

import com.maneesh.allocationservice.model.Hello;
import com.maneesh.allocationservice.model.MyOrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderConsumer {

//    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
//    public void consumer(MyOrderEvent event){
//        log.info("Order event recived in stock server => %s", event.toString());
//    }

    @KafkaListener(topics = "order_topics",groupId = "allocation_con")
    public void myconsumer(Hello hello){
        log.info("get order %s",hello.toString());
    }

}
