package com.examly.springapp.model;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Long id;
    private String name;
    private String date;
    private String status;
}
