/*package com.examly.springapp.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.examly.springapp.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import com.examly.springapp.service.ProductService;
import com.examly.springapp.model.Product;

@RestController
@RequestMapping("/admin")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);

    }
    
    // @PostMapping("/addProducts")
    // public List<Product> addProducts(@RequestBody List<Product> product){
    //     return productService.addProducts(product);

    // }


    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }
    @GetMapping("/productname/{productName}")
    public List<Product> getByProductName(@PathVariable String productName)
    {
        return productService.getByProductName(productName);
    }
     
    @PutMapping("/updateProduct/{productId}")
    public Product updateProducts(@PathVariable Long productId,@RequestBody Product product)
    {
       return  productService.updateProducts(productId,product);
    }
    @DeleteMapping("/deleteAllProducts")
    public String deletedAllProducts()
   {
       productService.deletedAllProducts();
       return "successfully deleted";
   }
   @DeleteMapping("/multipledeleteProducts")
   public String deleteSomeOrder(@RequestBody List<Long> ids){
   for(Long id : ids){
     productService.deleteOrder(id);
    }
    return "deleted successfully";
   }
    @DeleteMapping("/deleteById/{productId}")
    public String deleteProduct(@PathVariable Long productId)
    {
        return productService.deleteProduct(productId);
    }


    
}
*/
package com.examly.springapp.controller;

import org.springframework.ui.Model;
import com.examly.springapp.model.Product;
import com.examly.springapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

@Autowired
private ProductService productService;

//api
//add
@PostMapping("/addProduct")
public Product addProduct(@RequestBody Product product){
    return productService.saveProduct(product);
}

@PostMapping("/admin/addProduct")
public List<Product> addProducts(@RequestBody List<Product> products){
    return productService.saveProducts(products);
}

//view
@GetMapping("/product/{id}")
public Product findProductByID(@PathVariable int id){
    return productService.getProductById(id);
}

@GetMapping("/home")
public List<Product> findAllProductsHome(){
    return productService.getProducts();
}

@GetMapping("/admin")
public List<Product> findAllProductsAdmin(){
    return productService.getProducts();
}

//delete
@DeleteMapping("/admin/delete/{id}")
public String deleteProduct(@PathVariable int id){
    productService.deleteProduct(id);
    return "Product Removed";
}

@DeleteMapping("/multideleteProduct")
public String deleteSomeProduct(@RequestBody List<Integer> ids){
for(int id : ids){
    productService.deleteProduct(id);
}
    return "Products Removed";
}

//update
@PutMapping("/admin/productEdit/{id}")
    public Product updateProduct(@PathVariable int id) {
        return productService.updateProduct(id);
    }


}
