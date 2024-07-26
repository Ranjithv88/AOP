package com.SpringBoot.AOP.Controller;

import com.SpringBoot.AOP.Model.User;
import com.SpringBoot.AOP.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class GetController {

//get method in User class
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> User(){
        return userService.UserGetApi();
    }


}

