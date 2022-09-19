package com.maneesh.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//main method of Order Service
@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String, OrderRequest> kafkaTemplate){
//        return args -> {
//            kafkaTemplate.send("mainTopic",new OrderRequest(0,"Started"));
//        };
//    }
}
