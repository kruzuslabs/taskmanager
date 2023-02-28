package com.kruzus.taskmanager.Tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@CrossOrigin
@RestController
@RequestMapping("/tasks")
public class TaskController {


    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/all")
    public List<TasksEntity> allTasks(){

        return this.taskRepository.findAll();
}


    //@TODO: Work on Exceptions..,
    @GetMapping("/{id}")
    public Optional<TasksEntity> oneTask(@PathVariable Long id) {
        return this.taskRepository.findById(id);
    }

}


