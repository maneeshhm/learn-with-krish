package com.maneesh.allocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AllocationApplication {
    public static void main(String[] args) {
        SpringApplication.run(AllocationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
//        return args -> {
//            kafkaTemplate.send("mainTopic","Hello kafka");
//        };
//    }
}
