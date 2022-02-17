package com.examly.springapp.controller;

import com.examly.springapp.model.OrderModel;
//import com.examly.springapp.model.User;
//import com.examly.springapp.model.ProductModel;

//import com.examly.springapp.service.OrderService;
//import com.examly.springapp.service.UserService;
//import com.examly.springapp.service.ProductService;

import com.examly.springapp.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
public class dashboard {
 

@Autowired
private OrderRepository orderRepository; 

/*@Autowired
private OrderRepository userRepository; 

@GetMapping("/UserCount")
public long UserCount(){
    return userRepository.count();
}*/

@GetMapping("/orderCount")
public long OrderCount(){
    return orderRepository.count();
}

@GetMapping("/revenue")
public double revenue(){
		return orderRepository.sumPrice();
}

@GetMapping("/orderCompleted")
public int orderCompleted(){
		return orderRepository.orderCompletedCount();
}


}
