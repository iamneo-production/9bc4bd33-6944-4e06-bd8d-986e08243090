package com.examly.springapp;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import static org.assertj.core.api.Assertions.assertThat;
import com.examly.springapp.service.UserService;

//import org.springframework.test.annotation.Rollback;
import static org.junit.Assert.*;
import java.util.*;

import java.beans.Transient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ForgotPasswordTest {

    @Autowired
    private UserRepository repo;

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    @Test
    public void saveTokenTest() {
        User user = repo.findByEmail("user3@gmail.com");
        if (user != null) {
            user.setResetPasswordToken("token3");
            User saveduser=repo.save(user);
            assertThat(saveduser.getResetPasswordToken()).isEqualTo("token3");
        
        }
    }



    @Test
    public void getUserTest() {
        User user=repo.findByResetPasswordToken("token4");
        assertEquals((long)4,(long)user.getId());
    }



    @Test

public void testUpdatePassword() {
    User user = repo.findByEmail("user4@gmail.com");
    String encodedPassword = passwordEncoder.encode("newPassword");
    user.setPassword(encodedPassword);
    user.setResetPasswordToken("token");
    repo.save(user);
    User updatedUser = repo.findById((long)4).orElse(null);

    

    assertEquals(true,passwordEncoder.matches("newPassword",updatedUser.getPassword()));

    
}

    
   
    
}


