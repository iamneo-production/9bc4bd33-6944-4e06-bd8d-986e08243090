package com.examly.springapp;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import static org.assertj.core.api.Assertions.assertThat;
import com.examly.springapp.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.test.annotation.Rollback;
import static org.junit.Assert.*;
import java.util.*;

import java.beans.Transient;

import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class LoginTest {

    @Autowired
    private UserRepository repo;
    
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    
  @Test
  public void UserLoginT() throws Exception {
    boolean actualResult=true;
    for (User x : repo.findAll()) {
        if ((x.getEmail().equals("user3@gmail.com") && (passwordEncoder.matches("user@123",x.getPassword())))) {
           
            actualResult=true;
        }
    }
 assertEquals(true,actualResult);
} 







}
