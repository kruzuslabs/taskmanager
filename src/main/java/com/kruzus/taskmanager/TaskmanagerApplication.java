package com.kruzus.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class TaskmanagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskmanagerApplication.class, args);
    }
<<<<<<< HEAD
=======


    @GetMapping("/")
    public Object index() {
        return Map.of("msg", "hey");
    }

>>>>>>> 168a55f9751e05db8837db0ea0d4f1b1be89e909
}
