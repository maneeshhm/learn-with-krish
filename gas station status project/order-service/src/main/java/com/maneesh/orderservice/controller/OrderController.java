package com.maneesh.orderservice.controller;

import com.maneesh.orderservice.dto.OrderRequest;
import com.maneesh.orderservice.kafka.OrderProducer;
import com.maneesh.orderservice.model.Order;
//import com.maneesh.orderservice.model.StorageCapacity;
import com.maneesh.orderservice.model.StorageCapacity;
import com.maneesh.orderservice.service.OrderService;
//import com.maneesh.orderservice.service.StorageService;
import com.maneesh.orderservice.service.StorageService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order/")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    //RequestBody getting json object as input
    public String placeOrder(@RequestBody OrderRequest orderRequest){

        orderService.placeOrder(orderRequest);
//        return " Order Placed successfully";
        return orderService.placeOrder(orderRequest);
    }


    //get all orders

    @GetMapping
    @ResponseStatus(HttpStatus.OK)

    public List<Order> getAllOrders(){
        return  orderService.getAllOrders();
    }

    //getting specific order using order number
    @GetMapping("{orderNumber}")
    @ResponseStatus(HttpStatus.OK)
    public List<Order> getSpeOrder(@PathVariable("orderNumber") String orderNumber){
        return orderService.getOrderByOrderNumber(orderNumber);
    }


    public final StorageService storageService;




}
