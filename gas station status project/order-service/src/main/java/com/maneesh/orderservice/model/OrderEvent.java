package com.maneesh.orderservice.model;

import lombok.*;
import org.springframework.context.annotation.Bean;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEvent {

    //regarding to kafka
    private String orderStatus;
    private String message;
    private Order order;
}
