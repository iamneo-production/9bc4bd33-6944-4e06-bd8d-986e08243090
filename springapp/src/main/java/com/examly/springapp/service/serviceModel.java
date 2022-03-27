package com.examly.springapp.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.examly.springapp.model.OrderModel;
import com.examly.springapp.model.OrderDto;
import java.util.List;
import com.examly.springapp.repository.orderUserRepository;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class serviceModel {
    
    public serviceModel(orderUserRepository orderUserRepository) {
    this.orderUserRepository = orderUserRepository;
  }

    @Autowired
    private orderUserRepository orderUserRepository;


        // public List<OrderModel> getAllOrder(){
        //   return orderRepository.findAll();
        //  }
        public List<OrderDto> getAllOrder(){
          return orderUserRepository.findAll()
          .stream()
          .map(this::convert)
          .collect(Collectors.toList());
  
      }
      private OrderDto convert(OrderModel orderModel){
        OrderDto order=new OrderDto();
        order.setId(orderModel.getId());
        order.setName(orderModel.getName());
        order.setStatus(orderModel.getStatus());
        order.setDate(orderModel.getDate());
        return order;
    }
    public void deletedAllOrders(){
    
      orderUserRepository.deleteAll();
     
    }
    public OrderModel getOrderById(int id){
        return orderUserRepository.findById(id).get();
    }
    public OrderModel addOrder( OrderModel orderModel){
      return orderUserRepository.save(orderModel);
  }
    
}
