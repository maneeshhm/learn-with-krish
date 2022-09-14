package com.maneesh.orderservice.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StorageCapacity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fuelType;
    private Double volume;


}
