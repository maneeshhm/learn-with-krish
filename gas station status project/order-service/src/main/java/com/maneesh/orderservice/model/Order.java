package com.maneesh.orderservice.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity()
@Table(name = "g_order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String orderNumber;
    private String gasStattionName;
    private double capacity;
    private LocalDateTime orderPlacedDate = LocalDateTime.now();
    private LocalDateTime dispatchDate = null;



}
