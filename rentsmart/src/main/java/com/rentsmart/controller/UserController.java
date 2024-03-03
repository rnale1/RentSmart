package com.rentsmart.controller;

import com.rentsmart.model.User;
import com.rentsmart.model.UserRequest;
import com.rentsmart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService _userService){
        userService = _userService;
    }

    @GetMapping("/user/getAll")
    public List<com.rentsmart.model.User> GetTickets(){
        return userService.getAllUsers();
    }

    @PostMapping("/user/create")
    public User CreateUser(@RequestBody UserRequest userRequest){

        User mappedUser = userService.convertUser(userRequest);
        return userService.createUser(mappedUser);

    }
}
