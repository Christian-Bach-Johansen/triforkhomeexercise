package com.example.triforkhomeexercise.controllers;

import com.example.triforkhomeexercise.domain.User;
import com.example.triforkhomeexercise.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired( required = true)
    UserService service;

    @GetMapping("/getusersbycompany")
    public Iterable<User> getUserByCompany(Long companyId) {
        return service.listByCompany(companyId);
    }

    @PostMapping("/saveuser")
    public User saveUser(@RequestBody User user) {
        return service.save(user);
    }

    @PostMapping("/saveusers")
    public Iterable<User> saveUsers(@RequestBody List<User> users) {
        return service.save(users);
    }

    @GetMapping("/getuser")
    public Optional<User> getUser(Long id) {
        return service.list(id);
    }

    @GetMapping("/getusers")
    public Iterable<User> getUsers() {
        return service.list();
    }
}
