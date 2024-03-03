package com.rentsmart.service;

import com.rentsmart.model.UserRequest;
import com.rentsmart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rentsmart.model.User;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository _userRepository){
        userRepository = _userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User createUser(User user){
        User createduser = userRepository.save(user);
        return createduser;
    }

    public User convertUser(UserRequest userRequest){
        User user = new User();
        user.fullName = userRequest.fullName;
        user.email =  userRequest.email;
        user.phoneNumber = userRequest.phoneNumber;
        user.dateOfBirth = userRequest.dateOfBirth;
        user.password  = userRequest.password;
        return user;
    }
}
