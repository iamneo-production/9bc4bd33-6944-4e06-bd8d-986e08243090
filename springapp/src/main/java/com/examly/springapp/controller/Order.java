package com.examly.springapp.controller;

import com.examly.springapp.model.OrderModel;
import com.examly.springapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class Order {

@Autowired
private OrderService service;

@PostMapping("/addOrder")
public OrderModel addOrder(@RequestBody OrderModel order){
    return service.saveOrder(order);
}

@PostMapping("/addOrders")
public List<OrderModel> addOrders(@RequestBody List<OrderModel> orders){
    return service.saveOrders(orders);
}

@GetMapping("/Order/{id}")
public OrderModel findOrderByID(@PathVariable int id){
    return service.getOrderById(id);
}

@GetMapping("/Orders")
public List<OrderModel> findAllOrders(){
    return service.getOrders();
}

@PutMapping("/updateName")
public OrderModel updateName(@RequestBody OrderModel order){
    return service.updateName(order);
}

@PutMapping("/updateAddress")
public OrderModel updateAddress(@RequestBody OrderModel order){
    return service.updateAddress(order);
}

@PutMapping("/updateNumber")
public OrderModel updateNumber(@RequestBody OrderModel order){
    return service.updateNumber(order);
}

@PutMapping("/updateStatus")
public OrderModel updateStatus(@RequestBody OrderModel order){
    return service.updateStatus(order);
}

@DeleteMapping("/delete/{id}")
public String deleteOrder(@PathVariable int id){
    service.deleteOrder(id);
    return "Order Removed";
}

@DeleteMapping("/multidelete")
public String deleteSomeOrder(@RequestBody List<Integer> ids){
for(int id : ids){
    service.deleteOrder(id);
}
    return "Orders Removed";
}


}
