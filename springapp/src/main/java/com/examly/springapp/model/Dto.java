package com.examly.springapp.model;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dto {
    private Long id;
    private String email;
    private String username;
    private String mobileNumber;
   

    // Ud(){}
    // public Ud(Long id, String email, String username, String mobileNumber) {
    //     this.id = id;
    //     this.email = email;
    //     this.username = username;
    //     this.mobileNumber = mobileNumber;
    // }
    // public Long getId() {
    //     return id;
    // }
    // public void setId(Long id) {
    //     this.id = id;
    // }
    // public String getEmail() {
    //     return email;
    // }
    // public void setEmail(String email) {
    //     this.email = email;
    // }
    // public String getUsername() {
    //     return username;
    // }
    // public void setUsername(String username) {
    //     this.username = username;
    // }
    // public String getMobileNumber() {
    //     return mobileNumber;
    // }
    // public void setMobileNumber(String mobileNumber) {
    //     this.mobileNumber = mobileNumber;
    // }

}
