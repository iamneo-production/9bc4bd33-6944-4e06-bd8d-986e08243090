package com.examly.springapp.service;
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
