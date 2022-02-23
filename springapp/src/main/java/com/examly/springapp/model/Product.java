package com.examly.springapp.model;

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
