package com.springbootangular.bootangular;

import com.springbootangular.bootangular.model.User;
import com.springbootangular.bootangular.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // standard constructors

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PostMapping("/updateUser")
    void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PostMapping("/deleteUser")
    void deleteUser(@RequestBody User user) {
        userRepository.delete(user);
    }
}