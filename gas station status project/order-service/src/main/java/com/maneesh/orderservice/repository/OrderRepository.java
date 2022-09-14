package com.maneesh.orderservice.repository;

import com.maneesh.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findByOrderNumber(String orderNumber);
//    List<String> findByOrderNumber();
}
