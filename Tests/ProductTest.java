package com.examly.springapp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import java.util.*;
import java.beans.Transient;
import com.examly.springapp.repository.ProductRepository;
import com.examly.springapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ProductTest{
   @Autowired
   private ProductRepository repo;
   @Test
   public void testCreateProduct(){
       Product product=new Product("product1","url1",320.0,7,"avaliable");
       Product savedproduct=repo.save(product);
       assertNotNull(savedproduct);
   }
   @Test
   public void testCreateProducts(){
    Product product=new Product("product1","url1",320.0,7,"avaliable");
    Product product2=new Product("product1","url1",320.0,7,"avaliable");
    Product savedProduct;
       savedProduct=repo.save(product);
       savedProduct=repo.save(product2);
       assertNotNull(savedProduct);
   }
@Test
public void testGetProduct() {
    Product product=repo.findById(1).orElse(null);
    assertEquals(1,product.getId());
}
@Test
public void testListProducts() {
    List<Product> products = (List<Product>) repo.findAll();
    assertThat(products).size().isGreaterThan(0);
}
@Test
public void testUpdateProduct() {
    Product product = repo.findById(1).orElse(null);
    product.setName("product2");
    repo.save(product);
    Product updatedProduct = repo.findById(1).orElse(null);    
    assertThat(updatedProduct.getProductName()).isEqualTo("product2");
}
@Test
public void testDeleteProduct() {
    Product product = repo.findById(1).orElse(null);
    repo.deleteById(product.getId());
    Product deletedProduct = repo.findById(1).orElse(null);
    assertThat(deletedProduct).isNull();       
}
@Test
public void testDeleteProducts() {
    Product product = repo.findById(1).orElse(null);
    Product product2 = repo.findById(2).orElse(null);
    repo.deleteById(product.getId());
    repo.deleteById(product2.getId());
    Product deletedProduct; 
     deletedProduct = repo.findById(1).orElse(null);
     deletedProduct = repo.findById(2).orElse(null);    
    assertThat(deletedProduct).isNull();       
}
}