/*package com.examly.springapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Product {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long productId;
    private String productName;
    private Double  price;
    private String quantity;
    private String imageUrl;
}
*/
package com.examly.springapp.model;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "products")
public class Product{


    //tables

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;

    @Column(name="product_name")
    private String productName;

    @Column(name="image")
    private String image;

    @Column(name="price")
    private double price;

    @Column(name="stock")
    private int stock;

    @Column(name="status")
    private String status;


    //Constructor

    public Product(){}
    public Product(String productName,String image,Double price,int stock,String status){
        this.productName = productName;
        this.image=image;
        this.price = price;
        this.stock = stock;
        this.status=status;
    }
   
    //setter method
    
    public void setId(int id){
        this.id = id;
    }

    public void setName(String productName){
        this.productName = productName;
    }

    public void setDate(String image){
        this.image = image;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setStatus(String status){
        this.status = status;
    }


    //getter method
    
    public int getId(){
        return this.id;
    }

    public String getProductName(){
       return this.productName;
    }

    public String getImage(){
        return this.image;
    } 

    public int getStock(){
       return this.stock;
    }

    public double getPrice(){
       return this.price;
    }

    public String getStatus(){
        return this.status;
    }
   
}
