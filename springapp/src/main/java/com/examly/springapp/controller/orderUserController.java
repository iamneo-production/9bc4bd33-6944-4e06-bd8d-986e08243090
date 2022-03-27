package com.examly.springapp.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import com.examly.springapp.service.serviceModel;
import com.examly.springapp.model.OrderModel;
import com.examly.springapp.model.OrderDto;
import com.examly.springapp.repository.orderUserRepository;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
@CrossOrigin(origins="*")

@RestController
public class orderUserController {
    
    public orderUserController(serviceModel serviceModel) {
        this.serviceModel = serviceModel;
    }

    
    @Autowired
    private serviceModel serviceModel;
 

  
    @GetMapping("/Orders")
    public List<OrderDto> Orders() {
        return serviceModel.getAllOrder();
    }

    @GetMapping("/Order/{id}")
    public OrderModel findOrderID(@PathVariable int id){
        return serviceModel.getOrderById(id);
    }
    @PostMapping("/addOrder")
    public OrderModel addOrder(@RequestBody OrderModel orderModel)
    {
        return serviceModel.addOrder(orderModel);
    }  
    @DeleteMapping("/deleteAllOrders")
    public String deletedAll()
   {
    serviceModel.deletedAllOrders();
       return "deleted successfully";
       
   }
}
