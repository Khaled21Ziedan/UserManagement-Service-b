package com.example.UserManagement.Serviceb.adapter.repository.impl;

import com.example.UserManagement.Serviceb.adapter.repository.UserManagement;
import com.example.UserManagement.Serviceb.rest.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserManagementInMemory implements UserManagement {
    Map<String, User> users = new HashMap() {
        {
            put("1000", User.builder().id("1000").name("Khaled").age(20).build());
            put("1001", User.builder().id("1001").name("Ahmad").age(21).build());
        }
    };

    @Override
    public Optional<String> getUserNameById(String id) {
        return Optional.ofNullable(users.get(id).getName());
    }
}
