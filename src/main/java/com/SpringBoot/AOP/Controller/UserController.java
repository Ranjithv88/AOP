package com.SpringBoot.AOP.Controller;

import com.SpringBoot.AOP.Model.User;
import com.SpringBoot.AOP.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserService service;

    // Get Api From User Class
    @GetMapping("get/users")
    public List<User> get() {
        return service.getApi();
    }

    // Post Api From User class
    @PostMapping("post/users")
    public String post(@RequestBody User user) {
        return service.postApi(user);
    }

}

