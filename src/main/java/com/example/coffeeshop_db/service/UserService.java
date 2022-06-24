package com.example.coffeeshop_db.service;

import com.example.coffeeshop_db.model.dtos.UserLoginDTO;
import com.example.coffeeshop_db.model.dtos.UserRegistrationDTO;

public interface UserService {

    boolean registerUser(UserRegistrationDTO userRegisterDto);

    boolean loginUser(UserLoginDTO userLoginDTO);

    void logout();
}

