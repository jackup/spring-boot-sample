package com.example.demo.controller;

import com.example.demo.data.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String hello() {
        return "wazzup?";
    }

    @GetMapping("/list")
    public List<User> list() {
        return (List<User>) userService.all();
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/name/{name}")
    public Map<String, Boolean> delete(@PathVariable(value = "name")String userName){

        userService.deleteByName(userName);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @PutMapping(value = "/update")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

}
