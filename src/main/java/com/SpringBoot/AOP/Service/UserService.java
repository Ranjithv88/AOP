package com.SpringBoot.AOP.Service;

import com.SpringBoot.AOP.Model.User;
import com.SpringBoot.AOP.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getApi() {
        return repository.findAll();
    }

    public String postApi(User user) {
        repository.save(user);
        return " Record Save ! ";
    }

}

