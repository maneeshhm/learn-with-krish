package com.maneesh.orderservice.service;

import com.maneesh.orderservice.dto.OrderRequest;
import com.maneesh.orderservice.kafka.OrderProducer;
import com.maneesh.orderservice.model.Order;
import com.maneesh.orderservice.model.OrderEvent;
import com.maneesh.orderservice.repository.OrderRepository;
import com.maneesh.orderservice.repository.StorageRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;
    private final StorageRepository storageRepository;


    // kafka message

    private final OrderProducer orderProducer;

//    private final OrderEvent orderEvent;



    public String placeOrder(OrderRequest orderRequest){

        String result="hello";
        Order order = new Order();

        OrderEvent orderEvent = new OrderEvent();
        //sending to kafka
        orderEvent.setOrderStatus("Pending");
        orderEvent.setMessage("Order status is in pending");
        orderProducer.sendMessage(orderEvent);

//        if (checkcapacity(orderRequest)){
//
//            order.setOrderNumber(UUID.randomUUID().toString());
//            order.setGasStattionName(orderRequest.getGasStattionName());
//            order.setCapacity(orderRequest.getCapacity());
//            order.setOrderPlacedDate(order.getOrderPlacedDate());
//            order.setDispatchDate(order.getDispatchDate());
//
//            orderRepository.save(order);
//            result = "Order placed successfully";
//
//
//        }else {
//            result = "Sorry fuel capacity is not enough";
//        }
//        return result;

        return "order placed";

    }

     //checking order capacity available or not

    public boolean checkcapacity(OrderRequest orderRequest){
        if (storageRepository.findById(1).get().getVolume() > orderRequest.getCapacity()){
            return true;
        }else {
            return false;
        }
    }

    //get all orders
    public List<Order> getAllOrders() {

        List<Order> orderList = new ArrayList<Order>();
        orderRepository.findAll().forEach(order1 -> orderList.add(order1));

        return orderList;
    }

     //get order by order number
    public List<Order> getOrderByOrderNumber(String orderNumber) {
        return (List<Order>) orderRepository.findByOrderNumber(orderNumber);
    }
}
