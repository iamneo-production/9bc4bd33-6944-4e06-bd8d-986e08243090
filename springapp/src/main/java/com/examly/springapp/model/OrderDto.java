package com.examly.springapp.model;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private int id;
    private String name;
     @JsonFormat(pattern="dd-MM-yyyy",shape=Shape.STRING)
    private Date date = new Date();
    private String status;
}
