/*package com.examly.springapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.examly.springapp.repository.ProductRepository;
import com.examly.springapp.model.Product;
import java.util.List;
import com.examly.springapp.service.ProductService;
import com.examly.springapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    public Product addProduct(Product product)
    {
        return productRepository.save(product);

    }
    public Product updateProducts(Long productId ,Product product)
    {
        Product prevProduct=productRepository.findById(productId).get();
        prevProduct.setProductName(product.getProductName());
        prevProduct.setPrice(product.getPrice());
        prevProduct.setQuantity(product.getQuantity());
        prevProduct.setImageUrl(product.getImageUrl());
        
        return productRepository.save(prevProduct);
    }
    public void deletedAllProducts(){
    
        productRepository.deleteAll();
       
    }
    // public List<Product> addProducts(List<Product> product)
    // {
    //     return productRepository.saveAll(product);
    // }
    public List<Product> getByProductName(String productName)
    {
        return productRepository.findByProductName(productName);
    }
    public void deleteOrder(Long productId){
        productRepository.deleteById(productId);
        
    }

    public String deleteProduct(Long productId)
    {
    productRepository.deleteById(productId);
    return "deleted successfully";
    }
}
*/
package com.examly.springapp.service;

import com.examly.springapp.model.Product;
import com.examly.springapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductService {

@Autowired
private ProductRepository repository; 

//service methods
//add

public Product saveProduct(Product product){
    return repository.save(product);
}
 
public List<Product> saveProducts(List<Product> products){
    return repository.saveAll(products);
}

//view
public Product getProductById(int id){
    return repository.findById(id).orElse(null);
}

public List<Product> getProducts(){
    return repository.findAll();
}

//delete
public void deleteProduct(int id){
    repository.deleteById(id);
    
}

//update
public Product updateProduct(int id) {
    Product existingProduct = repository.findById(id).orElse(null);
    Product product = repository.findById(id).orElse(null);
    existingProduct.setStatus(product.getStatus());
    existingProduct.setStock(product.getStock());
    existingProduct.setPrice(product.getPrice());
    return repository.save(existingProduct);
}

 
}
