package com.examly.springapp.controller;

import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin(origins = "*")
@RestController
public class DashboardController {
 

@Autowired
private OrderRepository orderRepository; 

@Autowired
private UserRepository userRepository; 

@GetMapping("/userCount")
public long UserCount(){
    return userRepository.count();
}

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
