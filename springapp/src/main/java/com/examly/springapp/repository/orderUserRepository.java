package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.examly.springapp.model.OrderModel;

@Repository
public interface orderUserRepository extends JpaRepository<OrderModel, Integer> {
    
}
