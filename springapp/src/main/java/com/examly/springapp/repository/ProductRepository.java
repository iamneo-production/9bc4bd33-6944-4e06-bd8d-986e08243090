package com.examly.springapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.Product;
import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
   List<Product> findByProductName(String ProductName);   
}
