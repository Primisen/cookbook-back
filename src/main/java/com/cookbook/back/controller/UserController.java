package com.cookbook.back.controller;

import com.cookbook.back.domain.User;
import com.cookbook.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    public Iterable<User> getUsers() {
        return userService.findAll();
    }
}
