package com.maneesh.allocationservice.model;

//import com.maneesh.orderservice.model.Order;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MyOrderEvent {

    //regarding to kafka
    private String orderStatus;
    private String message;

}
