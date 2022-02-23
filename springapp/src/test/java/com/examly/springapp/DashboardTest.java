package com.examly.springapp;




import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import static org.assertj.core.api.Assertions.assertThat;
import com.examly.springapp.service.AdminService;
//import org.springframework.test.annotation.Rollback;
import static org.junit.Assert.*;
import java.util.*;

import java.beans.Transient;

import com.examly.springapp.repository.OrderRepository;
import com.examly.springapp.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class DashboardTest {
    @Autowired
    private OrderRepository repo;

    @Test
    public void testOrderCount(){
long orderCount=repo.count();
long count=13;
assertEquals(count,orderCount);
    }

    @Test
    public void testRevenue(){
int revenue=(int)repo.sumPrice();
assertEquals(875,revenue);
    }

    @Test
    public void testCompletedOrder(){
int completedOrder=repo.orderCompletedCount();

assertEquals(0,completedOrder);
    }

}
