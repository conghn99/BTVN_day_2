package com.example.btvn_day_2.controller;

import com.example.btvn_day_2.model.UserDTO;
import com.example.btvn_day_2.request.InsertRequest;
import com.example.btvn_day_2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("login")
    public UserDTO postUser(@RequestBody InsertRequest request) {
        return userService.getUser(request);
    }
}
