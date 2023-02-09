package com.example.UserManagement.Serviceb.rest;

import com.example.UserManagement.Serviceb.adapter.repository.UserManagement;
import com.example.UserManagement.Serviceb.rest.dto.UserDTO;
import com.example.UserManagement.Serviceb.rest.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.function.Function;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserManagement userManagement;

    public UserController(UserManagement userManagement) {
        this.userManagement = userManagement;
    }

    @GetMapping("/{id}")
    public Optional<String> UserName(@PathVariable String id) {
        Optional<String> userNameById = userManagement.getUserNameById(id);
        return userNameById;
    }
}
