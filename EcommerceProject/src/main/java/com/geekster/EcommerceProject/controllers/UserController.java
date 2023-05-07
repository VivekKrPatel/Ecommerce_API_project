package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.models.Users;
import com.geekster.EcommerceProject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/all")
    public String AddUsers(@RequestBody List<Users> usersList) {
        return userService.insertUsers(usersList);
    }

    @GetMapping(value = "/byId/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}
