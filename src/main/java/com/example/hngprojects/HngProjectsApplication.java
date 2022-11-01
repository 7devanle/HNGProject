package com.example.hngprojects;

import com.example.hngprojects.controller.Controller;
import com.example.hngprojects.model.User;
import com.example.hngprojects.repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HngProjectsApplication {

    public static void main(String[] args) {

        SpringApplication.run(HngProjectsApplication.class, args);
    }

}
