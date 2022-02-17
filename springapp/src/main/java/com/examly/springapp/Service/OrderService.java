package com.examly.springapp.service;

import com.examly.springapp.model.OrderModel;
import com.examly.springapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service

public class OrderService {
@Autowired
private OrderRepository repository; 

public OrderModel saveOrder(OrderModel order){
    return repository.save(order);
}
 
public List<OrderModel> saveOrders(List<OrderModel> orders){
    return repository.saveAll(orders);
}

public OrderModel getOrderById(int id){
    return repository.findById(id).orElse(null);
}


public List<OrderModel> getOrders(){
    return repository.findAll();
}



public void deleteOrder(int id){
    repository.deleteById(id);
    
}
 



public OrderModel updateName(OrderModel order){
    OrderModel existingOrder=repository.findById(order.getId()).orElse(null);
    existingOrder.setName(order.getName());
    return repository.save(existingOrder);
}

public OrderModel updateAddress(OrderModel order){
    OrderModel existingOrder=repository.findById(order.getId()).orElse(null);
    existingOrder.setAddress(order.getAddress());
    return repository.save(existingOrder);
}

public OrderModel updateNumber(OrderModel order){
    OrderModel existingOrder=repository.findById(order.getId()).orElse(null);
    existingOrder.setPhoneNumber(order.getPhoneNumber());
    return repository.save(existingOrder);
}

public OrderModel updateStatus(OrderModel order){
    OrderModel existingOrder=repository.findById(order.getId()).orElse(null);
    existingOrder.setStatus(order.getStatus());
    return repository.save(existingOrder);
}


}
