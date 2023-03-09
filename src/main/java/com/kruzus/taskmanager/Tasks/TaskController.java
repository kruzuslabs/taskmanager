package com.kruzus.taskmanager.Tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//@CrossOrigin
@RestController
@RequestMapping("/tasks")
public class TaskController {

    /*
    * users can list all tasks,
    * create a new task,
    * delete a task,
    * update the task,
    *
    * mark for completed: PATCH or PUT
    * */

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


