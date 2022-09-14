package com.maneesh.orderservice.repository;

import com.maneesh.orderservice.model.StorageCapacity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StorageRepository extends JpaRepository<StorageCapacity, Integer> {


}
