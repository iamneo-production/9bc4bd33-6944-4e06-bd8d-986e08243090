package com.examly.springapp.controller;
<<<<<<< HEAD

import com.examly.springapp.model.LoginModel;
import com.examly.springapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.model.LoginModel;
import com.examly.springapp.model.User;
import java.util.Objects;
>>>>>>> 995c8ae9bdd81814bd004d88c56de05b51ce9edd

@CrossOrigin(origins = "*")
@RestController
public class Login {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> loginUser(@RequestBody LoginModel user) {
        if (userService.doesUserExists(user))
            return new ResponseEntity<>("true", HttpStatus.OK);

        return new ResponseEntity<>("false", HttpStatus.OK);
    }


}