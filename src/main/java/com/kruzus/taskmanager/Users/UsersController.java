package com.kruzus.taskmanager.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
    public Object findUserByID(@PathVariable UUID id) {
      try {
          return this.userRepository.findById(id);
      } catch (Exception _e) {
          return Map.of("error","user not found");
      }
    }

}
