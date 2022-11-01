package com.example.hngprojects.controller;

import com.example.hngprojects.model.User;
import com.example.hngprojects.repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class Controller {

    @Autowired
    private Repository repo;

    @GetMapping("")
    public List<User> getAll(){
        return repo.findAll();
    }

    @PostMapping("/create")
    public User addUsers(@RequestBody User user){
        return repo.save(user);
    }

}
