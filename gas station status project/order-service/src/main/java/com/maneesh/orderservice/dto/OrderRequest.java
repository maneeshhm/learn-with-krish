package com.maneesh.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    private int id;
    private String gasStattionName;
    private double capacity;
    private LocalDateTime orderPlacedDate;
    private LocalDateTime dispatchDate;

}
