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

import com.examly.springapp.repository.AdminRepository;
import com.examly.springapp.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class AdminLoginTest {

    @Autowired
    private AdminRepository repo;
    
    
    
  @Test
  public void AdminLoginT() throws Exception {
    boolean actualResult;
     Admin alm=repo.findByEmail("admin@gmail.com");
     if(alm.getPassword().equals("admin@123"))
     {
       actualResult=true;
     }else{
      actualResult=false;
     }
    assertEquals(true,actualResult);
  }
  

}
