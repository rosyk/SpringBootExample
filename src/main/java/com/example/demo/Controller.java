package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {
    UserService userService = new UserService();
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/{string}")
    public String getString(@PathVariable String string) {
        return "переданная строка: "+string;
    }

    @PostMapping("/")
    public String postString(@RequestBody String string) {
        System.out.println("переданная строка: "+string);
        return "переданная строка: "+string;
    }

    @PostMapping("/add-user")
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    @GetMapping("/get-users")
    public ArrayList<User> getUsers() {
        return userService.getUsers();
    }
}
