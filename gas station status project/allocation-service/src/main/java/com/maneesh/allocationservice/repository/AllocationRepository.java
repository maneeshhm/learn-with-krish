package com.maneesh.allocationservice.repository;

import com.maneesh.allocationservice.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllocationRepository extends JpaRepository<Store,Integer> {
}
