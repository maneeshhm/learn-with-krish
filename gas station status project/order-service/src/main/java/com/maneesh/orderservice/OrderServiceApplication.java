package com.maneesh.orderservice;

import com.maneesh.orderservice.dto.OrderRequest;
import com.maneesh.orderservice.repository.StorageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class OrderServiceApplication {

    public final StorageRepository storageRepository;

    public OrderServiceApplication(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
