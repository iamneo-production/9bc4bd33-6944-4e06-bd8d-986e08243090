package com.examly.springapp;




import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import static org.assertj.core.api.Assertions.assertThat;
//import org.springframework.test.annotation.Rollback;
import static org.junit.Assert.*;
import java.util.*;

import java.beans.Transient;

import com.examly.springapp.repository.OrderRepository;
import com.examly.springapp.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class OrderTest{

   @Autowired
   private OrderRepository repo;

   @Test
   public void testCreateOrder(){
       OrderModel order=new OrderModel(78,"snigdha","regrg",(long)568952456,67,9,89.78,"Completed");
       OrderModel savedOrder=repo.save(order);
       assertNotNull(savedOrder);
   }


   @Test
   public void testCreateOrders(){
       OrderModel order=new OrderModel(78,"snigdha","regrg",(long)568952456,67,9,89.78,"Completed");
       OrderModel order2=new OrderModel(78,"snigdha","regrg",(long)568952456,67,9,89.78,"Completed");
       OrderModel savedOrder;
       savedOrder=repo.save(order);
       savedOrder=repo.save(order2);
       assertNotNull(savedOrder);
   }


   
@Test
public void testGetOrder() {
    OrderModel order=repo.findById(7).orElse(null);
    assertEquals(7,order.getId());
}

@Test
public void testListOrders() {
    List<OrderModel> orders = (List<OrderModel>) repo.findAll();
    assertThat(orders).size().isGreaterThan(0);
}

@Test

public void testUpdateOrder() {
    OrderModel order = repo.findById(7).orElse(null);
    order.setName("Roja");
     
    repo.save(order);
     
    OrderModel updatedOrder = repo.findById(7).orElse(null);
     
    assertThat(updatedOrder.getName()).isEqualTo("Roja");
}


@Test

public void testDeleteOrder() {
    OrderModel order = repo.findById(7).orElse(null);
     
    repo.deleteById(order.getId());
     OrderModel deletedOrder = repo.findById(7).orElse(null);
     
    assertThat(deletedOrder).isNull();       
     
}

@Test

public void testDeleteOrders() {
    OrderModel order = repo.findById(7).orElse(null);
    OrderModel order2 = repo.findById(8).orElse(null);
     
    repo.deleteById(order.getId());
    repo.deleteById(order2.getId());
     OrderModel deletedOrder; 
     deletedOrder = repo.findById(7).orElse(null);
     deletedOrder = repo.findById(8).orElse(null);
     
    assertThat(deletedOrder).isNull();       
     
}


}
