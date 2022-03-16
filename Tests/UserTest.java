package com.examly.springapp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import java.util.*;
import java.beans.Transient;
import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserTest{
   @Autowired
   private UserRepository repo;
   @Test
   public void testCreateUser(){
       User user=new User("user1@gmail.com","user1@123","user1","7898678767",true,"user","g7grtuh8");
       User saveduser=repo.save(user);
       assertNotNull(saveduser);
   }
   @Test
   public void testCreateUsers(){
    User user=new User("user1@gmail.com","user1@123","user1","7898678767",true,"user","g7grtuh8");
    User user2=new User("user1@gmail.com","user1@123","user1","7898678767",true,"user","g7grtuh8");
    User savedUser;
       savedUser=repo.save(user);
       savedUser=repo.save(user);
       assertNotNull(savedUser);
   }
@Test
public void testGetUser() {
    User user=repo.findById((long)1).orElse(null);
    assertEquals((long)1,(long)user.getId());
}
@Test
public void testListUser() {
    List<User> users = (List<User>) repo.findAll();
    assertThat(users).size().isGreaterThan(0);
}
@Test
public void testUpdateUser() {
    User user = repo.findById((long)1).orElse(null);
    user.setUsername("user2");
    repo.save(user);
    User updatedUser = repo.findById((long)1).orElse(null);
    assertThat(updatedUser.getUsername()).isEqualTo("user2");
}
@Test
public void testDeleteUser() {
    User user = repo.findById((long)1).orElse(null);
    repo.deleteById(user.getId());
    User deletedUser = repo.findById((long)1).orElse(null);
    assertThat(deletedUser).isNull();           
}
@Test
public void testDeleteUsers() {
    User user = repo.findById((long)1).orElse(null);
    User user2 = repo.findById((long)2).orElse(null);
    repo.deleteById(user.getId());
    repo.deleteById(user2.getId());
    User deletedUser; 
     deletedUser = repo.findById((long)1).orElse(null);
     deletedUser = repo.findById((long)2).orElse(null);
    assertThat(deletedUser).isNull();           
}
}