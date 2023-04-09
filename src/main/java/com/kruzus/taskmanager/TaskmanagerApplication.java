package com.kruzus.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
// @CrossOrigin(origins = "*", allowedHeaders = "*")
public class TaskmanagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskmanagerApplication.class, args);
    }
}
