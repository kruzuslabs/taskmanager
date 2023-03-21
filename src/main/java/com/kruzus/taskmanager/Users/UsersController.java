package com.kruzus.taskmanager.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/users")
public class UsersController {
    private final UserRepository userRepository;
    @Autowired
    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<UsersEntity> allUsers() {
        return this.userRepository.findAll();
    }



    // users/profile/id
    // users/profile/123
    // users/profile (returns current profile)

    @GetMapping("/profile")
    public Object profile() {
        return Map.of("msg", "current profile");
    }


    @GetMapping("/profile/{id}")
    public Object findUserByID(@PathVariable long id)   {
        var user = this.userRepository.findById(id);

        System.out.println("VALUE OF USER: " + user);
        System.out.println("USER PRESENTS?: " + user.isPresent());


          return this.userRepository.findById(id);

    }


}
