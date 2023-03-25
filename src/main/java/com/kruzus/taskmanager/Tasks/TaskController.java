package com.kruzus.taskmanager.Tasks;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//@CrossOrigin
@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TaskController {


    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/all")
    public List<TasksEntity> allTasks(){


        return this.taskRepository.findOrderDescByID();
}


    @GetMapping("/")
    public Object helloMain(){
        return "lols";
    }

    @PostMapping("/new")
    public TasksEntity createTask(@RequestBody TasksEntity task) {
        // Save the new task in the database using JPA
        return this.taskRepository.save(task);
    }


    //@TODO: Work on Exceptions..,
    @GetMapping("/{id}")
    public Optional<TasksEntity> oneTask(@PathVariable Long id) {

      return this.taskRepository.findById(id);

    }




}


